package hellofx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        Label titleLabel = new Label("Currency Converter");
        gridPane.add(titleLabel, 0, 0, 2, 1);

        Label euroLabel = new Label("Euros:");
        gridPane.add(euroLabel, 0, 1);

        TextField euroTextField = new TextField();
        gridPane.add(euroTextField, 1, 1);

        Button euroToDollarButton = new Button("Convert to Dollars");
        gridPane.add(euroToDollarButton, 0, 2);

        Label dollarLabel = new Label("Dollars:");
        gridPane.add(dollarLabel, 0, 3);

        TextField dollarTextField = new TextField();
        gridPane.add(dollarTextField, 1, 3);

        Button dollarToEuroButton = new Button("Convert to Euros");
        gridPane.add(dollarToEuroButton, 0, 4);

        // More conversion options can be added here...

        euroToDollarButton.setOnAction(event -> {
            double amount = Double.parseDouble(euroTextField.getText());
            double convertedAmount = amount * 1.10; // Replace with the actual conversion rate
            dollarTextField.setText(String.valueOf(convertedAmount));
        });

        dollarToEuroButton.setOnAction(event -> {
            double amount = Double.parseDouble(dollarTextField.getText());
            double convertedAmount = amount / 1.10; // Replace with the actual conversion rate
            euroTextField.setText(String.valueOf(convertedAmount));
        });

        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Currency Converter");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
