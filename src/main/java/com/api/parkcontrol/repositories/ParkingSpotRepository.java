package com.api.parkcontrol.repositories;

import com.api.parkcontrol.models.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, UUID> {

}
