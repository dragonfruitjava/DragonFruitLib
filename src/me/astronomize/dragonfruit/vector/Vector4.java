package me.astronomize.dragonfruit.vector;

/**
 * <pre>
 * Vector3(float x, float y, float z, float w)
 * A vector with 4 arguments.
 * </pre>
 * 
 * @author astronomize
 */
public class Vector4 {

	float x, y, z, w;

	public Vector4(float x, float y, float z, float w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
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
	 * returns the w value of this vector.
	 * 
	 * @since 0.00.00
	 */
	public float getW() {
		return this.w;
	}

	/**
	 * Checks if the specified vector's values are equal to the values in this
	 * vector.
	 * 
	 * @since 0.00.00
	 */
	public boolean equals(Vector4 arg0) {

		if (this.x == arg0.getX() && this.y == arg0.getY() && this.z == arg0.getZ() && this.w == arg0.getW()) {
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
		return x + ", " + y + ", " + z + ", " + w;
	}
}
