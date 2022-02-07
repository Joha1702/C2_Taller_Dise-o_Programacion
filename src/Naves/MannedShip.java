package Naves;
/*
 * Clase que representa una nave Lanzadora, esta clase extiende los atributos y m�todos de la clase abstracta
 * SpaceShip e igualmente implementa los m�todos de la interfaz ISpaceShip
 */
public class MannedShip extends SpaceShip implements ISpaceShip {

	/*
	 * Representa el nombre del lanzador de la nave
	 */
	private String shuttleName;
	
	/*
	 * M�todo que devuelve el nombre del lanzador de la nave tripulada
	 */
	public String getShuttleName() {
		return shuttleName;
	}

	/*
	 * M�todo que asigna el nombre del lanzador de la nave tripulada
	 */
	public void setShuttleName(String shuttleName) {
		this.shuttleName = shuttleName;
	}
	
	/*
	 * M�todo sobreescrito para definir la tarea de la nave tripulada
	 */
	@Override
	public String setTask() {
		String message = "Enviar seres humanos al espacio para realizar tareas de mantenimiento o investigaci�n";
		return message;
	}

	/*
	 * M�todo para orbitar la nave tripulada a una distancia indicada.
	 */
	@Override
	public String orbit(float orbitDistance) {
		return "Se orbita la nave a "+Float.toString(orbitDistance);
	}

	/*
	 * M�todo para encender la nave tripulada
	 */
	@Override
	public String turnOn() {
		
		return "Se enciende la Nave";
	}

	/*
	 * M�todo para apagar la nave tripulada
	 */
	@Override
	public String turnOff() {
		
		return "Se apaga la Nave";
	}

}
