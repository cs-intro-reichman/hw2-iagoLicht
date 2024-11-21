// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		double sum = 0.0;
		for (int i = 0; i < num ; i++){
			if (i % 2 == 0) { 
                sum += 1.0 / (2 * i + 1);
            } else {
                sum -= 1.0 / (2 * i + 1);
            }
		}
		double piApproximation = sum * 4;

			System.out.println("pi according to Java: " + Math.PI);
			System.out.println("pi, approximated:     " + piApproximation);




			
		
	}	
		
	}

