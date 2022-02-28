package vn.techmaster.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.Objects;

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
        String uN = "abc";
        String pW = "123";
        if (userName.equals(uN)) {
            if (passWord.equals(pW)) {
                lb_success.setText("Logged in successfully!");
            } else {
                lb_success.setText("Login failed!");
            }
        } else {
            lb_success.setText("Login failed!");
        }
    }
}