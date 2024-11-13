// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int approx = Integer.parseInt(args[0]);

		double div = 3;
		double count = 1;
		double pi = 1 ;


		for (int i = 1; i < approx+1; i++) {
			if (i%2==0) {
				pi += (count/div);
			}
			else{
				pi -= (count/div);
			}

			div = div + 2;
		}

		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated:	 "+pi*4);

	}
}
