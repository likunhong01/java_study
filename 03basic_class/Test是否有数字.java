package no1;

public class TestÊÇ·ñÓĞÊı×Ö {
	public static void main(String[] args) {
		String string = "kdja2222";
		
		boolean is = haveNumber(string);
		System.out.println(is);
	}
	
	public static boolean haveNumber(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) <= '9' && string.charAt(i) >= '0') {
				return true;
			}
		}
		return false;
	}
}
