package vn.techmaster.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    public PasswordField text_password;
    public TextField text_username;
    public Label lb_success;
    @FXML
    private Label welcomeText;

    @FXML

    public void onLoginButton(ActionEvent actionEvent) {
        String userName = text_username.getText();
        String passWord = text_password.getText();
        lb_success.setText("Logged in successfully!");
    }
}