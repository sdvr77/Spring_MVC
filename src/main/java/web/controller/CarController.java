package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

//    @GetMapping
//    public String printAllCars(Model model) {
//        model.addAttribute("cars", carService.getAllCars());
//        return "cars";
//    }

    @GetMapping()
    public String printListCars(@RequestParam(required = false) Integer count, Model model) {
        model.addAttribute("cars", carService.getListCars(count));
        return "cars";
    }
}
