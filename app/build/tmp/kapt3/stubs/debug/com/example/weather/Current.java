package com.example.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/example/weather/Current;", "", "humidity", "", "temp", "", "clouds", "wind_speed", "weather", "", "Lcom/example/weather/WeatherDescription;", "(IFIILjava/util/List;)V", "getClouds", "()I", "setClouds", "(I)V", "getHumidity", "setHumidity", "getTemp", "()F", "setTemp", "(F)V", "getWeather", "()Ljava/util/List;", "setWeather", "(Ljava/util/List;)V", "getWind_speed", "setWind_speed", "app_debug"})
public final class Current {
    @com.squareup.moshi.Json(name = "humidity")
    private int humidity;
    @com.squareup.moshi.Json(name = "temp")
    private float temp;
    @com.squareup.moshi.Json(name = "clouds")
    private int clouds;
    @com.squareup.moshi.Json(name = "wind_speed")
    private int wind_speed;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "weather")
    private java.util.List<com.example.weather.WeatherDescription> weather;
    
    public final int getHumidity() {
        return 0;
    }
    
    public final void setHumidity(int p0) {
    }
    
    public final float getTemp() {
        return 0.0F;
    }
    
    public final void setTemp(float p0) {
    }
    
    public final int getClouds() {
        return 0;
    }
    
    public final void setClouds(int p0) {
    }
    
    public final int getWind_speed() {
        return 0;
    }
    
    public final void setWind_speed(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weather.WeatherDescription> getWeather() {
        return null;
    }
    
    public final void setWeather(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather.WeatherDescription> p0) {
    }
    
    public Current(int humidity, float temp, int clouds, int wind_speed, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather.WeatherDescription> weather) {
        super();
    }
}