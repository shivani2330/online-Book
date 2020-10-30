import { BookserviceService } from './../../service/bookservice.service';
import { Book } from './../../model/book';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  books:Book[];
  constructor(private _bookservice:BookserviceService) { }

  ngOnInit(): void {
    this.list();
    }

  list()
  {
    this._bookservice.getBooks().subscribe(
      data=>
      {
        console.log(data);
        this.books=data;
      }
    )
  }

}
