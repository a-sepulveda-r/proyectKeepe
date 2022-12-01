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

import com.projectkeepe.keepe.Model.Ticket;
import com.projectkeepe.keepe.Service.TicketService;

@RestController
@CrossOrigin("*")
public class TicketController {
    private TicketService ticketService;

    public TicketController(@Autowired TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/Ticket/save")
    public void saveUser(@RequestBody Ticket ticket) {
        ticketService.saveTicket(ticket);
    }

    @PutMapping("/Ticket/update")
    public void updateUser(@RequestBody Ticket ticket) {
        ticketService.updateTicket(ticket);
    }

    @GetMapping("/Ticket/findAll")
    public List<Ticket> allTicket() {
        return ticketService.findAll();
    }

    @GetMapping("/Ticket/findAllType")
    public List<Ticket> allTicketType(String rolType) {
        return ticketService.findForRolType(rolType);
    }

    @DeleteMapping("/Ticket/deleteTicket/{id}")
    public void deleteTicket(@PathVariable Integer id) {
        ticketService.deleteTicket(id);
    }
}
