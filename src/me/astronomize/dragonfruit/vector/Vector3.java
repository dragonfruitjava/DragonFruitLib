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
	 * <pre>
	 * returns the x value of this vector.
	 * </pre>
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
	 * returns the z value of this vector.
	 * </pre>
	 * 
	 * @since 0.00.00
	 */
	public float getZ() {
		return this.z;
	}

	/**
	 * <pre>
	 * Checks if the specified vector's values are equal to the values in this
	 * vector.
	 * </pre>
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
	 * <pre>
	 * Returns this vector converted to a string.
	 * </pre>
	 * 
	 * @since 0.00.00
	 */
	@Override
	public String toString() {
		return x + ", " + y + ", " + z;
	}
	
	/**
	 * <pre>
	 * Returns a new color with the x, y, and z values of this vector.
	 * </pre>
	 * 
	 * @since 0.00.01
	 */
	public Color toColor() {
		return new Color(this.x, this.y, this.z);
	}
	
	/**
	 * <pre>
	 * Adds the values of this vector onto arg0 returns a new vector with the
	 * final results.
	 * </pre>
	 * @since 0.00.02
	 */
	public Vector3 add(Vector3 arg0) {
		return new Vector3(this.x + arg0.getX(), this.y + arg0.getY(), this.z + arg0.getZ());
	}
	
	/**
	 * <pre>
	 * Subtracts the values of this vector from  arg0 returns a new vector with the
	 * final results.
	 * </pre>
	 * @since 0.00.02
	 */
	public Vector3 subtract(Vector3 arg0) {
		return new Vector3(this.x - arg0.getX(), this.y - arg0.getY(), this.z + arg0.getZ());
	}
	
	/**
	 * <pre>
	 * Divides the values of this vector from arg0 returns a new vector with the
	 * final results.
	 * </pre>
	 * @since 0.00.02
	 */
	public Vector3 divide(Vector3 arg0) {
		return new Vector3(this.x / arg0.getX(), this.y / arg0.getY(), this.z + arg0.getZ());
	}
	
	/**
	 * <pre>
	 * Multiplies the values of this vector from  arg0 returns a new vector with the
	 * final results.
	 * </pre>
	 * @since 0.00.02
	 */
	public Vector3 multiply(Vector3 arg0) {
		return new Vector3(this.x * arg0.getX(), this.y * arg0.getY(), this.z + arg0.getZ());
	}
}
