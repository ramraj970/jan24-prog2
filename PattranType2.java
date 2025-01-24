
public class PattranType2 {

	public static void main(String[] args) {
		/*
		 * 5
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 */
		for(int r=5;r>=1;r--) {
			for(int c=5;c>=r;c--) {
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
