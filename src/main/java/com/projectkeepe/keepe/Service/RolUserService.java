package com.projectkeepe.keepe.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.projectkeepe.keepe.Model.RolUser;
import com.projectkeepe.keepe.Repository.RolUserRepository;

@Service
@Transactional
public class RolUserService {
    private RolUserRepository rolUserRepository;

    public RolUserService(RolUserRepository rolUserRepository) {
        this.rolUserRepository = rolUserRepository;
    }

    public void saveRolUser(RolUser rolUser) {
        rolUserRepository.save(rolUser);
    }

    public void updateRolUser(RolUser rolUser) {
        rolUserRepository.save(rolUser);
    }

    public List<RolUser> findAll() {
        return rolUserRepository.findAll();
    }

    public void deleteRolUser(Integer id) {
        rolUserRepository.deleteById(id);
    }

    public List<RolUser> findForRolType(String rolType) {
        return rolUserRepository.findAllRolType(rolType);
    }
}
