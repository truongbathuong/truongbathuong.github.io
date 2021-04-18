package com.carcsv.CarCSV.model;

import lombok.Getter;
import lombok.Setter;
import com.carcsv.CarCSV.controller.CsvInfoController;
@Getter
@Setter
public class Car {
    private int id;
    private String name;
    private String manufacturre;
    private int price;
    public Car(int id, String name, String manufacturre, int price) {
        this.id = id;
        this.name = name;
        this.manufacturre = manufacturre;
        this.price = price;
    }
 
}
