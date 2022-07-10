package com.aap.data.update.data;

public class Movie {
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    final String name;
    final int year;

    public Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }
}
