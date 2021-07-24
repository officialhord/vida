package com.vida;

import javax.persistence.*;
import java.util.Date;

@Table(name = "vehicle")
@Entity
public class Vehicle {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brand;
    private Date year;
    private String model;
    private String engineCapacity;
    private String color;
    private String plateNumber;


    public Long getId() {
        return id;
    }

    public Vehicle(Long id, String brand, Date year, String model, String engineCapacity, String color, String plateNumber) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.plateNumber = plateNumber;
    }

    public Vehicle() {

    }
}