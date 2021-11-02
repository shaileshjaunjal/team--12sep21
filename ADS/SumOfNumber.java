/*
WAP sum a series of number in java recursion.
*/

import java.util.*;

class SumOfNumber{
	
	static int sum(int a){
		if(a==0){
			return 0;
		}
		else{
			int sum=a;
			
			sum=sum+sum(--a);
			//System.out.print(sum);
			return sum;
		}
	}
	public static void main(String[]args){
		
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		System.out.println("Sum of all number upto "+num+" ="+sum(num));
	}
}