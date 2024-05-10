package org.example.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.model.Currency;
import org.example.dao.CurrencyDao;

public class CurrencyConverterController {
    private CurrencyDao currencyDao;

    public CurrencyConverterController() {
        currencyDao = new CurrencyDao();
    }

    public ObservableList<Currency> getCurrencies() {
        // Simulated data fetching for UI display, use DAO to fetch real data
        return FXCollections.observableArrayList(
                new Currency("USD", "United States Dollar", currencyDao.getExchangeRate("USD")),
                new Currency("EUR", "Euro", currencyDao.getExchangeRate("EUR")),
                new Currency("GBP", "British Pound", currencyDao.getExchangeRate("GBP"))
        );
    }

    public double convert(double amount, Currency from, Currency to) {
        double amountInUSD = amount * from.getRateToUSD();
        return amountInUSD / to.getRateToUSD();
    }
}
