import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {map} from 'rxjs/operators';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  url:string = 'http://localhost:8085/reservations/';

  constructor(private _http:HttpClient) { }

  public getReservation(id:number):any {
    return this._http.get(this.url+id);
  }

  public checkIn(checkInRequest):any {
    return this._http.post(this.url, checkInRequest);
  }
}
