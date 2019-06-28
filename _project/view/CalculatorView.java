package _project.view;

import _project.RequestType;
import _project.controller.CalculationController;
import _project.model.Calculation;
import _project.view.components.CalButton;
import _project.view.components.TextAreaLog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import static _project.RequestType.*;

public class CalculatorView {
    private final CalculationController controller;

    private final String[] numericButtons    = {"1", "2", "3", "4", "5", "6", "7", "8", "9" ,"0"};
    private final String[] arithmeticButtons = {"+", "-", "*", "/", "^"};
    private final String[] memoryButtons     = {"RESET"};

    private final BorderPane layout      = new BorderPane();
    private final TextField resultField  = new TextField();
    private final TextField displayField = new TextField();
    private final TextAreaLog log        = new TextAreaLog();

    public CalculatorView(CalculationController controller) {
        this.controller = controller;
        setHeader();
        setCenter();
        setFooter();
    }

    public void update(String input, RequestType requestType) {
        Calculation calculation = controller.handleRequest(input, requestType);
        updateView(calculation.toString(), calculation.getResult(), requestType);
    }

    private void updateView(String calculationString, int resultString, RequestType requestType) {
        if(requestType == MEMORY) {
            log.addToLog(displayField.getText() + " = " + resultField.getText());
        }

        displayField.setText(calculationString);
        resultField.setText(resultString + "");
    }

    /* GUI Stuff */
    public BorderPane getLayout() {
        return layout;
    }

    private void setHeader() {
        HBox hbox = new HBox();
        hbox.getChildren().addAll(displayField,new Label(" = "),resultField);
        layout.setTop(hbox);
    }

    private void setCenter() {
        HBox numerics   = addButtonsToLayout(numericButtons, NUMERIC);
        HBox arithmetic = addButtonsToLayout(arithmeticButtons, ARITHMETIC);
        HBox memory     = addButtonsToLayout(memoryButtons, MEMORY);

        VBox vbox = new VBox();
        vbox.getChildren().addAll(numerics, arithmetic, memory);

        layout.setCenter(vbox);
    }

    private void setFooter() {
        layout.setBottom(log.getTextArea());
    }

    private HBox addButtonsToLayout(String[] values, RequestType requestType) {
        HBox hbox = new HBox();

        for (String value : values) {
            CalButton btn = new CalButton(value, requestType);
            btn.addObserver(this);
            hbox.getChildren().add(btn.getButton());
        }

        return hbox;
    }
}
