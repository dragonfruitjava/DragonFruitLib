package me.astronomize.dragonfruit.vector.math;

import me.astronomize.dragonfruit.vector.Vector2;
import me.astronomize.dragonfruit.vector.Vector3;
import me.astronomize.dragonfruit.vector.Vector4;

public class MathUtil {
	
	/**
	 * Multiplies the variables of the 2 specified vectors, and returns a new vector with the
	 * final results.
	 * @since 0.00.01
	 */
	public Vector2 multiply(Vector2 arg0, Vector2 arg1) {
		return new Vector2(arg0.getX() * arg1.getX(), arg0.getY() * arg1.getY());
	}
	
	/**
	 * Multiplies the variables of the 2 specified vectors, and returns a new vector with the
	 * final results.
	 * @since 0.00.01
	 */
	public Vector3 multiply(Vector3 arg0, Vector3 arg1) {
		return new Vector3(arg0.getX() * arg1.getX(), arg0.getY() * arg1.getY(), arg0.getZ() * arg1.getZ());
	}
	
	/**
	 * Multiplies the variables of the 2 specified vectors, and returns a new vector with the
	 * final results.
	 * @since 0.00.01
	 */
	public Vector4 multiply(Vector4 arg0, Vector4 arg1) {
		return new Vector4(arg0.getX() * arg1.getX(), arg0.getY() * arg1.getY(), arg0.getZ() * arg1.getZ(), arg0.getW() * arg1.getW());
	}
	
	 // ----------------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * Subtracts the variables of the 2 specified vectors, and returns a new vector with the
	 * final results.
	 * @since 0.00.01
	 */
	public Vector2 subtract(Vector2 arg0, Vector2 arg1) {
		return new Vector2(arg0.getX() * arg1.getX(), arg0.getY() * arg1.getY());
	}
	
	/**
	 * Subtracts the variables of the 2 specified vectors, and returns a new vector with the
	 * final results.
	 * @since 0.00.01
	 */
	public Vector3 subtract(Vector3 arg0, Vector3 arg1) {
		return new Vector3(arg0.getX() - arg1.getX(), arg0.getY() - arg1.getY(), arg0.getZ() - arg1.getZ());
	}
	
	/**
	 * Subtracts the variables of the 2 specified vectors, and returns a new vector with the
	 * final results.
	 * @since 0.00.01
	 */
	public Vector4 subtract(Vector4 arg0, Vector4 arg1) {
		return new Vector4(arg0.getX() - arg1.getX(), arg0.getY() - arg1.getY(), arg0.getZ() - arg1.getZ(), arg0.getW() - arg1.getW());
	}
	
	// ----------------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * Divides the variables of the 2 specified vectors, and returns a new vector with the
	 * final results.
	 * @since 0.00.01
	 */
	public Vector2 divide(Vector2 arg0, Vector2 arg1) {
		return new Vector2(arg0.getX() / arg1.getX(), arg0.getY() / arg1.getY());
	}
	
	/**
	 * Divides the variables of the 2 specified vectors, and returns a new vector with the
	 * final results.
	 * @since 0.00.01
	 */
	public Vector3 divide(Vector3 arg0, Vector3 arg1) {
		return new Vector3(arg0.getX() / arg1.getX(), arg0.getY() / arg1.getY(), arg0.getZ() / arg1.getZ());
	}
	
	/**
	 * Divides the variables of the 2 specified vectors, and returns a new vector with the
	 * final results.
	 * @since 0.00.01
	 */
	public Vector4 divide(Vector4 arg0, Vector4 arg1) {
		return new Vector4(arg0.getX() / arg1.getX(), arg0.getY() / arg1.getY(), arg0.getZ() / arg1.getZ(), arg0.getW() / arg1.getW());
	}	
	
	// ----------------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * Adds the variables of the 2 specified vectors, and returns a new vector with the
	 * final results.
	 * @since 0.00.01
	 */
	public Vector2 add(Vector2 arg0, Vector2 arg1) {
		return new Vector2(arg0.getX() + arg1.getX(), arg0.getY() + arg1.getY());
	}
	
	/**
	 * Adds the variables of the 2 specified vectors, and returns a new vector with the
	 * final results.
	 * @since 0.00.01
	 */
	public Vector3 add(Vector3 arg0, Vector3 arg1) {
		return new Vector3(arg0.getX() + arg1.getX(), arg0.getY() + arg1.getY(), arg0.getZ() + arg1.getZ());
	}
	
	/**
	 * Adds the variables of the 2 specified vectors, and returns a new vector with the
	 * final results.
	 * @since 0.00.01
	 */
	public Vector4 add(Vector4 arg0, Vector4 arg1) {
		return new Vector4(arg0.getX() + arg1.getX(), arg0.getY() + arg1.getY(), arg0.getZ() + arg1.getZ(), arg0.getW() + arg1.getW());
	}
	
}
