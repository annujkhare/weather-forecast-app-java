package com.example.weather.service;

import com.example.weather.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final RestTemplate restTemplate = new RestTemplate();

    public WeatherResponse getWeather(double latitude, double longitude) {

        String url = "https://api.open-meteo.com/v1/forecast"
                + "?latitude=" + latitude
                + "&longitude=" + longitude
                + "&current=temperature_2m,relative_humidity_2m"
                + "&daily=temperature_2m_max,temperature_2m_min"
                + "&forecast_days=5"
                + "&timezone=auto";

        return restTemplate.getForObject(
                url,
                WeatherResponse.class
        );
    }
}