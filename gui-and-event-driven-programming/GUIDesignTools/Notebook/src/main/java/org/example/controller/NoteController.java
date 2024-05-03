package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ListView;
import org.example.model.Note;
import org.example.model.Notebook;

public class NoteController {
    @FXML private TextField titleField;
    @FXML private TextArea contentArea;
    @FXML private ListView<String> noteList;

    private Notebook notebook = new Notebook();

    @FXML
    protected void addNote() {
        Note note = new Note(titleField.getText(), contentArea.getText());
        notebook.addNote(note);
        noteList.getItems().add(note.getTitle() + ": " + note.getContent());
        titleField.clear();
        contentArea.clear();
    }
}
