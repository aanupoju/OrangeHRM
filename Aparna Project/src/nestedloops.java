
public class nestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<=3; i++) 
		{
			
			for( int j = 1; j<=2;j++) 
			{
				System.out.println(i+","+j);
			}
			System.out.println();
		}
		
		
		for (int i = 1; i<=3; i++) 
		{
			
			for( int j = 1; j<=2;j++) 
			{
				System.out.println(i+""+j);
			}
			System.out.println();
		}
		
		for (int i = 1; i<=3; i++) 
		{
			
			for( int j = 1; j<=2;j++) 
			{
				System.out.println("*");
			}
	
		}
		System.out.println("%%%%%%%%%%%%%%%%");
		for (int i = 1; i<=5; i++) 
		{
			
			for( int j = i; j<=5;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
		for (int i = 5; i>=1; i--) 
		{
			
			for( int j = i; j<=5;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for (int i = 5; i>=1; i--) 
		{
			
			for( int j = i; j<=5;j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for (int i = 1; i<=5; i++) 
		{
			
			for( int j =i; j<=5;j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("#####################");
		for (int i = 1; i<=5; i++) 
		{
			
			for( int j = 1; j<=i;j++) 
			{
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		for (int i = 1; i<=5; i++) 
		{
			
			for( int j = 1; j<=i;j++) 
			{
				//System.out.print(j);
				System.out.print(i);
				
			}
			
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		for(int i=0;i<=5;i++) {
			for(int j=0; j<=4;j++) {
			System.out.print("");
			}
			for (int j=0; j<=i;j++) {
			System.out.print(j);	
			}
		System.out.println();
		}
	}

}
