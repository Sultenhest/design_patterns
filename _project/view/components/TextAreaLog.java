package _project.view.components;

import javafx.scene.control.TextArea;

public class TextAreaLog {
    private TextArea textArea;

    public TextAreaLog() {
        textArea = new TextArea();
    }

    public TextArea getTextArea() {
        textArea.setDisable(false);
        return textArea;
    }

    public void addToLog(String str) {
        textArea.appendText(str + "\n");
    }
}
