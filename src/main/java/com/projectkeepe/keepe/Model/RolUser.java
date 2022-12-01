package com.projectkeepe.keepe.Model;

import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "roluser")
public class RolUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String rolType;

    // @JsonBackReference
    // @OneToMany(mappedBy = "rolUser", cascade = CascadeType.ALL, fetch =
    // FetchType.LAZY)
    // // @OneToMany(mappedBy = "rolUser", cascade = { CascadeType.PERSIST,
    // // CascadeType.MERGE })
    // private List<User> User;
    @OneToOne(mappedBy = "rolUser")
    private User user;

    public RolUser() {
    }

    public RolUser(Integer id, String rolType) {
        this.id = id;
        this.rolType = rolType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolType() {
        return rolType;
    }

    public void setRolType(String rolType) {
        this.rolType = rolType;
    }

}
