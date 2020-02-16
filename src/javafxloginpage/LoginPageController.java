package javafxloginpage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Tristan
 * @version 1.0 Very simple login application
 */
public class LoginPageController implements Initializable {
    
    @FXML
    private Label result;
    
    @FXML
    private TextField userTextField, passTextField;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String username = userTextField.getText();
        String password = passTextField.getText();
        
        if (username.equals("javafx") && password.equals("letmepass")) {
            result.setText("Success!");
        } else {
            result.setText("Access Denied!");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
