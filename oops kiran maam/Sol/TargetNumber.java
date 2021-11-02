/*
Array element addition matching with target print array index
*/

import java.util.*;
import java.lang.*;



public class TargetNumber
{
    public static void main(String[] args) {

    Scanner sc=new Scanner (System.in);

    System.out.println("Enter the target number:");
    int target=sc.nextInt();

    System.out.println("Enter array length:");
    int n=sc.nextInt();

    int arr[]=new int[n];
    
    
    for(int k=0;k<arr.length;k++){
        arr[k]=sc.nextInt();
    }
    System.out.print("[");
    for(int a:arr){
        System.out.print(a+",");
    }
    System.out.print("]");
    
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if((arr[i]+arr[j])==target){
                System.out.print("["+i+","+j+"] ");
            }
            else{}
        }
         if(arr[i]==target){
                System.out.print("["+i+"]");
            }
    }
	}
}
