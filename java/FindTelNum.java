import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String,String> phone = new HashMap<String,String>();
        Scanner in = new Scanner(System.in);
        while(true) {
            String name = in.next();
            if(name.equals("noname")) {
                break;
            }
            String phoneNumber = in.next();
            phone.put(name, phoneNumber);
        }
        String s = in.next();
        if(!phone.containsKey(s)) {
            System.out.println("Not Found。");
        }
        else{
            System.out.println(phone.get(s));
        }
        in.close();
    }
}
