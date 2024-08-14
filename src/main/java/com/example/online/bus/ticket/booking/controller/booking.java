package com.example.online.bus.ticket.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class booking {
    @Autowired
    private booking bookingRepository;

    @GetMapping
    public List<booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    private List<booking> findAll() {
        return List.of();
    }

    @PostMapping
    public booking createBooking(@RequestBody booking booking) {
        return bookingRepository.save(booking);
    }

    private booking save(booking booking) {
        return booking;
    }
}

