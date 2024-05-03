package org.example.controller;

import javafx.scene.input.MouseEvent;
import org.example.model.Pet;
import org.example.view.PetView;


public class PetController {
    private Pet pet;
    private PetView view;

    public PetController(Pet pet, PetView view) {
        this.pet = pet;
        this.view = view;
        initHandlers();
    }

    private void initHandlers() {
        view.getCanvas().setOnMouseMoved(this::handleMouseMoved);
        view.getCanvas().setOnMouseExited(this::handleMouseExited);
    }

    private void handleMouseMoved(MouseEvent event) {
        double mouseX = event.getX();
        double mouseY = event.getY();
        updatePetPosition(mouseX, mouseY);
    }

    private void handleMouseExited(MouseEvent event) {
        // Stops the pet's movement when the mouse exits the canvas
    }

    private void updatePetPosition(double mouseX, double mouseY) {
        double dx = mouseX - pet.getX();
        double dy = mouseY - pet.getY();
        double distance = Math.sqrt(dx * dx + dy * dy);
        double speed = 5;  // You can adjust the speed

        if (distance > speed) {
            double ratio = speed / distance;
            double moveX = dx * ratio;
            double moveY = dy * ratio;
            pet.setLocation(pet.getX() + moveX, pet.getY() + moveY);
        } else {
            pet.setLocation(mouseX, mouseY);
        }
        view.drawPet(pet.getX(), pet.getY());
    }
}

