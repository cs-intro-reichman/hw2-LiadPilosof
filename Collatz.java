// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seedMax = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);
		int num;
		if (mode == 'v') {
			for (int i = 1; i < seedMax+1; i++) {
				num = i;
				do{
					System.out.print(num+" ");
	
					if (num%2==0) {
						num = num/2;
					}
					else{
						num = (num * 3) + 1;
					}
				}
				while (num!=1);
				System.out.print(1);
				System.out.println();
			}
	
	
		}

		else if (mode == 'c') {
			for (int i = 1; i < seedMax+1; i++) {
				num = i;
				do{	
					if (num%2==0) {
						num = num/2;
					}
					else{
						num = (num * 3) + 1;
					}
				}
				while (num!=1);
			
			}
	
	
		}
		System.out.println("Every one of the first " + seedMax + " hailstone sequences reached 1.");

		
	}
}
