package practical1;
import java.util.Scanner;


public class QuestionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius, length;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		
		radius = input.nextDouble();
		
		System.out.println("Enter the Length");
		
		length = input.nextDouble();
		
		double area = 3.14 * radius * radius;
		double volume = area * length;
		System.out.println("The area is "+ area);
		System.out.println("The Volume is " + volume );
	}

}
