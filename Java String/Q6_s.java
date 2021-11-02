/*
6. Given a string, check whether it is a formed by concatenating the same string 3 times. 

 Input: "abcabcabc", Output: true (abc is repeated 3 times) 
 
 Input: "abcdabcdabcd", Output: true (abcd is repeated 3 times) 
 
 Input: "andandan', Output: false 


*/
import java.util.*;
public class Q6_s
{
	public static void main(String[] args) {
	     Scanner sc =new Scanner(System.in);
	   System.out.println("Enter the String.");
	   String s=sc.next();
        
        int strLength=s.length();
        
        char a[]=s.toCharArray();
      
        for(char x:a){
        System.out.print(x+" ");
        }
         int e=strLength/3;
         boolean flag=true;
         
        if(strLength%3==0){
            
      		  String sub=""+s.subSequence(0,e);
        
      		  String sfinal=""+sub+sub+sub;
        
       		  System.out.print("\n"+sfinal+"\n");
        
      		  char f[]=sfinal.toCharArray();
        
 	          for(int i=0;i<a.length;i++){
  		          if(a[i]==f[i]){
                
 		           }
 	  	         else{
 		               flag=false;
 		               break;
 		           }
 	           }
          
        }
   	     else{
  	          flag=false;
        }
        
      if(flag==false){
          System.out.println("\n"+flag);
      }
      else{
           System.out.println("\n"+"true");
      }

}
}
