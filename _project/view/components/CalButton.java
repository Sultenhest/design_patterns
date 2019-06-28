package _project.view.components;

import _project.RequestType;
import _project.view.CalculatorView;
import javafx.scene.control.Button;

public class CalButton {
    private String value;
    private RequestType requestType;

    private CalculatorView view;
    private Button button;

    public CalButton(String value, RequestType requestType) {
        this.value = value;
        this.requestType = requestType;

        button = new Button(value);

        //button.setDisable(true);

        button.setOnAction(event ->
            this.notifyObserver()
        );
    }

    public Button getButton() {
        return button;
    }

    public void addObserver(CalculatorView view) {
        this.view = view;
    }

    private void notifyObserver() {
        view.update(value, requestType);
    }
}
