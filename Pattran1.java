
public class Pattran1 {

	public static void main(String[] args) {
		/*
		 * 5
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 */
		for(int r=1;r<=5;r++) {
			for(int c=5,p=1;p<=r;c--,p++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
