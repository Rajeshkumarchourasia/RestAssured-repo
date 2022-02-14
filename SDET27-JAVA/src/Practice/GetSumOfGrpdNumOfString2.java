package Practice;

public class GetSumOfGrpdNumOfString2 {
public static void main(String[] args) {
	
	String s= "a12b13c30d50"; //12
	int sum =0; //5
	int Tsum =0; //55
	for(int i=0;i<s.length();i++) //0<12 1<12 10<12 11<12 12<12
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			int n= s.charAt(i)-48; // 5 0
			sum=sum*10+n; //0*10+5 50
		}
		else
		{
			Tsum =Tsum+sum;
			sum=0;
		}
	}
	//Tsum =Tsum+sum;
	System.out.println(Tsum+sum);
}
}
