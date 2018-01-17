
import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{

		Scanner input=new Scanner(System.in);
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double distance=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		System.out.printf("The distance is %.2f"+distance);
	}
}

