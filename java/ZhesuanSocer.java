import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main{
public static void main(String[] args){
    Map<String, Integer> list=new HashMap<String, Integer>();
    int a;
    Scanner scanner=new Scanner(System.in);
    String aString=scanner.next();

    while(!aString.equals("noname"))
    {
        a=scanner.nextInt();
        
        list.put(aString, a);
        aString=scanner.next();
        
    }
    String string=scanner.next();
    if(list.get(string) != null){
        System.out.println(list.get(string)*0.21);
    }

    else {
        System.out.println("Not found.");
    }
    
    
    
}
}
