import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';

@Component({
  selector: 'app-view-books',
  templateUrl: './view-books.component.html',
  styleUrls: ['./view-books.component.css']
})
export class ViewBooksComponent implements OnInit {

  constructor(private ps:LibraryService) { 
    this.viewBooks();
  }
  books:any=0;
  viewBooks(){
    console.log(this.books);
    this.ps.viewBooks().subscribe((result:any)=>{this.books=result});
  }
  ngOnInit(): void {
  }
}
