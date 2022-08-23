import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavigationComponent } from './navigation/navigation.component';
import { HomeComponent } from './home/home.component';
import { FooterComponent } from './footer/footer.component';

import { ServicesComponent } from './services/services.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { PayFineComponent } from './pay-fine/pay-fine.component';
import { AdminNavigationComponent } from './admin-navigation/admin-navigation.component';
import { StudentNavigationComponent } from './student-navigation/student-navigation.component';
import { ViewBooksComponent } from './view-books/view-books.component';
import { ViewPayFineComponent } from './view-pay-fine/view-pay-fine.component';
import { AddNewBooksComponent } from './add-new-books/add-new-books.component';
import { HttpClientModule } from '@angular/common/http';
import { StudentloginComponent } from './studentlogin/studentlogin.component';


@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    HomeComponent,
    FooterComponent,
   
    ServicesComponent,
    LoginComponent,
    RegistrationComponent,
    PayFineComponent,
    AdminNavigationComponent,
    StudentNavigationComponent,
    ViewBooksComponent,
    ViewPayFineComponent,
    AddNewBooksComponent,
    StudentloginComponent,
    

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
