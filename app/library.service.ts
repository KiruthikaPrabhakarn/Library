import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class LibraryService {
  [x: string]: any;
  
  
  url1 = "http://localhost:8080/insertRegister"
  url2 = "http://localhost:8080/login"
  url3 = "http://localhost:8080/insertAddnewbook"
  url4 = "http://localhost:8080/insertPayfine"
  url5 = "http://localhost:8080/viewBooks"
  url6 = "http://localhost:8080/viewPayfine"
 

  constructor(private h1: HttpClient) {

  }
  insertRegister1(data: any) {
    return this.h1.post(this.url1, data); //post belonging to httpclient
  }
  insertLogin(data: any) {
    return this.h1.post(this.url2, data); //post belonging to httpclient
  }
  insertAddnewbook1(data: any) {
    return this.h1.post(this.url3, data); //post belonging to httpclient

  }

  insertPayfine1(data: any) {
    return this.h1.post(this.url4, data); //post belonging to httpclient

  }
  viewBooks(){
    return this.h1.get(this.url5);
  }
  viewPayfine(){
    return this.h1.get(this.url6);
  }
  


}

