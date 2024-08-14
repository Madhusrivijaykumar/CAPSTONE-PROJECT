package com.example.online.bus.ticket.booking.repository;

import com.example.online.bus.ticket.booking.entity.booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface BookingRepository extends JpaRepository<booking, Long> {
}
