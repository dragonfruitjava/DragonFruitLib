package me.astronomize.dragonfruit.floatutil;

public class FloatUtil {
	
	/**
	 * <pre>
	 * returns true if the specified string can be parsed to a float, and
	 * false if it can't.
	 * </pre>
	 * @since 0.00.00
	 */
	public static boolean canParseToFloat(String s) {
		try {
			Float.parseFloat(s);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
}
