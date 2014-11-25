import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CenaAmigos {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.print("Escriba el número de recetas que utilizara en su cena de amigos: ");
		int respuestaReceta = Integer.parseInt(sc.nextLine());

		ArrayList<Receta> recetas = new ArrayList<Receta>();

		int n;
		respuestaReceta = respuestaReceta + 1;
		for(n=1; n<respuestaReceta; n++) {
			Receta receta = new Receta();

			System.out.print("Escriba el nombre de la receta " + n + ": ");
			receta.setNombreReceta(sc.nextLine());

			System.out.print("Escriba el número de ingredientes que utilizara en su receta: ");
			int respuestaIngrediente = Integer.parseInt(sc.nextLine());

				int x;
				respuestaIngrediente = respuestaIngrediente + 1;
				for(x=1; x<respuestaIngrediente; x++) {
					Ingrediente ingrediente = new Ingrediente();

					System.out.print("Escriba el nombre del ingrediente numero " + x + ": ");
					ingrediente.setNombreIngrediente(sc.nextLine());

					System.out.print("Escriba si su ingrediente usa Unidades (U) o Gramos (G): ");
					String respuestaUnidad = sc.nextLine();
					char respuestaUnidadChar = respuestaUnidad.charAt(0);

					if (respuestaUnidadChar == 'G' || respuestaUnidadChar == 'g') {
						ingrediente.setEnGramos(true);
						System.out.print("Escriba la cantidad de gramos: ");
						int respuestaGramos = Integer.parseInt(sc.nextLine());
						ingrediente.setCantidadGramos(respuestaGramos);

					} else if (respuestaUnidadChar == 'U' || respuestaUnidadChar == 'u') {
						ingrediente.setEnGramos(false);
						System.out.print("Escriba la cantidad de unidades: ");
						int respuestaNoGramos = Integer.parseInt(sc.nextLine());
						ingrediente.setCantidadUnidad(respuestaNoGramos);
					}
				}

			System.out.print("Escriba el modo de preparacion en su receta: ");
			receta.setPreparacion(sc.nextLine());

			recetas.add(receta);
		}
	}
}