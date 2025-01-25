
public class Pattran4 {

	public static void main(String[] args) {
		/*
		 *   5 5 5 5 5
		 *    4 4 4 4
		 *     3 3 3
		 *      2 2
		 *       1
		 */
		for(int r = 1,sp=10;r<=5;r++) {
			for(int c=5;c>=r;c--) {
				System.out.print(" ");
			}
			sp = sp-1;
			for(int c=5;c>=r;c--) {
     			System.out.print(r+" ");
			}
			System.out.println();
		}
	}
}
