package com.roytuts.springjspservlet.utils;
public class Utils {
	private Utils() {
	}
	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
		return true;
	}
}	