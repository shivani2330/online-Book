import { RouterModule } from '@angular/router';
import { BookListComponent } from './component/book-list/book-list.component';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from "@angular/common/http";
import { BookCategoryComponent } from './component/book-category/book-category.component';

@NgModule({
  declarations: [
    AppComponent,
    BookListComponent,
    BookCategoryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
