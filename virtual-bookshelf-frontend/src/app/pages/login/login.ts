import { Component } from '@angular/core';
import { DefaultLoginLayoutComponent } from '../../components/default-login-layout/default-login-layout';

@Component({
  selector: 'app-login',
  imports: [
    DefaultLoginLayoutComponent
  ],
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class LoginComponent {

}
