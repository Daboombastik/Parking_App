package fr.shcherbakov.parking.dao.api_response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.shcherbakov.parking.models.Parking;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ParkingsApiResponse {

    // here to use the key word the entities are based on, for example "parking" etc...
    @JsonProperty(value = "keyword")
    private List<ApiEntity> records;

    public List<ApiEntity> getRecords() {
        return records;
    }

    public void setRecords(List<ApiEntity> records) {
        this.records = records;
    }
}
