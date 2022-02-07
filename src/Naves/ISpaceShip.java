package Naves;
/*
 * Interfaz que contiene los m�todos que se deben implementar en las clases que la implementen.
 * @Author: Leidy Johana Moreno
 */
public interface ISpaceShip {
	
	/*
	 * M�todo set Tarea que se debe implementar en las clases e indicar cual es la Misi�n de la nave.
	 */
	public String setTask();
	
	/*
	 * M�todo orbit que se debe implementar en las clases para poner la nave a orbitar a una distancia dada.
	 */
	public String orbit(float orbitDistance);

}
