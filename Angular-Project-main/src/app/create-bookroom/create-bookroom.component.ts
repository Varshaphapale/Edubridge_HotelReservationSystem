import { Component, OnInit } from '@angular/core';
import { Room } from '../room';
import { BookroomService } from '../bookroom.service';
import { Router } from '@angular/router';
import { Bookroom } from '../bookroom';

@Component({
  selector: 'app-create-bookroom',
  templateUrl: './create-bookroom.component.html',
  styleUrls: ['./create-bookroom.component.css']
})
export class CreateBookroomComponent implements OnInit{
  room: Bookroom= new Bookroom();
  constructor(private bookroomService: BookroomService,private router: Router){}
  
  ngOnInit(): void {
      
  }
  saveRoom()
  {
    this.bookroomService['createBookRoom'](this.room).subscribe( (data: any)=>
    {
      console.log(data);
      this.goToRoomList();

    },
    (error:any)=>
    console.log(error));
  }
    goToRoomList()
    {
    this.router.navigate(['/user']);
  }
  onSubmit()
  {
    console.log(this.room);
    this.saveRoom();
    alert("Booking Successful")
    this.router.navigate(['/home']);
  }

}


// import { Component, OnInit } from '@angular/core';
// import { Room } from '../room';
// import { UserService } from '../user.service';
// import { Router } from '@angular/router';
// import { RoomService } from '../room.service';

// @Component({
//   selector: 'app-create-room',
//   templateUrl: './create-room.component.html',
//   styleUrls: ['./create-room.component.css']
// })
// export class CreateroomComponent implements OnInit {
//   room: Room= new Room();
//   //UserService: any;
  
// }