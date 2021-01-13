package com.example.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/weather/Daily;", "", "temp", "Lcom/example/weather/Temp;", "weather", "", "Lcom/example/weather/WeatherDescription;", "(Lcom/example/weather/Temp;Ljava/util/List;)V", "getTemp", "()Lcom/example/weather/Temp;", "setTemp", "(Lcom/example/weather/Temp;)V", "getWeather", "()Ljava/util/List;", "setWeather", "(Ljava/util/List;)V", "app_debug"})
public final class Daily {
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "temp")
    private com.example.weather.Temp temp;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "weather")
    private java.util.List<com.example.weather.WeatherDescription> weather;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather.Temp getTemp() {
        return null;
    }
    
    public final void setTemp(@org.jetbrains.annotations.NotNull()
    com.example.weather.Temp p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weather.WeatherDescription> getWeather() {
        return null;
    }
    
    public final void setWeather(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather.WeatherDescription> p0) {
    }
    
    public Daily(@org.jetbrains.annotations.NotNull()
    com.example.weather.Temp temp, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather.WeatherDescription> weather) {
        super();
    }
}