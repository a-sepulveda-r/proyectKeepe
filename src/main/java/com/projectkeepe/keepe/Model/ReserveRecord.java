package com.projectkeepe.keepe.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

//import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "reserverecord")
public class ReserveRecord {
    @Id
    @GeneratedValue
    private Integer id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reserveRecordDate;
    private String review;

    // @OneToOne()
    // @JoinColumn(name = "user_id")
    // private User user;

    // @JsonBackReference
    // @OneToMany(mappedBy = "reserveRecord", cascade = { CascadeType.PERSIST,
    // CascadeType.MERGE })
    @OneToMany(mappedBy = "place", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ticket> ticket;

    public ReserveRecord() {
    }

    public ReserveRecord(Integer id, Date reserveRecordDate, String review, List<Ticket> ticket) {
        this.id = id;
        this.reserveRecordDate = reserveRecordDate;
        this.review = review;
        this.ticket = ticket;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getReserveRecordDate() {
        return reserveRecordDate;
    }

    public void setReserveRecordDate(Date reserveRecordDate) {
        this.reserveRecordDate = reserveRecordDate;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public List<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(List<Ticket> ticket) {
        this.ticket = ticket;
    }

}
