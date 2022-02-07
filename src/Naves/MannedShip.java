package Naves;
/*
 * Clase que representa una nave Lanzadora, esta clase extiende los atributos y métodos de la clase abstracta
 * SpaceShip e igualmente implementa los métodos de la interfaz ISpaceShip
 */
public class MannedShip extends SpaceShip implements ISpaceShip {

	/*
	 * Representa el nombre del lanzador de la nave
	 */
	private String shuttleName;
	
	/*
	 * Método que devuelve el nombre del lanzador de la nave tripulada
	 */
	public String getShuttleName() {
		return shuttleName;
	}

	/*
	 * Método que asigna el nombre del lanzador de la nave tripulada
	 */
	public void setShuttleName(String shuttleName) {
		this.shuttleName = shuttleName;
	}
	
	/*
	 * Método sobreescrito para definir la tarea de la nave tripulada
	 */
	@Override
	public String setTask() {
		String message = "Enviar seres humanos al espacio para realizar tareas de mantenimiento o investigación";
		return message;
	}

	/*
	 * Método para orbitar la nave tripulada a una distancia indicada.
	 */
	@Override
	public String orbit(float orbitDistance) {
		return "Se orbita la nave a "+Float.toString(orbitDistance);
	}

	/*
	 * Método para encender la nave tripulada
	 */
	@Override
	public String turnOn() {
		
		return "Se enciende la Nave";
	}

	/*
	 * Método para apagar la nave tripulada
	 */
	@Override
	public String turnOff() {
		
		return "Se apaga la Nave";
	}

}
