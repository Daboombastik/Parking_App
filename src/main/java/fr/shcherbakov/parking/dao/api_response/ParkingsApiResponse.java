package fr.shcherbakov.parking.dao.api_response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ParkingsApiResponse {

    // here to use the key word the entities are based on, for example "parking" etc...
    @JsonProperty(value = "records")
    private List<DataSet> dataSets;

    public List<DataSet> getRecords() {
        return dataSets;
    }

    public void setRecords(List<DataSet> dataSets) {
        this.dataSets = dataSets;
    }
}
