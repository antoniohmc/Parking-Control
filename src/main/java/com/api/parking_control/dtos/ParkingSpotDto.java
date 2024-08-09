package com.api.parking_control.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ParkingSpotDto {

    @NotBlank
    private String parkinSpotNumber;

    @NotBlank
    @Size(max = 7)
    private String licensePlateCar;

    @NotBlank
    private String brandCar;

    @NotBlank
    private String modelCar;

    @NotBlank
    private String colorCar;

    @NotBlank
    private String responsibleName;

    @NotBlank
    private String apartament;

    @NotBlank
    private String block;

    public @NotBlank String getParkinSpotNumber() {
        return parkinSpotNumber;
    }

    public void setParkinSpotNumber(@NotBlank String parkinSpotNumber) {
        this.parkinSpotNumber = parkinSpotNumber;
    }

    public @NotBlank @Size(max = 7) String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(@NotBlank @Size(max = 7) String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public @NotBlank String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(@NotBlank String brandCar) {
        this.brandCar = brandCar;
    }

    public @NotBlank String getModelCar() {
        return modelCar;
    }

    public void setModelCar(@NotBlank String modelCar) {
        this.modelCar = modelCar;
    }

    public @NotBlank String getColorCar() {
        return colorCar;
    }

    public void setColorCar(@NotBlank String colorCar) {
        this.colorCar = colorCar;
    }

    public @NotBlank String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(@NotBlank String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public @NotBlank String getApartament() {
        return apartament;
    }

    public void setApartament(@NotBlank String apartament) {
        this.apartament = apartament;
    }

    public @NotBlank String getBlock() {
        return block;
    }

    public void setBlock(@NotBlank String block) {
        this.block = block;
    }
}
