package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Currency {
    private String abbreviation;
    private String name;
    private double rateToUSD; // Conversion rate to USD

    public Currency(String abbreviation, String name, double rateToUSD) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.rateToUSD = rateToUSD;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public double getRateToUSD() {
        return rateToUSD;
    }

    @Override
    public String toString() {
        return abbreviation;
    }
}

