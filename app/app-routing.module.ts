
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddNewBooksComponent } from './add-new-books/add-new-books.component';
import { AdminNavigationComponent } from './admin-navigation/admin-navigation.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { NavigationComponent } from './navigation/navigation.component';
import { PayFineComponent } from './pay-fine/pay-fine.component';
import { RegistrationComponent } from './registration/registration.component';


import { ServicesComponent } from './services/services.component';
import { StudentNavigationComponent } from './student-navigation/student-navigation.component';
import { StudentloginComponent } from './studentlogin/studentlogin.component';
import { ViewBooksComponent } from './view-books/view-books.component';
import { ViewPayFineComponent } from './view-pay-fine/view-pay-fine.component';

const routes: Routes = [

  { path: 'home', component: HomeComponent},
  { path: 'footer', component: FooterComponent},
  { path: 'login', component: LoginComponent},
  { path: 'studentlogin', component: StudentloginComponent},
  { path: 'AdminNavigation', component: AdminNavigationComponent},
  { path: 'studentnavi', component: StudentNavigationComponent},
  { path: 'navigation', component: NavigationComponent},
  { path: 'payfine', component: PayFineComponent},
  { path: 'registration', component: RegistrationComponent},
  { path: 'services', component: ServicesComponent},
  { path: 'viewbooks', component: ViewBooksComponent},
  { path: 'viewpayfine', component: ViewPayFineComponent},
  { path: 'addnewbook', component: AddNewBooksComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
