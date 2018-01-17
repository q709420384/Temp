import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GregorianCalendar gcl= new GregorianCalendar();
        Scanner in = new Scanner(System.in);
        long time = in.nextLong();
        gcl.setTimeInMillis(time);
        System.out.println(gcl.get(Calendar.YEAR)+"-"+gcl.get(Calendar.MONTH)+"-"+gcl.get(Calendar.DAY_OF_MONTH));
    }
}
