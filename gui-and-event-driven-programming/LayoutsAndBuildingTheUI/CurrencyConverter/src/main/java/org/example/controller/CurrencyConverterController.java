package org.example.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.model.Currency;
import org.example.model.CurrencyModel;

public class CurrencyConverterController {
    private CurrencyModel model;

    public CurrencyConverterController() {
        model = new CurrencyModel();
    }

    public ObservableList<Currency> getCurrencies() {
        return FXCollections.observableArrayList(model.getCurrencies());
    }

    public double convert(double amount, Currency from, Currency to) {
        return model.convert(amount, from, to);
    }
}

