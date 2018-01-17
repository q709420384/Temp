
import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    String srcText = input.next();
    String findText = input.next();
    int num = appearNumber(srcText, findText);
    System.out.println("The number of occurrences is "+num+".");
}



public static int appearNumber(String srcText, String findText) {
    int count = 0;
    int index = 0;
    while ((index = srcText.indexOf(findText, index)) != -1) {
        index = index + findText.length();
        count++;
    }
    return count;
}
} 

