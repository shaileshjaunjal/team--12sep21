/*

Question 3: Given a string s consists of upper/lower-case
alphabets and empty space characters ' '
, return the length of the
last word in the string.
If the last word does not exist, return 0.
Note: A word is defined as a character sequence consisting of
non-space characters only.
Example:
Given s = "Hello World"
,
return 5 as length("World") = 5.

*/


import java.util.*;

public class Q3
{
	public static void main(String[] args) {
	
	Scanner sc=new Scanner (System.in);
	
	System.out.println("Enter the String:");
	
	String str=sc.nextLine();
	
	String s[]=str.split("[ ]");
	
	int l=s.length;
	int lengthOfWord;
	
	if(l==1){
	    lengthOfWord=0;
	    System.out.println(lengthOfWord);
	}
	else{
     lengthOfWord=s[l-1].length();
     System.out.println(lengthOfWord);
	}
	
	}
}