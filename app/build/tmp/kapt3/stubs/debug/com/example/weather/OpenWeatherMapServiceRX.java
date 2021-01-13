package com.example.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/example/weather/OpenWeatherMapServiceRX;", "", "listWeather", "Lio/reactivex/Single;", "Lcom/example/weather/WeatherResponse;", "app_debug"})
public abstract interface OpenWeatherMapServiceRX {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "onecall?lat=59.937500&lon=30.308611&exclude=minutely,hourly,alerts&units=metric&appid=508af3c89d5fdcb4b9f030cea26e964e")
    public abstract io.reactivex.Single<com.example.weather.WeatherResponse> listWeather();
}