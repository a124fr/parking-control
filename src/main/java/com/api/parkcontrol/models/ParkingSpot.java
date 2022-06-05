package com.api.parkcontrol.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "parking_spot")
public class ParkingSpot implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false,  unique = true, length = 10)
    private String parkSpotNumber; // numero da vaga do estacionamento

    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar; // placa do carro

    @Column(nullable = false, length = 70)
    private String brandCar; // marca do carro

    @Column(nullable = false, length = 70)
    private String modelCar; // modelo do carro

    @Column(nullable = false, length = 70)
    private String colorCar; // cor do carro

    @Column(nullable = false)
    private LocalDateTime registrationDate; // data de registro da vaga

    @Column(nullable = false, length = 130)
    private String responsibleName; // nome do responsável do veiculo ou apartamento

    @Column(nullable = false, length = 30)
    private String apartment; // o apartamento

    @Column(nullable = false, length = 30)
    private String block; // bloco ou torre do condomínio

}
