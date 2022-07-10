package fr.shcherbakov.parking.services.implementations;

import fr.shcherbakov.parking.dao.ParkingsApiData;
import fr.shcherbakov.parking.dao.api_response.ParkingsApiResponse;
import fr.shcherbakov.parking.dao.implementations.ParkingsApiDataImpl;
import fr.shcherbakov.parking.models.ParkingDTO;
import fr.shcherbakov.parking.services.ParkingService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingService {

    private final ParkingsApiData parkingService;

    public ParkingServiceImpl (ParkingsApiDataImpl parkingService) {
        this.parkingService = parkingService;
    }

    //Returning a list of parkings from a third party API
    @Override
    public List<ParkingDTO> getListOfParkings() {
        ParkingsApiResponse response = parkingService.getDataFromApi();
        return responseToModel(response);
    }

    //Mapping the list of parkings according to Parking model
    private List<ParkingDTO> responseToModel(ParkingsApiResponse response) {
        List<ParkingDTO> result = new ArrayList<>();

        if(response.getRecords() != null) {
            for (var record : response.getRecords()) {
                ParkingDTO parkingDTO = new ParkingDTO();
                parkingDTO.setNom(record.getFields().getGrpNom());
                parkingDTO.setStatut(defineStatus(record.getFields().getGrpStatut()));
                parkingDTO.setNbPlacesDispo(record.getFields().getGrpDisponible());
                parkingDTO.setNbPlacesTotal(record.getFields().getGrpExploitation());
                parkingDTO.setHeureMaj(record.getFields().getGrpHorodatage());
                result.add(parkingDTO);
            }
        }
        return result;
    }

    private String defineStatus(String code){

        return switch (code) {
            case "1" -> "FERME";
            case "2" -> "ABONNES";
            case "5" -> "OUVERT";
            default -> "Données non disponibles";
        };
    }
}
