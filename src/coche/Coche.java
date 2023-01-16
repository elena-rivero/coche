
package coche;

/* Estoy en la rama 1 */
/* Cambio de la rama 2 */
public class Coche {

	private String nombre;
	private double precio;
	private double precioIVA;
	private int stock;

	/* Constructor sin argumentos */
	public Coche() {
	}
	
	// Constructor con par�metros para iniciar todas las propiedades de la clase
	// coche
	public Coche(String nom, double precio, int stock) {
		this.nombre = nom;
		this.precio = precio;
		this.stock = stock;
	}

	// M�todo para asignar el nombre del coche
	public void asignarNombre(String nom) {
		nombre = nom;
	}

	// M�todo que me devuelve el nombre del coche
	public String obtenerNombre() {
		return nombre;
	}

	// M�todo que me devuelve el stock de coches disponible en cada momento
	public int obtenerStock() {
		return stock;
	}

	/*
	 * M�todo para comprar coches. Modifica el stock.
	 */
	public void comprar(int cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede comprar un n�mero negativo de coches");
		stock = stock + cantidad;
	}

	public void vender(int cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede vender una cantidad negativa de coches");
		if (obtenerStock() < cantidad)
			throw new Exception("No hay suficientes coches para vender");
		stock = stock - cantidad;
	}

}
