package com.api.parkcontrol.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "parking_spot")
public class ParkingSpot implements Serializable {
    private static final long serialVersionUID = 1L;

    private String numero;
    
}
