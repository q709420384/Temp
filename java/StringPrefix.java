import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String prefix(String s1, String s2){
        StringBuffer stringBuffer = new StringBuffer("");
        StringBuffer no = new StringBuffer("No common prefix");
        StringBuffer yes = new StringBuffer("The common prefix is ");
        boolean hasPrefix = false;
        int i=0;
        while (i<s1.length()&&i<s2.length()){
            if (s1.charAt(i)==s2.charAt(i)) {
                hasPrefix=true;
                stringBuffer.append(s1.charAt(i));
                i++;
            }
            else {
                break;
            }
        }
        if (hasPrefix){
            stringBuffer=yes.append(stringBuffer);
        }else{
            stringBuffer=no.append(stringBuffer);
        }
        return new String(stringBuffer);
    }
    public static void main(String[] args){
        String string1,string2;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            string1 = in.next();
            string2 = in.next();
            System.out.println(prefix(string1, string2));
        }
        in.close();
    }
}
