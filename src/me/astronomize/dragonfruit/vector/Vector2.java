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
	 * <pre>
	 * returns the x value of this vector.
	 * <pre>
	 * 
	 * @since 0.00.00
	 */
	public float getX() {
		return this.x;
	}

	/**
	 * <pre>
	 * returns the y value of this vector.
	 * </pre>
	 * 
	 * @since 0.00.00
	 */
	public float getY() {
		return this.y;
	}

	/**
	 * <pre>
	 * Checks if the specified vector's values are equal to the values in this
	 * vector.
	 * </pre>
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
	 * <pre>
	 *  Returns this vector converted to a string.
	 * <pre>
	 * 
	 * @since 0.00.00
	 */
	@Override
	public String toString() {
		return x + ", " + y;
	}
	
	/**
	 * <pre>
	 * Adds the values of this vector onto arg0 returns a new vector with the
	 * final results.
	 * </pre>
	 * @since 0.00.02
	 */
	public Vector2 add(Vector2 arg0) {
		return new Vector2(this.x + arg0.getX(), this.y + arg0.getY());
	}
	
	/**
	 * <pre>
	 * Subtracts the values of this vector from  arg0 returns a new vector with the
	 * final results.
	 * </pre>
	 * @since 0.00.02
	 */
	public Vector2 subtract(Vector2 arg0) {
		return new Vector2(this.x - arg0.getX(), this.y - arg0.getY());
	}
	
	/**
	 * <pre>
	 * Divides the values of this vector from arg0 returns a new vector with the
	 * final results.
	 * </pre>
	 * @since 0.00.02
	 */
	public Vector2 divide(Vector2 arg0) {
		return new Vector2(this.x / arg0.getX(), this.y / arg0.getY());
	}
	
	/**
	 * <pre>
	 * Multiplies the values of this vector from  arg0 returns a new vector with the
	 * final results.
	 * </pre>
	 * @since 0.00.02
	 */
	public Vector2 multiply(Vector2 arg0) {
		return new Vector2(this.x * arg0.getX(), this.y * arg0.getY());
	}
}
