package examplepackage;
public class variabletypesex {
	public void variable()  {
	
		String ID = "1234";
		System.out.println("Executing variable method");
		System.out.println("Student Id : "+ ID);
		}
	 public void variable1() {
		 String StudentName = "Aparna";
		 System.out.println("Executing variable1 method");
		 System.out.println("Student Name :"+StudentName);
	 }
	 
	 public static void variable2() {
		 String College = "CBIT";
		 		 System.out.println("Executing Static method variable 2 ");
		 		 System.out.println("College : "+College);
		 		 System.out.println();
		 		 	 }
public static void main(String[] args) {
       variabletypesex v = new variabletypesex();
       v.variable();
       v.variable1();
       variabletypesex.variable2();
       System.out.println("Executing main class");	   
}
}