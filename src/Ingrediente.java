public class Ingrediente {
	
	private String nombreIngrediente;
	private int cantidadGramos, cantidadUnidad;
	private boolean enGramos;

	public void setNombreIngrediente (String nombreIngredienteIntroducido) {

		this.nombreIngrediente = nombreIngredienteIntroducido;
	}
		
	public String getNombreIngrediente() {

		return this.nombreIngrediente;
	}

	public void setCantidadGramos (int cantidadGramosIntroducido) {

		this.cantidadGramos = cantidadGramosIntroducido;
	}
		
	public int getCantidadGramos() {

		return this.cantidadGramos;
	}

	public void setCantidadUnidad (int cantidadUnidadIntroducido) {

		this.cantidadUnidad = cantidadUnidadIntroducido;
	}
		
	public int getCantidadUnidad() {

		return this.cantidadUnidad;
	}

	public void setEnGramos (boolean enGramosIntroducido) {

		this.enGramos = enGramosIntroducido;
	}
		
	public boolean getEnGramos() {

		return this.enGramos;
	}
}
