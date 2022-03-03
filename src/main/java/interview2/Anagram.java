package interview2;

public class Anagram {

	public static void main(String[] args) {

		String st1 = "listen";
		String st2 = "ilstne";

		for (int i = 0; i < st1.length(); i++) {

			st2 = st2.replaceFirst("" + st1.charAt(i), "");

		}
		System.out.println(st2.isEmpty() ? "anagram" : "not anagram");

	}

}
