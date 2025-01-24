
public class PrimeNo2 {

	public static void main(String[] args) {
		int pn=0;
		
		for(int i=1,k=0,m=0;i<=100;i++) {
			int num = i;
			int counter=0;
			for(int p=1;p<=num;p++) {
				if(num % p == 0)counter++;
			
		    }
			if(counter == 2) {
				m++;
				if(m == 1) {
					System.out.println("\n This is one prime number..++num");
					break;
				}
			}
		}

	}

}
