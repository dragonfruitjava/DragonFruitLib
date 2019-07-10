package me.astronomize.dragonfruit.vector;

/**
 * <pre>
 * Vector2(float x, float y)
 * A vector with 2 arguments.
 * </pre>
 * 
 * @author astronomize
 */
public class Vector2 {

	float x, y;

	public Vector2(float x, float y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * returns the x value of this vector.
	 * 
	 * @since 0.00.00
	 */
	public float getX() {
		return this.x;
	}

	/**
	 * returns the y value of this vector.
	 * 
	 * @since 0.00.00
	 */
	public float getY() {
		return this.y;
	}

	/**
	 * Checks if the specified vector's values are equal to the values in this
	 * vector.
	 * 
	 * @since 0.00.00
	 */
	public boolean equals(Vector2 arg0) {

		if (this.x == arg0.getX() && this.y == arg0.getY()) {
			return true;
		}

		return false;
	}

	/**
	 * Returns this vector converted to a string.
	 * 
	 * @since 0.00.00
	 */
	@Override
	public String toString() {
		return x + ", " + y;
	}
}
