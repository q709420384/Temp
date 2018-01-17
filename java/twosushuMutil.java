import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String m1,m2;
        BigInteger a,b;
        m1=input.next();
        m2=input.next();
        a=new BigInteger(m1);
        b=new BigInteger(m2);
        System.out.print(a.divide(b));
    }
}
