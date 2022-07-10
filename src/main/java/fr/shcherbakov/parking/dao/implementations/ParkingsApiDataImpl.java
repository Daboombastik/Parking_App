package fr.shcherbakov.parking.dao.implementations;

import fr.shcherbakov.parking.dao.ParkingsApiData;
import fr.shcherbakov.parking.dao.api_response.ParkingsApiResponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ParkingsApiDataImpl implements ParkingsApiData {
    private final RestTemplate restTemplate;
    private final String URL = "https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=244400404_parkings-publics-nantes-disponibilites&q=&rows=-1&facet=grp_nom&facet=grp_statut";

    public ParkingsApiDataImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ParkingsApiResponse getDataFromApi() {
        return restTemplate.getForEntity(URL, ParkingsApiResponse.class).getBody();
    }

}
