package com.example.weather.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class WeatherResponse {

    private Current current;
    private Daily daily;

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Daily getDaily() {
        return daily;
    }

    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    public static class Current {

        @JsonAlias("temperature_2m")
        private double temperature;

        @JsonAlias("relative_humidity_2m")
        private int humidity;

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }
    }

    public static class Daily {

        private String[] time;

        @JsonAlias("temperature_2m_max")
        private double[] maxTemperature;

        @JsonAlias("temperature_2m_min")
        private double[] minTemperature;

        public String[] getTime() {
            return time;
        }

        public void setTime(String[] time) {
            this.time = time;
        }

        public double[] getMaxTemperature() {
            return maxTemperature;
        }

        public void setMaxTemperature(double[] maxTemperature) {
            this.maxTemperature = maxTemperature;
        }

        public double[] getMinTemperature() {
            return minTemperature;
        }

        public void setMinTemperature(double[] minTemperature) {
            this.minTemperature = minTemperature;
        }
    }
}