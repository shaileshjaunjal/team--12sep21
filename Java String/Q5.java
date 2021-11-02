/*
WAP which print the length of word in sentence
ip-I am a java programmer.
op-1 2 1 4 10 
*/

import java.util.*;
import java.lang.*;

class Q5{

public static void main(String[] args){

Scanner sc= new Scanner(System.in);

System.out.print("Enter the string:");

String ss=sc.nextLine();

//int l=ss.length();

String ar[]=ss.split("[ ]+");    // regular expression (regex) it will split string on basis of white space  '+' is not needed in "[ ]+".

int l=ar.length;

for(String x:ar){
System.out.print(x+" ");
}

for(int j=0;j<l;j++){
System.out.print(ar[j].length()+" ");
}


}
}