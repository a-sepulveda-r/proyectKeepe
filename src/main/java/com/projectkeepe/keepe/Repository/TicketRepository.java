package com.projectkeepe.keepe.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projectkeepe.keepe.Model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{
    @Query(value = "SELECT * FROM Ticket WHERE user_id = ?1", nativeQuery = true)
    List<Ticket> findAllRolType(String user_id);
    
}
