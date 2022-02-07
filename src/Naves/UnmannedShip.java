package Naves;
/*
 * Clase que representa una nave No tripulada, esta clase extiende los atributos y métodos de la clase abstracta
 * SpaceShip e igualmente implementa los métodos de la interfaz ISpaceShip
 */
public class UnmannedShip extends SpaceShip implements ISpaceShip {

	/*
	 * Nombre del lanzador de la nave
	 */
	private String shuttleName;
	
	/*
	 * Metodo que devuelve el nombre del lanzador de la nave
	 */
	public String getShuttleName() {
		return shuttleName;
	}

	/*
	 * Método que asigna el valor del lanzador de la nave
	 */
	public void setShuttleName(String shuttleName) {
		this.shuttleName = shuttleName;
	}

	/*
	 * Método sobreescrito que indica la tarea de una nave No tripulada
	 */
	@Override
	public String setTask() {
		
		return "Estudiar otros cuerpos celestes";
	}

	/*
	 * Método para orbitar la nave no tripulada a una distancia indicada.
	 */
	@Override
	public String orbit(float orbitDistance) {
		return "Se orbita la nave a "+Float.toString(orbitDistance);
		
	}

	/*
	 * Método para encender la nave
	 */
	@Override
	public String turnOn() {
		
		return "Nave encendida";
	}

	/*
	 * Método para apagar la nave
	 */
	@Override
	public String turnOff() {
		
		return "Nave apagada";
	}

}
