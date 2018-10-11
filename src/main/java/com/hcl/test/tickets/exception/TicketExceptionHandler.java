package com.hcl.test.tickets.exception;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class TicketExceptionHandler
        extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<TicketException> handleError(Exception ex){
        TicketException tktExption = new TicketException();
        tktExption.setErrorCode(HttpStatus.NOT_FOUND.value());
        tktExption.setErrorMessage("No Tickets Found");

        return new ResponseEntity<TicketException>(tktExption, HttpStatus.NOT_FOUND);
    }
}
