package com.example.ecom_project.model;

import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor

@Component
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private  String description;
    private  String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private boolean availability;
    private int quantity;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageDate;


    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public byte[] getImageDate() {
        return imageDate;
    }

    public void setImageDate(byte[] imageDate) {
        this.imageDate = imageDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    public Product(int id, String name, String description, String brand, BigDecimal price, String category, Date releaseDate, boolean availability, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.brand = brand;
//        this.price = price;
//        this.category = category;
//        this.releaseDate = releaseDate;
//        this.availability = availability;
//        this.quantity = quantity;
//    }


    public Product(int id, String name, String description, String brand, BigDecimal price, String category, Date releaseDate, boolean availability, int quantity, String imageName, String imageType, byte[] imageDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.releaseDate = releaseDate;
        this.availability = availability;
        this.quantity = quantity;
        this.imageName = imageName;
        this.imageType = imageType;
        this.imageDate = imageDate;
    }

    public Product() {
    }
}
