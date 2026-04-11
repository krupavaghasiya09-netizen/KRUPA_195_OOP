import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.geometry.Insets;

import java.io.*;
import java.util.regex.Pattern;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage stage) {

      
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

       
        Label rollLabel = new Label("Roll No:");
        TextField rollField = new TextField();

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Button submitBtn = new Button("Submit");

     
        grid.add(rollLabel, 0, 0);
        grid.add(rollField, 1, 0);

        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(ageLabel, 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(emailLabel, 0, 3);
        grid.add(emailField, 1, 3);

        grid.add(submitBtn, 1, 4);

        
        submitBtn.setOnAction(e -> {

            String rollText = rollField.getText();
            String name = nameField.getText();
            String ageText = ageField.getText();
            String email = emailField.getText();

            try {
               
                int rollNo = Integer.parseInt(rollText);
                int age = Integer.parseInt(ageText);

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid Email format!");
                }

                if (name.isEmpty()) {
                    throw new Exception("Name cannot be empty!");
                }

               
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Save Registration Data");
                File file = fileChooser.showSaveDialog(stage);

                if (file != null) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                    bw.write("RollNo: " + rollNo + ", Name: " + name +
                            ", Age: " + age + ", Email: " + email);
                    bw.newLine();
                    bw.close();
                }

                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setHeaderText("Registration Successful!");
                success.setContentText(
                        "Roll No: " + rollNo +
                        "\nName: " + name +
                        "\nAge: " + age +
                        "\nEmail: " + email
                );
                success.show();

            } catch (NumberFormatException ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Invalid Input");
                error.setContentText("Roll No and Age must be integers!");
                error.show();

            } catch (Exception ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Validation Failed");
                error.setContentText(ex.getMessage());
                error.show();
            }
        });

        Scene scene = new Scene(grid, 400, 300);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
