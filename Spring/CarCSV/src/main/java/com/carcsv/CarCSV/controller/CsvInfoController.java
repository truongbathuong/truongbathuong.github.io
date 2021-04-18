package com.carcsv.CarCSV.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.carcsv.CarCSV.model.Car;

@Controller
public class CsvInfoController {
    @GetMapping(value = "/")
    public String getCar(Model model) {
        List<Car> cars = new ArrayList<Car>();
        try (BufferedReader br = new BufferedReader(new FileReader("F:\\frontend\\truongbathuong.github.io\\Spring\\CarCSV\\src\\main\\resources\\static\\hihi.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                cars.add(new Car(Integer.valueOf(values[0]),values[1],values[2],Integer.valueOf(values[3])));
            }
        } catch(Exception e){
            System.out.println(e.toString());
        }
        model.addAttribute("cars", cars);
        return "home";
    }
}