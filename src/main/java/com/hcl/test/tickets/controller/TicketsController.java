package com.hcl.test.tickets.controller;

import com.hcl.test.tickets.entity.Ticket;
import com.hcl.test.tickets.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@ControllerAdvice
@RestController
public class TicketsController {

    @Autowired
    private TicketRepository ticketsRepository;

    @GetMapping("/allTickets")
    public ResponseEntity<List<Ticket>> getAllTickets(){
        List<Ticket> deviceList = ticketsRepository.findAll();
        return new ResponseEntity<>(deviceList, HttpStatus.OK);
    }

    @GetMapping("/tickets/{id}/")
    public ResponseEntity<Ticket> getDevice(@PathVariable long id) throws Exception{
        Optional<Ticket> ticket = ticketsRepository.findById(id);
        return new ResponseEntity<>(ticket.get(), HttpStatus.OK);
    }

}