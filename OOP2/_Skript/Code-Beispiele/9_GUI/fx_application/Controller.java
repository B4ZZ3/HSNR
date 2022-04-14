package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	private TextField name;

	@FXML
	private Label result;

	@FXML
	public void handleButton(ActionEvent event) {
		result.setText("Hallo " + name.getText());
	}
}
