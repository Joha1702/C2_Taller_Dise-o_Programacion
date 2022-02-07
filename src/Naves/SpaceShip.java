package Naves;
/*
 * Clase abstracta que representa una nave espacial con sus principales atributos y m�todos.
 * @Author: Leidy Johana Moreno
 */
public abstract class SpaceShip {
	
	/*
	 * Nombre de la nave
	 */
	private String name;
	
	/*
	 * indica si la nave es autopropulsada o no.
	 */
	private boolean selfPropelled;
	
	/*
	 * Potencia de la nave
	 */
	private int power;
	
	/*
	 * Combustible que utiliza la nave
	 */
	private String fuel;
	
	/*
	 * Empuje de la nave en toneladas.
	 */
	private float thrust;
	
	/*
	 * Peso de la nave en toneladas
	 */
	private double weight;
	
	/*
	 * Capacidad de la nave en toneladas o # personas
	 */
	private int capacity;
	
	/*
	 * velocidad de la nave en km/h
	 */
	private float speed;
	
	/*
	 * Pais de fabricaci�n de la nave
	 */
	private String country;
	
	/*
	 * distancia de orbita de la nave en kilometros
	 */
	private int orbitDistance;
	
	/*
	 * M�todo constructor vac�o
	 */
	public SpaceShip() {
		
	}

	/*
	 * M�todo constructor con todos los atributos
	 */
	public SpaceShip(String name, boolean selfPropelled, int power, String fuel, float thrust, double weight,
			int capacity, float speed, String country, int orbitDistance) {
		this.name = name;
		this.selfPropelled = selfPropelled;
		this.power = power;
		this.fuel = fuel;
		this.thrust = thrust;
		this.weight = weight;
		this.capacity = capacity;
		this.speed = speed;
		this.country = country;
		this.orbitDistance = orbitDistance;
	}

	/*
	 * M�todo que devuelve el nombre de la nave
	 */
	public String getName() {
		return name;
	}

	/*
	 * M�todo set que asigna el nombre de la nave.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * M�todo que devuelve si verdadero si la nave es autopropulsada o falso en caso contrario
	 */
	public boolean getSelfPropelled() {
		return selfPropelled;
	}
	
	/*
	 * M�todo set que asigna verdadero si la nave es autopropulsada o falso en caso contrario.
	 */
	public void setSelfPropelled(boolean selfPropelled) {
		this.selfPropelled = selfPropelled;
	}


	/*
	 * M�todo que devuelve la potencia de la nave
	 */
	public int getPower() {
		return power;
	}

	/*
	 * M�todo set para asignar la potencia de la nave
	 */
	public void setPower(int power) {
		this.power = power;
	}

	/*
	 * M�todo get que devuelve un texto con el combustible que utiliza la nave.
	 */
	public String getFuel() {
		return fuel;
	}

	/*
	 * M�todo set que asigna el combustible que utiliza la nave.
	 */
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	/*
	 * M�todo get que devuelve el valor de empuje de la nave en toneladas.
	 */
	public float getThrust() {
		return thrust;
	}

	/*
	 * M�todo set que asigna el valor de empuje de la nave en toneladas.
	 */
	public void setThrust(float thrust) {
		this.thrust = thrust;
	}

	/*
	 * Metodo que devuelve el peso de la nave en toneladas.
	 */
	public double getWeight() {
		return weight;
	}

	/*
	 * M�todo que asigna el peso de la nave en toneladas.
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/*
	 * M�todo que devuelve la capacidad de la nave.
	 */
	public int getCapacity() {
		return capacity;
	}

	/*
	 * M�todo que asigna la capacidad de la nave.
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/*
	 * M�todo que devuelve la velocidad en km/h de la nave
	 */
	public float getSpeed() {
		return speed;
	}

	/*
	 * M�todo que asigna la velocidad en km/h de la nave.
	 */
	public void setSpeed(float speed) {
		this.speed = speed;
	}

	/*
	 * M�todo que devuelve el pais propietario de la nave
	 */
	public String getCountry() {
		return country;
	}

	/*
	 * M�todo que asigna el pa�s de donde es la nave.
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/*
	 * M�todo que devuelve la distancia de orbita de la nave
	 */
	public int getOrbitDistance() {
		return orbitDistance;
	}

	/*
	 * M�todo que asigna la distancia de orbita de la nave.
	 */
	public void setOrbitDistance(int orbitDistance) {
		this.orbitDistance = orbitDistance;
	}

	/*
	 * M�todo para ser implementado el encendido de la nave en las clases que la extiendan
	 */
	public abstract String turnOn();
	
	/*
	 * M�todo para ser implementado el apagado de la nave en las clases que la extiendan
	 */
	public abstract String turnOff();

}
