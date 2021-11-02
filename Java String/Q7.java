/*
7. Given a string , output another string where the case of the characters is reversed. 
Input : "Hello World" 
Output : "hELLO wORLD" 

*/
import java.util.*;
import java.lang.*;

public class Q7
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
	Scanner sc	= new Scanner(System.in);
	System.out.println("Enter the String:");
	String s=sc.nextLine();
	//boolean isUpper=false;
	String arr[]=new String[s.length()];
	for(int i=0;i<s.length();i++ ){
	    char ch=s.charAt(i);
	     
	    if(ch>='a' && ch<='z'){
	        String temp=""+ch;
	       arr[i]=temp.toUpperCase(); 
	    }
	    else if(ch>='A'&&ch<='Z'){
	        String temp=""+ch;
	        arr[i]=temp.toLowerCase(); 
	    }
	    else{
	        String ab=""+ch;
	        arr[i]=ab;
	    }
	}
	
	for(String a:arr){
	    System.out.print(a);
	}
	
	}
}
