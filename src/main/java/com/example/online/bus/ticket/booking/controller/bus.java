package com.example.online.bus.ticket.booking.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buses")
public class bus {


        @Autowired
        private bus busRepository;

        @GetMapping
        public List<bus> getAllBuses() {
            return busRepository.findAll();
        }

    private List<bus> findAll() {
        return List.of();
    }

    @PostMapping
        public <Bus> Bus createBus(@RequestBody Bus bus) {
            return busRepository.save(bus);
        }

    private <Bus> Bus save(Bus bus) {
        return bus;
    }
}

