package _project;

import _project.controller.CalculationController;
import _project.model.Calculation;
import _project.view.CalculatorView;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Start extends Application {
    private static Calculation           model;
    private static CalculationController controller;
    private static CalculatorView        view;

    private static final int WINDOW_WIDTH  = 400;
    private static final int WINDOW_HEIGHT = 400;

    public static void main(String[] args) {
        model      = new Calculation();
        controller = new CalculationController(model);
        view       = new CalculatorView(controller);

        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Calculator");

        Scene scene = new Scene(view.getLayout(), WINDOW_WIDTH, WINDOW_HEIGHT);

        stage.setScene(scene);

        stage.show();
    }
}
