package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    @Override
    public void start(Stage window) {
        // Create a BorderPane
        BorderPane layout = new BorderPane();

        // Create buttons for each section of the BorderPane
        Button topButton = new Button("NORTH");
        Button rightButton = new Button("EAST");
        Button bottomButton = new Button("SOUTH");
        Button leftButton = new Button("WEST");
        Button centerButton = new Button("CENTER");

        // Set each button to a different region of the BorderPane
        layout.setTop(topButton);
        layout.setRight(rightButton);
        layout.setBottom(bottomButton);
        layout.setLeft(leftButton);
        layout.setCenter(centerButton);

        // Create a scene with the layout
        Scene view = new Scene(layout);

        // Setup the stage with scene and show it
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);  // Correctly launch the application with command line arguments
    }

}
