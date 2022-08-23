import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';

@Component({
  selector: 'app-view-pay-fine',
  templateUrl: './view-pay-fine.component.html',
  styleUrls: ['./view-pay-fine.component.css']
})
export class ViewPayFineComponent implements OnInit {

  constructor(private ps:LibraryService) { 
    this.viewPayfine();
  }
  payfine:any
  viewPayfine(){
    this.ps.viewPayfine().subscribe((result:any)=>{this.payfine=result});
  }
  ngOnInit(): void {
  }

}
