package QB_Rating;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner	scan = new Scanner(System.in);
		System.out.print("Enter the Qb's touchdowns:");
		int Td = scan.nextInt();


		System.out.print("Enter your total yards:");
		int Yards = scan.nextInt();
		System.out.println("");

		System.out.print("Enter your Interceptions:");
		int ints = scan.nextInt();
		System.out.println("");

		System.out.print("Enter the amount of completed passes:");
		int comp = scan.nextInt();
		System.out.println("");

		System.out.print("Enter the Qb's number of passes attempted:");
		int ATT = scan.nextInt();
		System.out.println("");
		float a=(float) ((comp/ATT - 0.3) * 5);
		float b=(float) ((Yards/ATT - 3) * 0.25);
		float c=(Td/ATT) * 20;
		float d=(float) (2.375 - (ints/ATT * 25));
		float QBRating=((a+b+c+d)/6)*100;

		System.out.println("The QB's rating is"+QBRating);
	}

}
