package fr.shcherbakov.parking.services.implementations;

import fr.shcherbakov.parking.dao.ParkingsApiData;
import fr.shcherbakov.parking.dao.api_response.ParkingsApiResponse;
import fr.shcherbakov.parking.dao.implementations.ParkingsApiDataImpl;
import fr.shcherbakov.parking.models.Parking;
import fr.shcherbakov.parking.services.ParkingService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingService {

    private ParkingsApiData parkingService;

    public ParkingServiceImpl (ParkingsApiDataImpl parkingService) {
        this.parkingService = parkingService;
    }

    //Returning a list of parkings from a third party API
    @Override
    public List<Parking> getListOfParkings() {
        ParkingsApiResponse response = parkingService.getDataFromApi();
        return responseToModel(response);
    }

    //Mapping the list of parkings according to Parking model
    private List<Parking> responseToModel(ParkingsApiResponse response) {
        List<Parking> result = new ArrayList<>();
        if(response.getRecords() != null) {
            for (var record : response.getRecords()) {
                Parking parking = new Parking();
                parking.setName(record.getName());
                parking.setNbTotalPlaces(record.getNbTotalPlaces());
                parking.setNbFreePlaces(record.getNbFreePlaces());
                parking.setStatus(record.getStatus());
                result.add(parking);
            }
        }
        return result;
    }
}
