package pattern;

import java.util.LinkedList;
import java.util.List;

public class KeyboardRow {

	public static void main(String[] args) {

		String[] words = { "qwee" };
		List<String> res = new LinkedList<>();
		for (int i = 0; i < words.length; i++) {
			String chosenString = "";
			boolean found = true;
			for (int j = 0; j < words[i].length(); j++) {
				String ch = String.valueOf(words[i].charAt(j));
				if (chosenString.length() == 0) {
					if ("QWERTYUIOP".indexOf(ch.toUpperCase()) != -1) {
						chosenString = "QWERTYUIOP";
					} else if ("ASDFGHJKL".indexOf(ch.toUpperCase()) != -1) {
						chosenString = "ASDFGHJKL";
					} else {
						chosenString = "ZXCVBNM";
					}
				}

				if (chosenString.indexOf(ch.toUpperCase()) < 0) {
					found = false;
				}
			}

			if (found) {
				res.add(words[i]);
			}
		}
		System.out.println(res);
	}
}
