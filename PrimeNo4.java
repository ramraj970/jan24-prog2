public class PrimeNo4 {
	public static void main(String[] args) {
		for(int i=200,k=0;i<=500;i++) {
			int num = i;
			int counter=0;
			for(int p=1;p<=num;p++) {
				if(num % p == 0)counter++;
		    }
			if(counter == 2) {
				System.out.print(num+" ");
				k++;
				if(k==8) {
				System.out.println();
				k=0;
				}
			}
		}
	}
}