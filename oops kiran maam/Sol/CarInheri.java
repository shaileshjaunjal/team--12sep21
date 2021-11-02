import java.util.*;
import java.lang.*;

abstract class Car{
	boolean isSedan;
	String seats;

	Car(boolean isSedan,String seats){
	this.isSedan=isSedan;
	this.seats=seats;
	}

	boolean getIsSedan(){
	return isSedan;
	}
	String getSeats(){
	return "is "+seats+"-seater";
	}
	abstract String getMileage();
}

class WagonR extends Car{

	int mileage;

	WagonR(int a){
	super(false,"4");
	this.mileage=a;
	}
	/*
	boolean getIsSedan(){
		return isSedan;
	}
	String getSeats(){
		return "is "+seats+"-seater,";
	}
	*/
	/*	String getSeats(){
	return "is "+seats+"-seater";
	}*/
	String getMileage(){
		return ""+mileage+"kmpl.";
	}
}

class HondaCity extends Car{
	
	int mileage;

	HondaCity( int a){
	super(true,"4");
	this.mileage=a;
	}
	/*	String getSeats(){
	return "is "+seats+"-seater";
	}*/
	String getMileage(){
	return ""+mileage+"kmpl.";
	}
}

class InnovaCrysta extends Car{
	int mileage;

	InnovaCrysta(int a){
	super(false,"8");
	this.mileage=a;

	}
	/*	String getSeats(){
	return "is "+seats+"-seater";
	}*/
	String getMileage(){
	return ""+mileage+"kmpl.";
	}
}

class CarInheri{

	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice: 0 for WagonR ,1 for HondaCity,2 for InnovaCrysta.");
	int choice=sc.nextInt();
	boolean flag=true;
	if(choice==0){
		while(flag==true){
		System.out.println("Enter mileage:");
		int mil=sc.nextInt();
		if(mil>=5 && mil<=30){
			flag=false;	
		
		WagonR w= new WagonR(mil);
		boolean a=w.getIsSedan();
		String b;
		if(a==true){
		 b="is sedan,";
		}
		else{
		 b="is not sedan,";
		}
		System.out.println("A WagnoR "+b+""+w.getSeats()+" and has a mileage of around "+w.getMileage());
		// A WagonR is not sedan,is 4-seater,and has a mileage of around 22kmpl.
		}
		else{
			flag=true;
		}
	   }
	}
	else if(choice==1){
		while(flag==true){
		System.out.println("Enter mileage:");
		int mil=sc.nextInt();
		if(mil>=5 && mil<=30){
			flag=false;	
		
		HondaCity h= new HondaCity(mil);
		boolean a=h.getIsSedan();
		String b;
		if(a==true){
		 b="is sedan,";
		}
		else{
		 b="is not sedan,";
		}
		System.out.println("A HondaCity "+b+""+h.getSeats()+" and has a mileage of around "+h.getMileage());
		// A WagonR is not sedan,is 4-seater,and has a mileage of around 22kmpl.
		}
		else{
			flag=true;
		}
	   }
	}
	else if(choice==2){
		while(flag==true){
		System.out.println("Enter mileage:");
		int mil=sc.nextInt();
		if(mil>=5 && mil<=30){
			flag=false;	
		
		InnovaCrysta i= new InnovaCrysta(mil);
		boolean a=i.getIsSedan();
		String b;
		if(a==true){
		 b="is sedan,";
		}
		else{
		 b="is not sedan,";
		}
		System.out.println("A InnovaCrysta "+b+""+i.getSeats()+" and has a mileage of around "+i.getMileage());
		}
		
		
		}

	}
	}
	}