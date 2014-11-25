import java.util.ArrayList;

public class Receta {
	
	private String nombreReceta, preparacion;
	private ArrayList<Ingrediente> ingredientes;

	public void setNombreReceta (String nombreRecetaIntroducido) {

		this.nombreReceta = nombreRecetaIntroducido;
	}
		
	public String getNombreReceta() {

		return this.nombreReceta;
	}

	public void setIngredientes (ArrayList<Ingrediente> ingredientesIntroducido) {

		this.ingredientes = ingredientesIntroducido;
	}
		
	public ArrayList<Ingrediente> getIngredientes() {

		return this.ingredientes;
	}

	public void setPreparacion (String preparacionIntroducido) {

		this.preparacion = preparacionIntroducido;
	}
		
	public String getPreparacion() {

		return this.preparacion;
	}

}
