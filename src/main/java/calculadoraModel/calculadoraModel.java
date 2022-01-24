package calculadoraModel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class calculadoraModel {

	private StringProperty pantalla = new SimpleStringProperty();

	public final StringProperty pantallaProperty() {
		return this.pantalla;
	}
	
	public final String getPantalla() {
		return this.pantallaProperty().get();
	}
}
