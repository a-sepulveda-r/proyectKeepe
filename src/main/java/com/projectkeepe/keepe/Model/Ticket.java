package com.projectkeepe.keepe.Model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer placeNumber;
    @Column(name = "qrCode", unique = true)
    private String qrCode;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ReserveDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date starTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

    // @JsonManagedReference
    // @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    // @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    // @JsonManagedReference
    // @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reserveRecord_id")
    private ReserveRecord reserveRecord;

    // @JsonManagedReference
    // @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "place_id")
    private Place place;

    public Ticket() {
    }

    public Ticket(Integer id, Integer placeNumber, String qrCode, Date reserveDate, Date starTime, Date endTime,
            User user, ReserveRecord reserveRecord, Place place) {
        this.id = id;
        this.placeNumber = placeNumber;
        this.qrCode = qrCode;
        ReserveDate = reserveDate;
        this.starTime = starTime;
        this.endTime = endTime;
        this.user = user;
        this.reserveRecord = reserveRecord;
        this.place = place;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(Integer placeNumber) {
        this.placeNumber = placeNumber;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public Date getReserveDate() {
        return ReserveDate;
    }

    public void setReserveDate(Date reserveDate) {
        ReserveDate = reserveDate;
    }

    public Date getStarTime() {
        return starTime;
    }

    public void setStarTime(Date starTime) {
        this.starTime = starTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ReserveRecord getReserveRecord() {
        return reserveRecord;
    }

    public void setReserveRecord(ReserveRecord reserveRecord) {
        this.reserveRecord = reserveRecord;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

}
