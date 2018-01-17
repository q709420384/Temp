import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//String类的静态方法valueOf()方法可将基本数据类型转换为字符串类型
		BigInteger bigNum=new BigInteger(String.valueOf(Long.MAX_VALUE));
		//BigInteger bigNum=BigInteger.valueOf(Long.MAX_VALUE);  与上条语句等效
		int n=in.nextInt();
		int count=0;
		while(count<3){
			//BigInteger类的intValue()方法将此 BigInteger转换为 int
			if(bigNum.mod(BigInteger.valueOf(n)).intValue()==0){
				System.out.println(bigNum);
				count++;
			}
			bigNum=bigNum.add(BigInteger.ONE);
		}
	}
}

