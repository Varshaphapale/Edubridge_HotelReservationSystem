import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent {
  invalidCredentials=false;
  constructor(private router: Router) {}
  onSubmit(): void {
 
  //   if (this.userName === 'Admin' && this.userPassword === 'admin123') {
      this.router.navigate(['/user-header']);
  //   } else {
  //     this.invalidCredentials = true;
    
    
  // }
}
}
