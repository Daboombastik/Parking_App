package fr.shcherbakov.parking.controllers;

import fr.shcherbakov.parking.models.ParkingDTO;
import fr.shcherbakov.parking.services.ParkingService;
import fr.shcherbakov.parking.services.implementations.ParkingServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class ParkingController {

    private final ParkingService parkingService;

    public ParkingController(ParkingServiceImpl parkingService) {
        this.parkingService = parkingService;
    }

    @CrossOrigin("http://localhost:4200")
    @RequestMapping(path = "/api/parkings", method = RequestMethod.GET)
    public List<ParkingDTO> getParkings() {
        return parkingService.getListOfParkings();
    }
}
