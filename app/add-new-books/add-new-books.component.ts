import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LibraryService } from '../library.service';

@Component({
  selector: 'app-add-new-books',
  templateUrl: './add-new-books.component.html',
  styleUrls: ['./add-new-books.component.css']
})
export class AddNewBooksComponent implements OnInit {

  constructor( private ps:LibraryService, private route:Router) { }
  
  insertAddnewbook(insertaddnewbook:any){
   this.ps.insertAddnewbook1(insertaddnewbook.value).subscribe(response=>{
    alert("Add New Books Successfull!!");
    sessionStorage.setItem('loggedInUserDetails',JSON.stringify(response))
    console.log(sessionStorage.getItem('loggedInUserDetails'));
    // console.log(JSON.parse(sessionStorage.getItem('loggedInUserDetails')));      
    
  },error=>alert("Invalid Credentials!! Please try again"));

  }
 

  ngOnInit(): void {
  }

}
