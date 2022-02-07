package Naves;
/*
 * Interfaz que contiene los métodos que se deben implementar en las clases que la implementen.
 * @Author: Leidy Johana Moreno
 */
public interface ISpaceShip {
	
	/*
	 * Método set Tarea que se debe implementar en las clases e indicar cual es la Misión de la nave.
	 */
	public String setTask();
	
	/*
	 * Método orbit que se debe implementar en las clases para poner la nave a orbitar a una distancia dada.
	 */
	public String orbit(float orbitDistance);

}
