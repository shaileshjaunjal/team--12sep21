/*
WAP to print multiplication table.
*/


import java.util.*;

class Table{


	
	Table(){}

	static int printTable(int x,int mult){
	int y=x, z=mult;
	if(z>1){
		
		
		int d=printTable(y,--z);
	System.out.println(y+"*"+z+"="+(y*z));
	
	return y*z;
	
	} 
		return 1;
	}

	public static void main(String[]args){
	
	Scanner sc =new Scanner(System.in);

	System.out.println("Enter the Number whos table is to Print:");

	int a=sc.nextInt();
	
	//System.out.println("Enter the number upto which table is to be printed");
	int multiplier=11;

	printTable(a,multiplier);
}

}