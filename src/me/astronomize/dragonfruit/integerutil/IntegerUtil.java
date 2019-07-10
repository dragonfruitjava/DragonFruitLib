package me.astronomize.dragonfruit.integerutil;

/**
 * Utilities for handling integers.
 *
 * @author astronomize
 */
public class IntegerUtil {
	
	/**
	 * <pre>
	 * returns true if the specified string can be parsed to a integer, and
	 * false if it can't.
	 * </pre>
	 * @since 0.00.00
	 */
	public static boolean canParseToInt(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
}
