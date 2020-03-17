/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.luccasso.thymianek.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.luccasso.thymianek.model.City;
import pl.luccasso.thymianek.repo.CityRepo;

/**
 *
 * @author piko
 */
@Controller
public class CityController {

    @Autowired
    CityRepo cityRepo;

    @GetMapping("/")
    public String index(Model model) {

        return "index";
    }

    @GetMapping("/cities")
    public ModelAndView showCities() {

        List<City> cities = (List<City>) cityRepo.findAll();

        Map<String, Object> params = new HashMap<>();
        params.put("cities", cities);

        return new ModelAndView("cities", params);
    }
}
