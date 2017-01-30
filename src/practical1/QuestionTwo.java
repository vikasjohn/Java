package practical1;
import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double subtotal, gratuity;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Subtotal: ");
		subtotal = input.nextDouble();
		
		System.out.println("Enter the Gratuity: ");		
		gratuity = input.nextDouble();
		
		double gAmount = subtotal * (gratuity/100);
		double total = subtotal + gAmount;
		System.out.println("Gratuity Amount "+ gAmount);
		System.out.println("Total Amount " + total );
	}

}
