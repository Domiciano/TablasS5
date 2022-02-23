package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Student;
import model.StudentData;

public class VentanaB implements Initializable {

	@FXML
	private TextField codeTF;

	@FXML
	private TextField nameTF;

	@FXML
	private TextField natIDTF;

	@FXML
	void add(ActionEvent event) {
		String name = nameTF.getText();
		String code = codeTF.getText();
		int cedula = Integer.parseInt(natIDTF.getText());
		Student st = new Student(name, cedula, code);
		StudentData.data.add(st);

		Stage stage = (Stage) nameTF.getScene().getWindow();
		stage.close();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
