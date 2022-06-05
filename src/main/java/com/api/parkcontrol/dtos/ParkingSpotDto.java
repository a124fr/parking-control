package com.api.parkcontrol.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class ParkingSpotDto {

    @NotBlank
    private String parkSpotNumber; // numero da vaga do estacionamento

    @NotBlank
    @Size(max = 7)
    private String licensePlateCar; // placa do carro

    @NotBlank
    private String brandCar; // marca do carro

    @NotBlank
    private String modelCar; // modelo do carro

    @NotBlank
    private String colorCar; // cor do carro

    @NotBlank
    private String responsibleName; // nome do responsável do veiculo ou apartamento

    @NotBlank
    private String apartment; // o apartamento

    @NotBlank
    private String block; // bloco ou torre do condomínio

}
