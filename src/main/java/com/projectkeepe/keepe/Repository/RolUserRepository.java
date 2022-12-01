package com.projectkeepe.keepe.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projectkeepe.keepe.Model.RolUser;

public interface RolUserRepository extends JpaRepository<RolUser, Integer> {
    @Query(value = "SELECT * FROM roluser WHERE rol_type = ?1", nativeQuery = true)
    List<RolUser> findAllRolType(String rolType);
}
