package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {

    CarServiceImpl carService = new CarServiceImpl();

    @RequestMapping("/cars")
    public String getNCars (@RequestParam(value = "count", defaultValue = "5") int count, Model model) {//todo используем примитивы
        model.addAttribute("carList", carService.getCarsService(count, carService.getCarsList()));
        return "cars";
    }
}
