package view;
import controller.DictionaryController;
import model.Dictionary;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {
    private DictionaryController controller;

    @Override
    public void start(Stage primaryStage) {
        Dictionary dictionary = new Dictionary();
        controller = new DictionaryController(dictionary);

        FlowPane pane = new FlowPane();
        pane.setVgap(10);
        pane.setHgap(20);

        TextField wordInput = new TextField();
        Button searchButton = new Button("Search");
        Label resultLabel = new Label();

        searchButton.setOnAction(e -> {
            String result = controller.search(wordInput.getText());
            resultLabel.setText(result);
        });

        pane.getChildren().addAll(new Label("Enter a word:"), wordInput, searchButton, resultLabel);

        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setTitle("Dictionary Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

