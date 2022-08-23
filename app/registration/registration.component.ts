import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LibraryService } from '../library.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor(private ps:LibraryService, private router:Router) { }

  insertRegister(insertregister:any){
    this.ps.insertRegister1(insertregister.value).subscribe(response=>{
      console.log(insertregister);
      alert("Registration Successfull!!");
      this.router.navigate(['loginc']);
    },error=>alert("Registration not successfull!! Please try again"));
  }
  ngOnInit(): void {
  
  }
  


}
