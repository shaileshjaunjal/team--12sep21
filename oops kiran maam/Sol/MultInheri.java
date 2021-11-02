/*
Multi-level inheritance
*/

import java.util.*;
import java.lang.*;

class Triangle{
      
    public void print(){
      
        System.out.println("I am triangle.");
		
    }
    /* static {
      
        System.out.println("I am triangle.");
    }*/
    
}
class IsoscelesTriangle extends Triangle{
      
   public void print(){
        
        System.out.println("I am an isosceles triangle.");
		super.print();
    }
    /*  static {
        
        System.out.println("I am an isosceles triangle.");
    }*/
    
} 
class EquilateralTriangle extends IsoscelesTriangle{
    
    public void print(){
        
        System.out.println("I am an equilateral triangle.");
		super.print();	
    }
    /*static {
        
        System.out.println("I am an equilateral triangle.");
    }*/
}

public class MultInheri
{
	public static void main(String[] args) {
	  /*
	  // normal method
	  Triangle t= new EquilateralTriangle();
	  t.print();
	  Triangle t1= new IsoscelesTriangle();
	  t1.print();
	  Triangle t3= new Triangle();
	  t3.print();
	  */
	  
	  // using super keyword method
	  Triangle t= new EquilateralTriangle();
	  t.print();
	  
	
	}
}