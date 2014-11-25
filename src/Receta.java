import java.util.ArrayList;

public class Receta {
	
	private String nombreReceta, preparacion;
	private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

	public void setNombreReceta (String nombreRecetaIntroducido){
			nombreReceta = nombreRecetaIntroducido;
	 	}
		
	public String getNombreReceta(){
			return nombreReceta;
	 	}

	public void setIngredientes (ArrayList ingredientesIntroducido){
			ingredientes = ingredientesIntroducido;
	 	}
		
	public ArrayList getIngredientes(){
			return ingredientes;
	 	}

	public void setPreparacion (String preparacionIntroducido){
			preparacion = preparacionIntroducido;
	 	}
		
	public String getPreparacion(){
			return preparacion;
	 	}

}