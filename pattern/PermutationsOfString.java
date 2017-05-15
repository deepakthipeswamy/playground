package pattern;

public class PermutationsOfString {

	public static void main(String[] args) {
		String str = "abcd";
		PermutationsOfString p = new PermutationsOfString();
		p.permute(str, "");
		// p.permute(str, 0, str.length() - 1);
	}
	/*
	 * Example: ABCD
	 * str = ABCD, prefix ""
	 * 
	 * Loop 1: 
	 * str = BCD, prefix = A
	 * 
	 * Loop 1.1:
	 * str = CD, prefix = AB
	 * 
	 * Loop 1.1.1
	 * str = D, prefix = ABC
	 * 
	 * Loop 1.1.1.1
	 * str = "", prefix = ABCD -> print 
	 * 
	 * Loop 2: 
	 * str = ACD, prefix B
	 * str = CD, prefix BA
	 * str = D, prefix BAC
	 * str = "", prefix BACD -> print
	 */

	private void permute(String str, String prefix) {
		if (str.length() == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				// Prefix A first and then compute different combo for the
				// remaining characters
				String rem = str.substring(0, i) + str.substring(i + 1);
				permute(rem, prefix + str.charAt(i));
			}
		}
	}

	private void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
