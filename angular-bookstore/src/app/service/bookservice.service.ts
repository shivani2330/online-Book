import { Book } from './../model/book';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {map} from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class BookserviceService {

  private baseUrl= 'http://localhost:8081/api/';

  constructor(private http:HttpClient) { }

   /*  when we issue a get request we will get GetResponseBooks and tht we will map 
      it to the GetResponse book */

     /* Map operator hepls us to convert the response in Book[] */

  getBooks():Observable<Book[]>
  {
      return this.http.get<GetResposeBooks>(this.baseUrl+'books').pipe
      (
        map(Response=>Response._embedded.books)
      );
  }

}

interface GetResposeBooks
  {
    _embedded:{
      books:Book[]; //this helps us to unwarp the book array from the json response
    }
  }
