package Tema1;

public class contenedor {
	private int x;
	private int y;
	
	public contenedor (byte x, byte y) {
		this.setx(x);
	}
	/**
	 * @return regresa una prueba
	 */
	public String toString() {
		return "casa de madera";
	}
	
	public int getx() {
		return this.x;
	}

	public void setx(int x) {
		this.x=x;
	}
}
