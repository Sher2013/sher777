package sample;

public class Myprogram {
	
	void ThreeString(String str1) {
		int i,j,k,jflag;
		j=1;
		k=2;
		jflag=1;
		String TEMPValue="";
		String kvalue="";
		String jvalue="";
		String STR2="";
		if(str1.length()==3) {
			for(i=0;i<=2;i++)
			{
			
				
				kvalue=""+str1.charAt(k);
				jvalue=""+str1.charAt(j);
				System.out.println(STR2+str1.charAt(i)+jvalue+kvalue);
				TEMPValue=""+str1.charAt(j);
				jvalue=kvalue;
				kvalue=TEMPValue;
				System.out.println(STR2+str1.charAt(i)+jvalue+kvalue);
				
				j=jflag-(i+1);
				k=k-(i);
				jflag++;
			}
		}
				
		else {
			System.out.println("Please enter 3 charactered string alone");
		}
	
	}

}
