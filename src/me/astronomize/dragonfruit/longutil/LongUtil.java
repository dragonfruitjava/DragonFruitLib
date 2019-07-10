package me.astronomize.dragonfruit.longutil;

/**
 * Utilities for handling integers.
 *
 * @author astronomize
 */
public class LongUtil {
	
	/**
	 * <pre>
	 * returns true if the specified string can be parsed to a long, and false if it can't.
	 * </pre>
	 * @since 0.00.00
	 */
	public static boolean canParseToLong(String s) {
		try {
			Long.parseLong(s);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
}
