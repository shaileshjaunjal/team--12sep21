/*
Factorial of number.
*/

import java.util.*;

class Factorial{
	static int fact(int a){
		if(a<=1){
			return 1;
		}
		else{
			
			return a*fact(--a);
			
		}
	}
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of which Factorial is to be Find:");
		int num=sc.nextInt();
		
		   System.out.println("Factorial of "+num+" is "+fact(num));     
		
	}
}