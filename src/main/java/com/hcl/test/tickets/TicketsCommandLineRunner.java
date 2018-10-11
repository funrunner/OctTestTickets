package com.hcl.test.tickets;

import com.hcl.test.tickets.entity.Ticket;
import com.hcl.test.tickets.repository.TicketRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TicketsCommandLineRunner implements CommandLineRunner {

    @Autowired
    TicketRepository ticketRepository;

    private static final Logger log = LoggerFactory.getLogger(TicketsCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception{
        Ticket ticket = new Ticket("Issue1", "Common Issue", "High", "34001", "open");
        Ticket ticket1 = new Ticket("Issue2", "Common Issue", "Critical", "93001", "open");
        Ticket ticket2 = new Ticket("Issue3", "Common Issue", "Critical", "93002", "open");
        Ticket ticket3 = new Ticket("Issue4", "Common Issue", "High", "75002", "open");
        Ticket ticket4 = new Ticket("Issue5", "Common Issue", "Medium", "75321", "open");
        Ticket ticket5 = new Ticket("Issue6", "Common Issue", "Medium", "94331", "open");
        Ticket ticket6 = new Ticket("Issue7", "Common Issue", "Medium", "94327", "open");
        Ticket ticket7 = new Ticket("Issue8", "Common Issue", "Medium", "94328", "open");
        ticketRepository.save(ticket);
        ticketRepository.save(ticket1);
        ticketRepository.save(ticket2);
        ticketRepository.save(ticket3);
        ticketRepository.save(ticket4);
        ticketRepository.save(ticket5);
        ticketRepository.save(ticket6);
        ticketRepository.save(ticket7);

        log.info("Ticket created :: " + ticket.getTicketId());
    }
}
