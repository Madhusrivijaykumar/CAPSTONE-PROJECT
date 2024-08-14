package com.example.online.bus.ticket.booking.repository;

import com.example.online.bus.ticket.booking.entity.bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface BusRepository extends JpaRepository<bus, Long> {

}
