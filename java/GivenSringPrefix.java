import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;
public class Main{
	public static void prefix(String s1,String s2)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<(s1.length()<s2.length()?s1.length():s2.length());i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
				sb.append(s1.charAt(i));
			else
				break;
		}
		if(sb.length()==0)
			System.out.println("No common prefix");
		else
			System.out.println("The common prefix is "+sb);
	}
	public static void main(String []args) throws IOException
	{
		/*StringBuffer sb1=new StringBuffer();
		  StringBuffer sb2=new StringBuffer();
		  Scanner in=new Scanner(System.in);
		  String s1,s2;
		  while(in.nextLine()!="")
		  {
		  s1=in.next();s2=in.next();
		  sb1.append(s1);sb2.append(s2);
		  }
		  System.out.println(sb1.toString()+sb2.toString());*/
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		do {
			String line = reader.readLine();
			if (line.equals("")) {
				break;
			}
			int i;
			for(i=0;i<line.length();i++)
				if(line.charAt(i)==' ')
					break;
			prefix(line.substring(0, i-1),line.substring(i+1,line.length()));
		} while (true);
	}
}
