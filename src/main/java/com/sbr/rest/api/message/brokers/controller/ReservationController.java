package com.sbr.rest.api.message.brokers.controller;

import com.sbr.rest.api.message.brokers.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/booking", produces = MediaType.APPLICATION_JSON_VALUE)
public class ReservationController {

    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping(value = "/accept/{reservationId}")
    public ResponseEntity<String> acceptBooking(@PathVariable("reservationId") String reservationId) {
        return ResponseEntity.ok(reservationService.acceptReservation(reservationId));
    }
}
