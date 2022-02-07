package Naves;
/*
 * Clase principal donde se permite a un usuario crear naves espaciales de diferentes tipos.
 * para esto se utiliza cilco do while que se repetirá hasta que el usuario desee crear navesd y dentro 
 * un swith case con las opciones de los tipos de naves a crear.
 * @Author Leidy Johana Moreno
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		/*
		 * atributo que representa una lista de tipo nave espacial (clase abstracta SpaceShip)
		 */
		List<SpaceShip> ships = new ArrayList<SpaceShip>();
		
		/*
		 * Atributo para capturar del usuario si desea crear (valor 1) o no (valor 2) una nave.
		 */
		int operation = 0;
		
		/*
		 * atributo para controlar el ciclo do while, se repite el ciclo siempre que el atributo flat sea verdadero.
		 */
		boolean flat = false;
		
		/*
		 * Atributo para capturar el tipo de nave espacial que el usuario desea crear 1. lanzadera, 2 No tripulada 3. Tripulada
		 */
		int typeShip = 0;
		
		/*
		 * Atributo para mostrar un mensaje al usuario cada que se cree una nueva nave.
		 */
		String message = "";
		
		do {
			operation = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Bienvenido, que desea reaizar:\n" + "1. Crear una nave\n" + "2. Finalizar"));

			if (operation == 1) {
				typeShip = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que tipo de nave desea crear?\n"
						+ "1. Nave Lanzadora\n" + "2. Nave No Tripulada\n" + "3. Nave Tripulada\n" + "0. Salir"));

				Map<String, String> data = null;
				
				switch (typeShip) {
				case 1:
					ShuttleShip shuttleShip = new ShuttleShip();
					data = captureData();
					shuttleShip.setName(data.get("name"));
					shuttleShip.setSelfPropelled(true);
					shuttleShip.setPower(Integer.parseInt(data.get("power")));
					shuttleShip.setFuel(data.get("fuel"));
					shuttleShip.setThrust(Float.valueOf(data.get("thrust")));
					shuttleShip.setWeight(Double.valueOf(data.get("weight")));
					shuttleShip.setCountry(data.get("country"));
					shuttleShip.setSpeed(Float.valueOf(data.get("speed")));
					shuttleShip.setOrbitDistance(Integer.parseInt(data.get("speed")));
					int capacity = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de la nave en toneladas"));
					shuttleShip.setCapacity(capacity);
					String spaceShip = JOptionPane.showInputDialog("Ingrese el satelite, sonda o Nave tripulada a Lanzar");
					shuttleShip.setSpaceShip(spaceShip);
					ships.add(shuttleShip);
					message = "Se crea la Nave espacial Lanzadora "+shuttleShip.getName();
					break;
				case 2:
					UnmannedShip unmannedShip = new UnmannedShip();
					data = captureData();
					unmannedShip.setName(data.get("name"));
					unmannedShip.setSelfPropelled(true);
					unmannedShip.setPower(Integer.parseInt(data.get("power")));
					unmannedShip.setFuel(data.get("fuel"));
					unmannedShip.setThrust(Float.valueOf(data.get("thrust")));
					unmannedShip.setWeight(Double.valueOf(data.get("weight")));
					unmannedShip.setCountry(data.get("country"));
					unmannedShip.setSpeed(Float.valueOf(data.get("speed")));
					unmannedShip.setOrbitDistance(Integer.parseInt(data.get("speed")));
					int capacityUnmanned = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de la nave en toneladas"));
					unmannedShip.setCapacity(capacityUnmanned);
					String shuttleName = JOptionPane.showInputDialog("Ingrese el nombre de Lanzador");
					unmannedShip.setShuttleName(shuttleName);
					ships.add(unmannedShip);
					message = "Se crea la Nave espacial No tripulada "+unmannedShip.getName();
					break;
				case 3:
					MannedShip mannedShip = new MannedShip();
					data = captureData();
					mannedShip.setName(data.get("name"));
					mannedShip.setSelfPropelled(true);
					mannedShip.setPower(Integer.parseInt(data.get("power")));
					mannedShip.setFuel(data.get("fuel"));
					mannedShip.setThrust(Float.valueOf(data.get("thrust")));
					mannedShip.setWeight(Double.valueOf(data.get("weight")));
					mannedShip.setCountry(data.get("country"));
					mannedShip.setSpeed(Float.valueOf(data.get("speed")));
					mannedShip.setOrbitDistance(Integer.parseInt(data.get("speed")));
					int capacityManned = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de la nave en número de personas"));
					mannedShip.setCapacity(capacityManned);
					String shuttleName2 = JOptionPane.showInputDialog("Ingrese el nombre de Lanzador");
					mannedShip.setShuttleName(shuttleName2);
					ships.add(mannedShip);
					message = "Se crea la Nave espacial Tripulada "+mannedShip.getName();
					break;

				default:
					break;
				}
				
				JOptionPane.showMessageDialog(null, message);
				
				operation = Integer.parseInt(JOptionPane.showInputDialog(null,
						"¿Desea ingresar otra nave?\n" + "1. Si\n" + "2. No"));
				
				flat = (operation == 1);				
			} else {
				
				flat = false;
			}
			

		} while (flat);

	}
	
	/*
	 * Metodo para capturar del usuario los datos necesarios para crear una nave, estos datos se almacenan en 
	 * en una lista tipo Map.
	 */
	public static Map<String, String> captureData(){
		Map<String, String> data = new HashMap<String, String>();
		
		String name = JOptionPane.showInputDialog(null, "Ingrese nombre de la nave");
		data.put("name", name);
		
		String power = JOptionPane.showInputDialog(null, "Ingrese la potencia de la nave");
		data.put("power", power);
		
		String fuel = JOptionPane.showInputDialog(null, "Ingrese el combustible que utiliza nave");
		data.put("fuel", fuel);
		
		String thrust = JOptionPane.showInputDialog(null, "Ingrese el empuje de la nave en toneladas");
		data.put("thrust", thrust.replace(",", "."));
		
		String weight = JOptionPane.showInputDialog(null, "Ingrese el peso de la nave en toneladas");
		data.put("weight", weight.replace(",", ".")); 
		
		String speed = JOptionPane.showInputDialog(null, "Ingrese la velocidad de la nave en km/h");
		data.put("speed", speed.replace(",", "."));
		
		String country = JOptionPane.showInputDialog(null, "Ingrese el país origen de la nave");
		data.put("country", country);
		
		String orbitDistance = JOptionPane.showInputDialog(null, "Ingrese la distancia a orbitar de la nave");
		data.put("orbitDistance", orbitDistance);
		
		return data;
	}

}
