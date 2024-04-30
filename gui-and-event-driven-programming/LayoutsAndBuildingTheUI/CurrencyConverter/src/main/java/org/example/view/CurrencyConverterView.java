package org.example.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.controller.CurrencyConverterController;


import org.example.model.Currency;

public class CurrencyConverterView extends Application {
    private CurrencyConverterController controller;

    @Override
    public void start(Stage primaryStage) {
        controller = new CurrencyConverterController();

        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 10;");

        Label sourceLabel = new Label("Source Currency:");
        ComboBox<Currency> sourceCurrency = new ComboBox<>();
        sourceCurrency.setItems(controller.getCurrencies());

        Label targetLabel = new Label("Target Currency:");
        ComboBox<Currency> targetCurrency = new ComboBox<>();
        targetCurrency.setItems(controller.getCurrencies());

        TextField amountField = new TextField();
        amountField.setPromptText("Enter amount");

        TextField resultField = new TextField();
        resultField.setEditable(false);

        Button convertButton = new Button("Convert");
        convertButton.setOnAction(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                Currency source = sourceCurrency.getValue();
                Currency target = targetCurrency.getValue();
                double result = controller.convert(amount, source, target);
                resultField.setText(String.format("%.2f", result));
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }
        });

        root.getChildren().addAll(sourceLabel, sourceCurrency, targetLabel, targetCurrency, amountField, convertButton, resultField);

        Scene scene = new Scene(root, 400, 250);
        scene.getStylesheets().add("Styles.css");
        primaryStage.setTitle("Currency Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
