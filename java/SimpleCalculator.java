import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String m;
        char ch;
        String[] op;
        m=in.nextLine();
        op=m.split("\\D",0);
        BigInteger a=new BigInteger(op[0]);
        BigInteger b=new BigInteger(op[1]);
        if(m.indexOf('+') != -1) ch='+';
        else if(m.indexOf('-') != -1) ch='-';
        else if(m.indexOf('*') != -1) ch='*';
        else ch='/';
        System.out.print(op(a,b,ch));
    }
    public static BigInteger op(BigInteger a,BigInteger b,char ch){
        switch(ch){
            case '+':return a.add(b);
            case '-':return a.subtract(b);
            case '*':return a.multiply(b);
            case '/':return a.divide(b);
        }
        return BigInteger.valueOf(0);
    }
}

