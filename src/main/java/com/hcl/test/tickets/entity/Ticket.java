package com.hcl.test.tickets.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ticket {

    protected Ticket(){
    }

    public Ticket(String ticketName, String description, String severity, String zipCode, String status) {
        this.ticketName = ticketName;
        this.description = description;
        this.severity = severity;
        this.zipCode = zipCode;
        this.status = status;
    }

    @Id
    @GeneratedValue
    private Long ticketId;

    private String ticketName;

    private String description;

    private String severity;

    private String zipCode;

    private String status;

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}