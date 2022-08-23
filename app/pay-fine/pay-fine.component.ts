import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-pay-fine',
  templateUrl: './pay-fine.component.html',
  styleUrls: ['./pay-fine.component.css']
})
export class PayFineComponent implements OnInit {

  constructor( private ps:LibraryService, private route:Router) { }
  
  insertPayfine(insertpayfine:any){
   this.ps.insertPayfine1(insertpayfine.value).subscribe(response=>{
    alert("PayFine Added Successfull!!");
    sessionStorage.setItem('loggedInUserDetails',JSON.stringify(response))
    console.log(sessionStorage.getItem('loggedInUserDetails'));
    // console.log(JSON.parse(sessionStorage.getItem('loggedInUserDetails')));      
    
  },error=>alert("Invalid Credentials!! Please try again"));
  }
 
  ngOnInit(): void {
  }

}
