import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String[] m=new String[10];
        String t,m1,m2;
        int i=0,x=0;
        while(true){
            t=input.nextLine();
            if(t.equals("end")) break;
            else {
                m[i]=t;
                i++;
                x++;
            }
        }
        m1=input.nextLine();
        m2=input.nextLine();
        for(i=0;i<x;i++)
            System.out.println(m[i].replaceAll(m1,m2));
    }
}
