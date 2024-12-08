import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class Login {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("admin") && password.equals("1234")) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Inventory.fxml"));
                Scene inventoryScene = new Scene(loader.load());
                Stage stage = (Stage) loginButton.getScene().getWindow();
                stage.setScene(inventoryScene);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Gagal");
            alert.setHeaderText(null);
            alert.setContentText("Username atau Password salah!");
            alert.showAndWait();
        }
    }
}
