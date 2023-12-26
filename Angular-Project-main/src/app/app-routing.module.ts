import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListUserComponent } from './list-user/list-user.component';
import { CreateUserComponent } from './create-user/create-user.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { UserHeaderComponent } from './user-header/user-header.component';
import { AdminHeaderComponent } from './admin-header/admin-header.component';
import { RoomDetailsComponent } from './room-details/room-details.component';
import { RoomListComponent } from './room-list/room-list.component';
import { CreateUserinfoComponent } from './create-userinfo/create-userinfo.component';
import { ListUserinfoComponent } from './list-userinfo/list-userinfo.component';
import { UpdateUserinfoComponent } from './update-userinfo/update-userinfo.component';
import { UserinfoComponent } from './userinfo/userinfo.component';
import { UpdateRoomComponent } from './update-room/update-room.component';
// import { ListBookroomComponent } from './list-bookroom/list-bookroom.component';
import { CreateBookroomComponent } from './create-bookroom/create-bookroom.component';
import { UpdateBookroomComponent } from './update-bookroom/update-bookroom.component';
import { DetailsBookroomComponent } from './details-bookroom/details-bookroom.component';
import { BookroomComponent } from './list-bookroom/list-bookroom.component';
import { ViewRoomComponent } from './view-room/view-room.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { UserLoginComponent } from './user-login/user-login.component';


const routes: Routes = [
  {path:'home',component:HomeComponent},

  // {path:'users',component:ListUserComponent},
  {path:'users',component:ListUserComponent},
  {path:'create-user',component:CreateUserComponent},
  {path:'update-user/:id',component:UpdateUserComponent},
  {path:'user-details/:id',component:UserDetailsComponent},
  {path:'login',component:LoginComponent},
  {path:'user-login',component:UserLoginComponent},
  {path:'registration',component:RegistrationComponent},

  {path:'',redirectTo:'home',pathMatch:'full'},
  {path:'user-header',component:UserHeaderComponent},

  {path:'userinfo',component:ListUserinfoComponent},
  {path:'create-userinfo',component:CreateUserinfoComponent},
  {path:'update-userinfo/:id',component:UpdateUserinfoComponent},
  {path:'userinfo/:id',component:UserinfoComponent},

  {path:'room',component:RoomListComponent},
  {path:'create-room',component:CreateUserComponent},
  {path:'update-room/:id',component:UpdateRoomComponent},
  {path:'room-details/:id',component:RoomDetailsComponent},
  {path:'view-room',component:ViewRoomComponent},

  {path:'bookroom',component: BookroomComponent},
  {path:'create-bookroom',component:CreateBookroomComponent},
  {path:'update-bookroom/:id',component:UpdateBookroomComponent},
  {path:'bookroom-details/:id',component:DetailsBookroomComponent},
  
  {path:'aboutus',component:AboutusComponent},
  {path:'contactus',component:ContactusComponent},
  {path:'feedback',component:FeedbackComponent},

  {path:'admin-header',component:AdminHeaderComponent},
  // {path:'create-user',component:CreateUserComponent},

  // {path:'update-user/:id',component:UpdateUserComponent},
  // {path:'user-details/:id',component:UserDetailsComponent},
  // {path:'login',component:LoginComponent},
 
  // {path:'registration',component:RegistrationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
