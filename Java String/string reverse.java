/*
String reversal program.
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
	   Scanner sc=new Scanner (System.in);
	   
	   String str=sc.nextLine();
	   
	    char strAr[]=str.toCharArray();
	    int l=strAr.length;
	    for(char a:strAr){
	        System.out.print(a);
	    }
	    char arr[]=new char[l];
	    int j=l-1;
	    for(int i=0;i<l;i++){
	        arr[i]=strAr[j];
	        j--;
	    }
	    System.out.println("\n");
	    for(char z:arr){
	        System.out.print(z);
	    }
	    
	    
	   
	}
}
