/**
 * 
 */
package basic;

import java.util.Scanner;

/**
 * @author Deepak
 *
 */
public class TowersOfHanoi {
	
	// smallest disc moves from A -> C for even number of rings.
	// smallest disc moves from A -> B for odd number of rings.
	   public void solve(int n, String start, String auxiliary, String end) {
		   if (n == 1) {
	           System.out.println(start + " -> " + end);
	       } else {
	           solve(n - 1, start, end, auxiliary);
	           System.out.println(start + " -> " + end);
	           solve(n - 1, auxiliary, start, end);
	       }
	   }

	   public static void main(String[] args) {
	       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       towersOfHanoi.solve(discs, "A", "B", "C");
	   }	
	}
