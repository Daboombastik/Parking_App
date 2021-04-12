import { Component, OnInit } from '@angular/core';
import {ParkingServiceService} from "../../services/parking-service.service";
import {ParkingModel} from "../../model/ParkingModel";

@Component({
  selector: 'app-parking',
  templateUrl: './parking.component.html',
  styleUrls: ['./parking.component.css']
})
export class ParkingComponent implements OnInit {
  parkings: ParkingModel[] = [];

  constructor(private parkingService: ParkingServiceService) { }

  ngOnInit(): void {
    this.parkingService.getParkings().subscribe( response => {
      this.parkings = response;
    });
  }

}
