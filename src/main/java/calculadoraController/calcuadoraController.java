package calculadoraController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import calculadora.Calculadora;
import calculadoraModel.calculadoraModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class calcuadoraController implements Initializable {

	@FXML
	private GridPane view;

	@FXML
	private TextField pantallaText;

	@FXML
	private Button sieteButton;

	@FXML
	private Button ochoButton;

	@FXML
	private Button nueveButton;

	@FXML
	private Button ceButton;

	@FXML
	private Button cButton;

	@FXML
	private Button cuatroButton;

	@FXML
	private Button cincoButton;

	@FXML
	private Button seisButton;

	@FXML
	private Button multiplicacionButton;

	@FXML
	private Button divisionButton;

	@FXML
	private Button unoButton;

	@FXML
	private Button dosButton;

	@FXML
	private Button tresButton;

	@FXML
	private Button restaButton;

	@FXML
	private Button igualButton;

	@FXML
	private Button ceroButton;

	@FXML
	private Button puntoButton;

	@FXML
	private Button sumaButton;

	Calculadora calc = new Calculadora();

	calculadoraModel model = new calculadoraModel();

	public calcuadoraController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}

	@FXML
	public void C(ActionEvent event) {
		calc.borrar();
	}

	@FXML
	public void CE(ActionEvent event) {
		calc.borrarTodo();
		pantallaText.setText(calc.getPantalla());
	}

	@FXML
	public void Cero(ActionEvent event) {
		char num = ((Button) event.getSource()).getText().charAt(0);
		calc.insertar(num);
		pantallaText.setText(calc.getPantalla());
	}

	@FXML
	public void Uno(ActionEvent event) {
		char num = ((Button) event.getSource()).getText().charAt(0);
		calc.insertar(num);
		pantallaText.setText(calc.getPantalla());

	}

	@FXML
	public void Dos(ActionEvent event) {
		char num = ((Button) event.getSource()).getText().charAt(0);
		calc.insertar(num);
		pantallaText.setText(calc.getPantalla());
	}

	@FXML
	public void Tres(ActionEvent event) {
		char num = ((Button) event.getSource()).getText().charAt(0);
		calc.insertar(num);
		pantallaText.setText(calc.getPantalla());
	}

	@FXML
	public void Cuatro(ActionEvent event) {
		char num = ((Button) event.getSource()).getText().charAt(0);
		calc.insertar(num);
		pantallaText.setText(calc.getPantalla());
	}

	@FXML
	public void Cinco(ActionEvent event) {
		char num = ((Button) event.getSource()).getText().charAt(0);
		calc.insertar(num);
		pantallaText.setText(calc.getPantalla());
	}

	@FXML
	public void Seis(ActionEvent event) {
		char num = ((Button) event.getSource()).getText().charAt(0);
		calc.insertar(num);
		pantallaText.setText(calc.getPantalla());
	}

	@FXML
	public void Siete(ActionEvent event) {
		char num = ((Button) event.getSource()).getText().charAt(0);
		calc.insertar(num);
		pantallaText.setText(calc.getPantalla());
	}

	@FXML
	public void Ocho(ActionEvent event) {
		char num = ((Button) event.getSource()).getText().charAt(0);
		calc.insertar(num);
		pantallaText.setText(calc.getPantalla());
	}

	@FXML
	public void Nueve(ActionEvent event) {
		calc.insertar(nueveButton.getText().charAt(0));
		pantallaText.setText(calc.getPantalla());
	}

	@FXML
	public void Division(ActionEvent event) {
		calc.operar(divisionButton.getText().charAt(0));
		pantallaText.setText(calc.getPantalla());
	}

	@FXML
	public void Igual(ActionEvent event) {
		calc.operar(igualButton.getText().charAt(0));
		pantallaText.setText(calc.getPantalla());
	}

	@FXML
	public void Multiplicacion(ActionEvent event) {
		calc.operar(multiplicacionButton.getText().charAt(0));
		pantallaText.setText(calc.getPantalla());
	}

	@FXML
	public void Resta(ActionEvent event) {
		calc.operar(restaButton.getText().charAt(0));
		pantallaText.setText(calc.getPantalla());
	}

	@FXML
	public void Suma(ActionEvent event) {
		calc.operar(sumaButton.getText().charAt(0));
		pantallaText.setText(calc.getPantalla());
	}

	@FXML
	public void Punto(ActionEvent event) {
		calc.insertarComa();
		pantallaText.setText(calc.getPantalla());
	}

	public GridPane getView() {
		return view;
	}

	public calculadoraModel getModel() {
		return model;
	}

	public void initialize(URL location, ResourceBundle resources) {
//		pantallaText.textProperty().bind(model.pantallaProperty());
		pantallaText.setText(calc.getPantalla());
		
		MenuItem clasicoItem = new MenuItem("Clásico");
		clasicoItem.setOnAction(e -> {
			view.getStylesheets().add("/css/ClassicStyle.css");
		});

		MenuItem modernoItem = new MenuItem("Moderno");
		modernoItem.setOnAction(e -> {
			view.getStylesheets().add("/css/ModernStyle.css");
		});

		ContextMenu menu = new ContextMenu(clasicoItem, modernoItem);

		view.setOnContextMenuRequested(e -> {
			menu.show(view, e.getScreenX(), e.getScreenY());
		});
	}

}
