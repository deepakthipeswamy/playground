package basic;

public class ListNodeAddNumbers {
	int val;
	ListNodeAddNumbers next;

	ListNodeAddNumbers(int x) {
		val = x;
	}

	public ListNodeAddNumbers addTwoNumbers(ListNodeAddNumbers l1, ListNodeAddNumbers l2) {
		ListNodeAddNumbers x = new ListNodeAddNumbers(0);
		return addValue(x, l1, l2, 0);
	}

	public ListNodeAddNumbers addValue(ListNodeAddNumbers x, ListNodeAddNumbers list1, ListNodeAddNumbers list2,
			int carry) {

		if (list1 != null || list2 != null) {
			int a = (list1 != null) ? list1.val : 0;
			int b = (list2 != null) ? list2.val : 0;

			int sum = a + b + carry;
			int currValue = sum % 10;

			x.val = currValue;

			if (sum / 10 > 0) {
				carry = 1;
			}

			if (list1.next != null)
				list1 = list1.next;
			if (list2.next != null)
				list2 = list2.next;
			x.next = new ListNodeAddNumbers(0);

			addValue(x.next, list1, list2, carry);
		}
		return x;
	}
}