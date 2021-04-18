package com.carcsv.CarCollection.Controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.carcsv.CarCollection.model.Car;
@Controller
public class CollectionController {
@Value("${spring.application.name}")
private String appName;
static final String APP_Name = "appName";
static final String CARS = "cars";
@GetMapping(value ="/")
public String getCom(Model model){
    model.addAttribute(APP_Name,appName);
    return "com";

}
@GetMapping(value = "/controller")
public String getCollectionCar(Model model) {
    Car[] carList = {
        new Car(1, "Triton 4x4 Premium", "Mitsubishi", 869, "/images/mitsubishi.jpg"),
        new Car(2, "Ranger", "Ford", 1205, "/images/ranger.jpg"),
        new Car(3, "Bentley Flying", "Bentley", 2205, "/images/bentley.jpg"),
        new Car(4, "Enzo Ferrari", "Ferrari", 969, "/images/ferrari.jpg"),
        new Car(5, "Lamboghini Urus", "Lamboghini", 1985, "/images/lamboghini.jpg"),
        
    };
    model.addAttribute(CARS, carList);
    model.addAttribute(APP_Name, appName);
    return "collection";
}
}