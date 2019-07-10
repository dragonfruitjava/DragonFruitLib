package me.astronomize.dragonfruit.vector;

import java.awt.Color;

/**
 * <pre>
 * Vector3(float x, float y, float z)
 * A vector with 3 arguments.
 * </pre>
 * 
 * @author astronomize
 */
public class Vector3 {

	float x, y, z;

	public Vector3(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
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
	 * returns the z value of this vector.
	 * 
	 * @since 0.00.00
	 */
	public float getZ() {
		return this.z;
	}

	/**
	 * Checks if the specified vector's values are equal to the values in this
	 * vector.
	 * 
	 * @since 0.00.00
	 */
	public boolean equals(Vector3 arg0) {

		if (this.x == arg0.getX() && this.y == arg0.getY() && this.z == arg0.getZ()) {
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
		return x + ", " + y + ", " + z;
	}
	
	/**
	 * Returns a new color with the x, y, and z values of this vector.
	 * 
	 * @since 0.00.01
	 */
	public Color toColor() {
		return new Color(this.x, this.y, this.z);
	}
}
