import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = "";
        String b = input.next();
        while(!b.equals("end")){
            b += " ";
            a += b;
            b = input.next();
        }
    b = input.next();
    String c = input.next();
    System.out.println(a.replace(b, c));
    }
}
