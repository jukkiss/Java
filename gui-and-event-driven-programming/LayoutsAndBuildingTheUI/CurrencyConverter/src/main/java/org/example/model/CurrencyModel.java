package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class CurrencyModel {
    private List<Currency> currencies = new ArrayList<>();

    public CurrencyModel() {
        currencies.add(new Currency("EUR", "Euro", 1.18));
        currencies.add(new Currency("USD", "United States Dollar", 1.0));
        currencies.add(new Currency("GBP", "British Pound", 1.39));
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public double convert(double amount, Currency from, Currency to) {
        double amountInUSD = amount * from.getRateToUSD();
        return amountInUSD / to.getRateToUSD();
    }
}
