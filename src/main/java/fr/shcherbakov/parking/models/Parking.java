package fr.shcherbakov.parking.models;

public class Parking {

    // Attributes to be added according to the application config...
    private Long id;
    private String name;
    private String nbTotalPlaces;
    private String nbFreePlaces;
    private String status;


    public Parking() {
    }

    public Parking(Long id, String name, String nbTotalPlaces, String nbFreePlaces, String status) {
        this.id = id;
        this.name = name;
        this.nbTotalPlaces = nbTotalPlaces;
        this.nbFreePlaces = nbFreePlaces;
        this.status = status;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
