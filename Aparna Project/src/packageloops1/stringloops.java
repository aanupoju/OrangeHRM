package packageloops1;

public class stringloops {
	
	public static void astrickloop(){
		String s = "*";
		int i=1;
while(i<=5)
	{
		System.out.println(i+ ""+s);

		s = s+"*";
		i=i+1;
	}		
	}
	public static void numericloop(){
			int i=0;
int j=1;
while (j<=5) {
		while(i<=5){
		
		i=i+1;
	j=i;
	
		System.out.println(i+ ""+j);
		
		
	}	
		
	}}
	
	public static void doubleloop(){
		
		int i=1;int j =0;
		String a = "1";
		while(j<=5){
			j=j+1;
	
		while(i<=5){
		i=i+1;
		System.out.println(j+ "."+a);
		a = a + i;
	}		}
	}
	public static void reversestring() {
		String a = "post";
		int i = a.length();
		int j ;
		char rc;
		String rstring ="";
		System.out.println(i);
		
	for  (j=0;j<=i; j++) {
		   rc = a.charAt(j);
		   rstring = rc +  rstring;
		   System.out.print(rc+ rstring);
		   
		}
	}
	
	public static void main(String[] args) {
		
		//stringloops.astrickloop();
    	//stringloops.numericloop();
		//stringloops.doubleloop();
		stringloops.reversestring();
		
		
	}
}
