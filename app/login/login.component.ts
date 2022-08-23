import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LibraryService } from '../library.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
 
  constructor(private ps:LibraryService, private route:Router) {
  }
  insertLogin(insert:any){
   this.ps.insertLogin(insert.value).subscribe(response=>{
     alert("Login Successfull!!");
     sessionStorage.setItem('loggedInUserDetails',JSON.stringify(response))
     console.log(sessionStorage.getItem('loggedInUserDetails'));
     // console.log(JSON.parse(sessionStorage.getItem('loggedInUserDetails')));      
     this.route.navigate(['AdminNavigation']);
     
   },error=>alert("Invalid Credentials!! Please try again"));
 }

 ngOnInit(): void {
 }

}
