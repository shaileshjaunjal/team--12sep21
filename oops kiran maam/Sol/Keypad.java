/*mobile keypad button combination*/

import java.util.*;
import java.lang.*;


class Keypad{
	
	public static void main(String[]args){
		
		Scanner sc= new Scanner (System.in);
		
		String ar[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		System.out.println("Enter string which contain only number:");
		String input=sc.next();
		
		int a=Integer.parseInt(input);
		
		int KeyNumber[]=new int[2];
		//System.out.println(a);
		for(int i=0;i<2;i++){
			
			KeyNumber[i]=a%10;
			a=a/10;
		
		}
		//System.out.println(a);
		//System.out.println(KeyNumber[0]+"  "+KeyNumber[1]);
		
		String str1=ar[KeyNumber[0]];
		String str2=ar[KeyNumber[1]];
		
		
		//System.out.println(str1+" "+str2);
		System.out.print("[ ");
		
		for(int l=0;l<str2.length();l++){
			
			for(int m=0;m<str1.length();m++){
				System.out.print("\""+str2.charAt(l)+""+str1.charAt(m)+"\""+",");
			}
		}
		System.out.println(" ]");
		
		
		
	
	}
}