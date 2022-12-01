package com.projectkeepe.keepe.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projectkeepe.keepe.Model.RolUser;
import com.projectkeepe.keepe.Service.RolUserService;

@RestController
@CrossOrigin("*")
public class RolUserController {

    private RolUserService rolUserService;

    public RolUserController(@Autowired RolUserService rolUserService) {
        this.rolUserService = rolUserService;
    }

    @PostMapping("/RolUser/save")
    public void saveUser(@RequestBody RolUser rolUser) {
        rolUserService.saveRolUser(rolUser);
    }

    @PutMapping("/RolUser/update")
    public void updateUser(@RequestBody RolUser rolUser) {
        rolUserService.updateRolUser(rolUser);
    }

    @GetMapping("/RolUser/findAll")
    public List<RolUser> allRolUser() {
        return rolUserService.findAll();
    }

    @GetMapping("/RolUser/findAllType")
    public List<RolUser> allRolUserType(String rolType) {
        return rolUserService.findForRolType(rolType);
    }

    @DeleteMapping("/RolUser/deleteRolUser/{id}")
    public void deleteRolUser(@PathVariable Integer id) {
        rolUserService.deleteRolUser(id);
    }
}
