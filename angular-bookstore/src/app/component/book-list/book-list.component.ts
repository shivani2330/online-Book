import { BookserviceService } from './../../service/bookservice.service';
import { Book } from './../../model/book';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, Routes } from '@angular/router';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-grid.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  currentCategoryID:number;
  books:Book[];
  constructor(private _bookservice:BookserviceService,private _activatedRoute:ActivatedRoute,private routes:Router) { }

  ngOnInit(): void {

    this._activatedRoute.paramMap.subscribe(
      ()=>
      {
        this.listByid();
      }
    ) 
  
    }


  listByid()
  {

    const hasCategoryId:boolean = this._activatedRoute.snapshot.paramMap.has('id');

    if(hasCategoryId)
    {
      this.currentCategoryID = +this._activatedRoute.snapshot.paramMap.get('id');
      console.log(this.currentCategoryID);
    }
    else
    {
      this.currentCategoryID=101
    }

    this._bookservice.getBooksByCategoryId(this.currentCategoryID).subscribe(
      data=>
      {
        console.log(data);
        this.books=data;
      }
    )
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
