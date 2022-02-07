package Naves;
/*
 * Clase que representa una nave Lanzadora, esta clase extiende los atributos y m�todos de la clase abstracta
 * SpaceShip e igualmente implementa los m�todos de la interfaz ISpaceShip
 */
public class ShuttleShip extends SpaceShip implements ISpaceShip {

	/*
	 * representa la nave espacial que Lanza la nave lanzadera.
	 */
	private String spaceShip;

	/*
	 * M�todo que devuelve el nombre de la nave, satelite o sonda que lanza la nave
	 */
	public String getSpaceShip() {
		return spaceShip;
	}

	/*
	 * M�todo que asigna el nombre de la nave, satelite o sonda que lanza la nave
	 */
	public void setSpaceShip(String spaceShip) {
		this.spaceShip = spaceShip;
	}
	
	/*
	 * M�todo sobreescrito que indica la tarea que realiza la nave espacial de tipo lanzadera.
	 */
	@Override
	public String setTask() {
		
		return "Lanzar satelites, sondas o naves al espacio";
	}

	/*
	 * M�todo para poner a orbitar la nave a una distancia determinada.
	 */
	@Override
	public String orbit(float orbitDistance) {
		return "Se orbita la nave a "+Float.toString(orbitDistance);
		
	}

	/*
	 * M�todo implementado para encender la nave
	 */
	@Override
	public String turnOn() {
		
		return "Nave encendida";
	}

	/*
	 * M�todo implementado para apagar la nave
	 */
	@Override
	public String turnOff() {
		
		return "Nave apagada";
	}
	
	/*
	 * M�todo para que permite lanzar la nave espacial indicada.
	 */
	public String launchShip(String spaceShip) {
		
		String message = "Se lanza la nave "+spaceShip;
		return message;
		
	}

}
