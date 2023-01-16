
package coche;

public abstract class Main {

	public static final String MODELO = "Opel";

	public static void main(String[] args) {
		Coche miCoche;
		int stockActual;

		miCoche = new Coche(MODELO, 12000, 500);
		try {
			System.out.println("Venta de Coches");
			miCoche.vender(300);
		} catch (Exception e) {
			System.out.print("Fallo al vender");
		}

		try {
			System.out.println("Compra de Coches");
			miCoche.comprar(500);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
		stockActual = miCoche.obtenerStock();
		System.out.println("El stock actual es" + stockActual);
	}

}
