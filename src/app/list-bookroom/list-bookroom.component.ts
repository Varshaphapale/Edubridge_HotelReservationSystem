import { Component, OnInit } from '@angular/core';
import { Bookroom } from '../bookroom';
// import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { BookroomService } from '../bookroom.service';
// import { RoomService } from '../room.service';

@Component({
  selector: 'app-list-bookroom',
  templateUrl: './list-bookroom.component.html',
  styleUrls: ['./list-bookroom.component.css']
})
export class BookroomComponent implements OnInit{
  bookroom!:Bookroom[];
  //Room: any;
  constructor(private bookroomService:BookroomService,private router:Router){}
  ngOnInit(): void {
      this.getbookRoom();
  }
  private getbookRoom()
  {
    this.bookroomService.getBookRoomList().subscribe(data=>
      {
        this.bookroom=data;
      }
      );
  }
 BookRooms(id:number)
  {
    this.router.navigate(['bookroom',id]);
  }
  updateBookRooms(id:number)
  {
    this.router.navigate(['update-bookRoom',id]);
  }
  deleteBookRooms(id:number)
  {
    this.bookroomService.deleteBookRoomById(id).subscribe(data=>
      {
        console.log(data);
        this.getbookRoom
      }
      )
  }
 }