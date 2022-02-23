package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Student;
import model.StudentData;

public class VentanaA implements Initializable{

    @FXML
    private TableColumn<Student, String> codeCol;

    @FXML
    private TableColumn<Student, String> nameCol;

    @FXML
    private TableColumn<Student, Integer> natIDCol;

    @FXML
    private TableView<Student> studentTable;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		natIDCol.setCellValueFactory(new PropertyValueFactory<>("natID"));
		codeCol.setCellValueFactory(new PropertyValueFactory<>("code"));
		
		StudentData.data.add(new Student("Andres Andrade", 134345, "A872348"));
		StudentData.data.add(new Student("Bernardo Bernal", 457456, "A87238"));
		StudentData.data.add(new Student("Carlos Caicedo", 678768, "A87238934"));
		
		studentTable.setItems(StudentData.data);
		
	}
    
	@FXML
    void addStudent(ActionEvent event) {
		StudentData.data.add(new Student("Test", 678768, "A87238934"));
    }
    

}

