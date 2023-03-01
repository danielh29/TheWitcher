package witcher;

/**
 * Clase que representa un brujo con tres atributos, name, health y hasSoul
 * Esta clase se usará para un videojuego RPG
 * 
 * @author Daniel
 * @version 1.0
 * 
 *
 */

public class Witcher {
	
	/**
	 * atributo name que es el nombre del brujo
	 */

	private String name;
	
	//Vida del brujo
	private int health;
	
	//Si el brujo tiene o no alma
	private boolean hasSoul;

	
	/**
	 *Getter para obtener el nombre del brujo 
	 * @return Devuelve el nombre del brujo
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * Setter guarda el nombre
	 * @param name Nommbre del brujo
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter para obtener la cantidad de vida del brujo
	 * @return Devuelve el numero de vidas que le quedan al brujo
	 */
	public int getHealth() {
		return health;
	}

	
	/**
	 * Setter para establecer la vida del brujo
	 * @param health Devuelve la cantidad de vida del brujo
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * Función para saber si tiene alma
	 * @return Devuelve si el brujo tiene alma o no.
	 */
	public boolean isHasSoul() {
		return hasSoul;
	}

	/**
	 * Setter para guardar el alma del brujo
	 * @param hasSoul valor booleano si tiene o no alma
	 */
	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}

	
	/**
	 * Nos dice si el brujo está muerto o no:
	 * <ul>
	 * <li> Si tiene o no vida,</li>
	 * <li> Si tiene vida, pero no tiene alma.</li>
	 * </ul>
	 * @return Si está muerto o no.
	 */
	public boolean isDeath() {

		if (health == 0) {
			return true;
		} else if (!hasSoul) {
			return true;
		} else {
			return false;
		}

	}

}
