/*
WAP to print series of number in java.
*/
import java.util.*;

class SeriesOfNumber{
	
	static int print(int n){
		
		if(n==0){
			System.out.print(n+" ");
			return 0;
		}
		else{
			
			int a=n;
			
			print(--n);
			System.out.print(a+" ");
				
			return a;
		}
	}
	
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		print(num);
	}
}