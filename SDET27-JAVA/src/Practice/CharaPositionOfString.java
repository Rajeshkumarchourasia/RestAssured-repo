package Practice;

public class CharaPositionOfString {
public static void main(String[] args) {
	String s="Tester";
	String lower =s.toLowerCase();
	
	for(int i=0;i<lower.length();i++)
	{
		char ch1=lower.charAt(i);
		int count=0;
		
		for(int j=0;j<lower.length();j++)
		{
			char ch2 =lower.charAt(j);
			if(ch1==ch2 && i>j)
			{
				break;
			}
			if(ch1==ch2)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println(ch1+"--->"+(i+1));
		}
	}
}
}
