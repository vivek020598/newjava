package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.repository.TicketRepository;
import com.xworkz.ticket.repository.TicketRepositoryImplementation;

public class TicketServiceImplementation implements TicketService {
    private TicketRepository ticketRepository = new TicketRepositoryImplementation();

    @Override
    public boolean validateAndSave(TicketDto ticketDto) {
        if (ticketDto != null) {
            System.out.println("TicketDto is not null");
            if (ticketDto.getTicketName() != null && ticketDto.getTicketPrice() > 0) {
                boolean saved = ticketRepository.save(ticketDto);
                if (saved) {
                    System.out.println("Ticket saved successfully");
                    return true;
                }
            } else {
                System.out.println("Invalid TicketDto fields");
            }
        }
        return false;
    }
}
