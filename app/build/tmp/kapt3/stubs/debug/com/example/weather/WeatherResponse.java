package com.example.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/example/weather/WeatherResponse;", "", "timezone", "", "current", "Lcom/example/weather/Current;", "daily", "", "Lcom/example/weather/Daily;", "(Ljava/lang/String;Lcom/example/weather/Current;Ljava/util/List;)V", "getCurrent", "()Lcom/example/weather/Current;", "setCurrent", "(Lcom/example/weather/Current;)V", "getDaily", "()Ljava/util/List;", "setDaily", "(Ljava/util/List;)V", "getTimezone", "()Ljava/lang/String;", "setTimezone", "(Ljava/lang/String;)V", "app_debug"})
public final class WeatherResponse {
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "timezone")
    private java.lang.String timezone;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "current")
    private com.example.weather.Current current;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "daily")
    private java.util.List<com.example.weather.Daily> daily;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimezone() {
        return null;
    }
    
    public final void setTimezone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather.Current getCurrent() {
        return null;
    }
    
    public final void setCurrent(@org.jetbrains.annotations.NotNull()
    com.example.weather.Current p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weather.Daily> getDaily() {
        return null;
    }
    
    public final void setDaily(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather.Daily> p0) {
    }
    
    public WeatherResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String timezone, @org.jetbrains.annotations.NotNull()
    com.example.weather.Current current, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather.Daily> daily) {
        super();
    }
}