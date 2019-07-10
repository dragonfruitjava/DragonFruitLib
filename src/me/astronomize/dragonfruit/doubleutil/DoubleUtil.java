package me.astronomize.dragonfruit.doubleutil;

/**
 * Utilities for handling doubles.
 * 
 * @author astronomize
 */
public class DoubleUtil {
	
	/**
	 * <pre>
	 * returns true if the specified string can be parsed to a double, and false if it can't.
	 * </pre>
	 * @since 0.00.01
	 */
	public static boolean canParseToDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
}
