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
	 * returns the w value of this vector.
	 * </pre>
	 * 
	 * @since 0.00.00
	 */
	public float getW() {
		return this.w;
	}

	/**
	 * <pre>
	 * Checks if the specified vector's values are equal to the values in this
	 * vector.
	 * </pre>
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
	 * <pre>
	 * Returns this vector converted to a string.
	 * </pre>
	 * 
	 * @since 0.00.00
	 */
	@Override
	public String toString() {
		return x + ", " + y + ", " + z + ", " + w;
	}
	
	/**
	 * <pre>
	 * Adds the values of this vector onto arg0 returns a new vector with the
	 * final results.
	 * </pre>
	 * @since 0.00.02
	 */
	public Vector4 add(Vector4 arg0) {
		return new Vector4(this.x + arg0.getX(), this.y + arg0.getY(), this.z + arg0.getZ(), this.w + arg0.getW());
	}
	
	/**
	 * <pre>
	 * Subtracts the values of this vector from  arg0 returns a new vector with the
	 * final results.
	 * </pre>
	 * @since 0.00.02
	 */
	public Vector4 subtract(Vector4 arg0) {
		return new Vector4(this.x - arg0.getX(), this.y - arg0.getY(), this.z + arg0.getZ(), this.w + arg0.getW());
	}
	
	/**
	 * <pre>
	 * Divides the values of this vector from arg0 returns a new vector with the
	 * final results.
	 * </pre>
	 * @since 0.00.02
	 */
	public Vector4 divide(Vector4 arg0) {
		return new Vector4(this.x / arg0.getX(), this.y / arg0.getY(), this.z + arg0.getZ(), this.w + arg0.getW());
	}
	
	/**
	 * <pre>
	 * Multiplies the values of this vector from  arg0 returns a new vector with the
	 * final results.
	 * </pre>
	 * @since 0.00.02
	 */
	public Vector4 multiply(Vector4 arg0) {
		return new Vector4(this.x * arg0.getX(), this.y * arg0.getY(), this.z + arg0.getZ(), this.w + arg0.getW());
	}
}
