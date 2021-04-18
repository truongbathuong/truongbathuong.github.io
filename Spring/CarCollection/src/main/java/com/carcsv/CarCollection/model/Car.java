package com.carcsv.CarCollection.model;
import lombok.Data;
import lombok.AllArgsConstructor;
@Data
@AllArgsConstructor
public class Car {
    private int id;
    private String name;
    private String manufacturre;
    private int price;
    private String photo;
}

