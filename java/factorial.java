import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] cal = new int[10010];
		int num = input.nextInt();
		cal[0] = 1;
		for(int index = 1; index <= num; ++index )
		{
			for(int i = 0; i < 10000; i++)
			{
				cal[i] = cal[i]*index;
				
			}
			for(int i = 0; i < 10000; i++)
			{
					cal[i+4] = cal[i+4]+ cal[i]/10000;
				cal[i+3] = cal[i+3]+ cal[i]%10000/1000;
				cal[i+2] = cal[i+2]+ cal[i]%1000/100;
				cal[i+1] = cal[i+1]+ cal[i]%100/10;
				cal[i+0] = cal[i]%10;
				
				
			}
		}
		for(int i3 = 0; i3 < 10004; i3++)
		{
			cal[i3+4] = cal[i3+4]+ cal[i3]/10000;
			cal[i3+3] = cal[i3+3]+ cal[i3]%10000/1000;
			cal[i3+2] = cal[i3+2]+ cal[i3]%1000/100;
			cal[i3+1] = cal[i3+1]+ cal[i3]%100/10;
			cal[i3+0] = cal[i3]%10;
			
		}
		
		int x = 10000;
		while(cal[x] == 0)
			x--;
		for(int i2 = x; i2 >= 0; i2--)
		{
			System.out.print(cal[i2]);
		}
		System.out.println();
		
		
		
	}
	

}

