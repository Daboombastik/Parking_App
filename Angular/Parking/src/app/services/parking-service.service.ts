import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {ParkingModel} from "../model/ParkingModel";

@Injectable({
  providedIn: 'root'
})
export class ParkingServiceService {

  constructor(private httpClient: HttpClient) { }

  getParkings(): Observable<ParkingModel[]> {
    return this.httpClient.get<ParkingModel[]>('http://localhost:8080/api/parkings');
  }
}
