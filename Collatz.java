// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seedMax = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);
		int num;
		int count = 1;
		if (mode == 'v') {
			for (int i = 1; i < seedMax+1; i++) {
				num = i;
				do{
					count++;
					System.out.print(num+" ");
	
					if (num%2==0) {
						num = num/2;
					}
					else{
						num = (num * 3) + 1;
					}
				}
				while (num!=1);
				System.out.print(1 + " ("+count+")");
				System.out.println();
				count = 1;
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
