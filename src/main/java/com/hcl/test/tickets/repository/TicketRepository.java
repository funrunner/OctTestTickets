package com.hcl.test.tickets.repository;

import com.hcl.test.tickets.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
