package com.example.weather.controller;

import com.example.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public String getWeather(@RequestParam(name = "city", required = false, defaultValue = "Casablanca") String city, Model model) {
        Map<String, Object> weatherData = weatherService.getWeather(city);
        model.addAttribute("weatherData", weatherData);
        model.addAttribute("city", city);
        return "weather";
    }
}
