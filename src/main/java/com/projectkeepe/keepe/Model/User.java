package com.projectkeepe.keepe.Model;

import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "username", unique = true)
    private String username;
    private String fullname;
    private String password;
    private String correo;
    @Column(name = "rut", unique = true)
    private String rut;
    @Column(name = "phonenumber", unique = true)
    private int phonenumber;

    // @OneToOne(mappedBy = "user")
    // private ReserveRecord reserveRecord;

    // @JsonManagedReference
    // @ManyToOne(fetch = FetchType.LAZY)
    // @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @OneToOne()
    @JoinColumn(name = "rolUser_id")
    private RolUser rolUser;
    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "rolUser_id")
    // private RolUser rolUser;

    // @JsonBackReference
    // @OneToMany(mappedBy = "user", cascade = { CascadeType.PERSIST,
    // CascadeType.MERGE })
    // @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch =
    // FetchType.LAZY)
    // private List<Place> place;

    // @JsonBackReference
    // @OneToMany(mappedBy = "user", cascade = { CascadeType.PERSIST,
    // CascadeType.MERGE })
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ticket> ticket;

    public User() {
    }

    public User(Integer id, String username, String fullname, String password, String correo, String rut,
            int phonenumber, RolUser rolUser, List<Ticket> ticket) {
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.correo = correo;
        this.rut = rut;
        this.phonenumber = phonenumber;
        this.rolUser = rolUser;
        this.ticket = ticket;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public RolUser getRolUser() {
        return rolUser;
    }

    public void setRolUser(RolUser rolUser) {
        this.rolUser = rolUser;
    }

    public List<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(List<Ticket> ticket) {
        this.ticket = ticket;
    }

}
