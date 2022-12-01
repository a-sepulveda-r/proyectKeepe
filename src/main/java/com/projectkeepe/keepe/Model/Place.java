package com.projectkeepe.keepe.Model;

import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

//import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "place")
public class Place {
    @Id
    @GeneratedValue
    private Integer id;
    private String placeName;
    private String placeType;
    private String adress;

    // @JsonManagedReference
    // @ManyToOne(fetch = FetchType.LAZY)
    // @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    // @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    // @JoinColumn(name = "user_id")
    // private User user;
    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "user_id")
    // private User user;

    // @JsonBackReference
    // @OneToMany(mappedBy = "place", cascade = { CascadeType.PERSIST,
    // CascadeType.MERGE })
    // private List<Ticket> ticket;
    @OneToMany(mappedBy = "place", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ticket> ticket;

    public Place() {
    }

    public Place(Integer id, String placeName, String placeType, String adress, List<Ticket> ticket) {
        this.id = id;
        this.placeName = placeName;
        this.placeType = placeType;
        this.adress = adress;
        this.ticket = ticket;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(List<Ticket> ticket) {
        this.ticket = ticket;
    }

}
