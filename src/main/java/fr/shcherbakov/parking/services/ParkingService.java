package fr.shcherbakov.parking.services;

import fr.shcherbakov.parking.models.Parking;

import java.util.List;

public interface ParkingService {

    List<Parking> getListOfParkings();
}
