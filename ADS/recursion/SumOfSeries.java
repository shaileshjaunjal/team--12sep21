import java.io.*;
import java.util.*;

public class SumOfSeries {
   // static double sum;
    static float sum(int a,int b,float s){
        if(a>b){
            return s;
        }
        else{
            
            if(a%2==0){
                s=s-((float)1/a);                
            }
            else{
                s=s+((float)1/a);
            }
            return sum(a+1,b,s);
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        float s=0F;
        
       float result=sum(1,n,s);
        
        System.out.printf("%1.6f",result);
    }
}