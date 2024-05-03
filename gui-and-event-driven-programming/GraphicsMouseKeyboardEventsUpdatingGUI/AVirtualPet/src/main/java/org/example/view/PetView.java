package org.example.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class PetView {
    private Canvas canvas;
    private GraphicsContext gc;
    private Image petImage;

    public PetView(double width, double height) {
        canvas = new Canvas(width, height);
        gc = canvas.getGraphicsContext2D();
        petImage = new Image("pet1.png");  // Ensure you have an image at this path
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void drawPet(double x, double y) {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.drawImage(petImage, x, y);
    }
}
