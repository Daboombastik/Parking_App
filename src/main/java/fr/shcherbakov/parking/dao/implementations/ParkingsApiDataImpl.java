package fr.shcherbakov.parking.dao.implementations;

import fr.shcherbakov.parking.dao.ParkingsApiData;
import fr.shcherbakov.parking.dao.api_response.ParkingsApiResponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ParkingsApiDataImpl implements ParkingsApiData {
    private RestTemplate restTemplate;
    private final String URL = "http://data.lacub.fr/wfs?key=9Y2RU3FTE8" +
            "&SERVICE=WFS" +
            "&VERSION=1.1.0" +
            "&REQUEST=GetFeature&TYPENAME=ST_PARK_P&SRSNAME=EPSG:4326";

    public ParkingsApiDataImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ParkingsApiResponse getDataFromApi() {
        return restTemplate.getForEntity(URL, ParkingsApiResponse.class).getBody();
    }

}
