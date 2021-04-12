package fr.shcherbakov.parking.dao.api_response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiEntity {

    // here to use the key word the entities are based on, for example "Point" or "Envelope"
    @JsonProperty (value = "keyword")
    private String name;
    @JsonProperty (value = "keyword")
    private String nbTotalPlaces;
    @JsonProperty (value = "keyword")
    private String nbFreePlaces;
    @JsonProperty (value = "keyword")
    private String status;
    // Attributes to be added according to the application config...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNbTotalPlaces() {
        return nbTotalPlaces;
    }

    public void setNbTotalPlaces(String nbTotalPlaces) {
        this.nbTotalPlaces = nbTotalPlaces;
    }

    public String getNbFreePlaces() {
        return nbFreePlaces;
    }

    public void setNbFreePlaces(String nbFreePlaces) {
        this.nbFreePlaces = nbFreePlaces;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
