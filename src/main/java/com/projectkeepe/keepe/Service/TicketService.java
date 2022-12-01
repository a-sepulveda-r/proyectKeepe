package com.projectkeepe.keepe.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.projectkeepe.keepe.Model.Ticket;
import com.projectkeepe.keepe.Repository.TicketRepository;

@Service
@Transactional
public class TicketService {
    private TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public void saveTicket(Ticket Ticket) {
        ticketRepository.save(Ticket);
    }

    public void updateTicket(Ticket Ticket) {
        ticketRepository.save(Ticket);
    }

    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    public void deleteTicket(Integer id) {
        ticketRepository.deleteById(id);
    }

    public List<Ticket> findForRolType(String rolType) {
        return ticketRepository.findAllRolType(rolType);
    }
}
