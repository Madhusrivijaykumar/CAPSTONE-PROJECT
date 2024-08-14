package com.example.online.bus.ticket.booking.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/passengers")
public class passenger{
    @Autowired
    private passenger passengerRepository;

    @GetMapping
    public List<passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    private List<passenger> findAll() {
        return List.of();
    }

    @PostMapping
    public passenger createPassenger(@RequestBody passenger passenger) {
        return passengerRepository.save(passenger);
    }

    private passenger save(passenger passenger) {
        return passenger;
    }
}
