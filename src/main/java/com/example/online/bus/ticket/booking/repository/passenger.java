package com.example.online.bus.ticket.booking.repository;

import com.example.online.bus.ticket.booking.entity.passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PassengerRepository extends JpaRepository<passenger, Long> {

}
