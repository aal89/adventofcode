package adventofcode.day3.utils;

/**
 * A super simple 2d vector. It doesn't do anything other then to store x and y variables and a compare method.
 * @author Alexx
 *
 */
public class Vector2D {
	
	public int x = 0;
	public int y = 0;
	
	public Vector2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Compares x and y variables of two vectors.
	 * @param vector Check against this vector.
	 * @return True when x and y are equal, false otherwise.
	 */
	public boolean equals(Vector2D vector) {
		boolean b = (this.x == vector.x && this.y == vector.y);
		return b;
	}

}
