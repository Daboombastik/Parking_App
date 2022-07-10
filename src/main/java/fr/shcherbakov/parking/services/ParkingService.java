package fr.shcherbakov.parking.services;

import fr.shcherbakov.parking.models.ParkingDTO;

import java.util.List;

public interface ParkingService {

    List<ParkingDTO> getListOfParkings();
}
