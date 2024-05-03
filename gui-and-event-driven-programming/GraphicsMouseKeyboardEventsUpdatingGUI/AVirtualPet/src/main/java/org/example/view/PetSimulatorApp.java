package org.example.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.example.controller.PetController;
import org.example.model.Pet;


public class PetSimulatorApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pet pet = new Pet(100, 100);  // Initial pet location
        PetView view = new PetView(400, 400);
        PetController controller = new PetController(pet, view);

        StackPane root = new StackPane(view.getCanvas());
        Scene scene = new Scene(root, 400, 400);

        primaryStage.setTitle("Virtual Pet Simulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
