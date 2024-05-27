package moduleCT4loop;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		double average = 0.00;   // Grade average
		double maximum = 0.00;   // Highest grade in the class
		double minimum = 101.00;   // Lowest grade in the class
		double gradesList;   // List of grade values from user input
		double sum = 0.00;
		int numValues = 0;
		int i;
		
		System.out.print ("Please enter the amount of grades being calculated: ");
		numValues = scnr.nextInt ();   // Gets the list of ten grade values of the class
		
		average = 0.00;
		
		System.out.print("Class grades: ");

		for (i = 0; i < numValues; ++i)   {
			gradesList = scnr.nextDouble ();   // Gets the list of ten grade values of the class
			sum += gradesList;
			average = sum/numValues;
			
			if (gradesList > maximum) {   // Gets the maximum from the users input of ten values assuming numValues is 10
				maximum = gradesList;
			}
			if (gradesList < minimum) {   // Gets the minimum value of the list of grades from gradesList
				minimum = gradesList;
			}
			
		}
		
		System.out.print ("Class grade average: ");
		System.out.printf ("%.2f", average);
		System.out.println ("%");
		System.out.print ("Class maximum grade: ");
		System.out.printf ("%.2f", maximum);
		System.out.println ("%");
		System.out.print ("Class minimum grade: ");
		System.out.printf ("%.2f", minimum);
		System.out.println ("%");

	}

}
