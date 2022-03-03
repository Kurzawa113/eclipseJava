
public class Anagram2 {

	public static void main(String[] args) {

		String str1 = "suzuki";
		String str2 = "ikuzus";
		System.out.println(anagramTest(str1, str2));

	}

	public static boolean anagramTest(String str1, String str2) {

		char[] ch1 = str1.toCharArray();
		StringBuilder sb = new StringBuilder(str2);
		for (char c : ch1) {
			int index = sb.indexOf(String.valueOf(c));
			if (index != -1) {
				sb.deleteCharAt(index);

			} else {

				return false;
			}

		}
		return sb.length() == 0;

	}
}
