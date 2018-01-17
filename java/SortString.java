import java.util.Arrays;
import java.util.Scanner;


public class Main {


public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
  String str=input.next();

  String sortstr=sortString(str);
  System.out.println(sortstr);
}

public static String sortString(String str) {

  char [] chs=stringToArray(str);
  sort(chs);
  String ch=arrayToString(chs);
  return ch;
}

private static String arrayToString(char[] chs) {
  return new String(chs);
}

private static void sort(char[] chs) {

  Arrays.sort(chs);
}

private static char[] stringToArray(String str) {

  return str.toCharArray();
}

}
