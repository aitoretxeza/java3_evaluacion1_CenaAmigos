public class Ingrediente {
	
	private String nombreIngrediente;
	private int cantidadGramos, cantidadUnidad;
	private boolean enGramos;

	public void setNombreIngrediente (String nombreIngredienteIntroducido){
			nombreIngrediente = nombreIngredienteIntroducido;
	 	}
		
		public String getNombreIngrediente(){
			return nombreIngrediente;
	 	}

	public void setCantidadGramos (int cantidadGramosIntroducido){
			cantidadGramos = cantidadGramosIntroducido;
	 	}
		
		public int getCantidadGramos(){
			return cantidadGramos;
	 	}

	public void setCantidadUnidad (int cantidadUnidadIntroducido){
			cantidadUnidad = cantidadUnidadIntroducido;
	 	}
		
		public int getCantidadUnidad(){
			return cantidadUnidad;
	 	}

	public void setEnGramos (boolean enGramosIntroducido){
			enGramos = enGramosIntroducido;
	 	}
		
		public boolean getEnGramos(){
			return enGramos;
	 	}

}