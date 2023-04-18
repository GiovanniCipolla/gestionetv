package it.gestionetv.utility;

public class UtilityForm {
	public static Integer parseFromString(String input) {
		Integer result = null;
		try {
			result = Integer.parseInt(input);
		} catch (NumberFormatException e) {
		}
		return result;
	}
}
