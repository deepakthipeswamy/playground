package pattern;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Deepak is awesome";
		String[] strArray = s.split(" ");
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < strArray.length; i++) {
			str.append(new StringBuilder(strArray[i]).reverse());
			str.append(" ");
		}

		System.out.println(str.toString().trim());

	}

}
