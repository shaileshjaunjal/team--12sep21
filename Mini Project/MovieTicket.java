import java.util.*;

public class MovieTicket
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		Screen1 obj[][][] = new Screen1[4][2][2]; // for 1 movie n 01.04PM time 
		
		for(int k=0; k<4; k++)
			for(int l=0; l<2;l++)
				for(int h = 0; h<2; h++)
					obj[k][l][h] = new Screen1();

		String theater = "";
		System.out.println("Welcome To Movie Ticket Booking System.\n\n");

		int exit=1;
		while(exit==1)
		{	
			int screen=0;
			int show = 0;
			String movie = "";
			System.out.println("Select your Theatre..\n\n1. INOX  \n2. PVR \n");
			System.out.print("Enter your choise here : ");
			int theater1=sc.nextInt();
			theater1 =theater1-1;

				// if condition for INOX Theatre
			if(theater1==0)
			{
				System.out.println("\n\n\t\t\t---INOX theatre---\n");

				System.out.println("Screen No.1 : \n");
				Inox.showdetails1();
				System.out.println("Screen No.2 : \n");
				Inox.showdetails();

				theater = "INOX";

				System.out.print("\nSelect the screen : ");
				screen = sc.nextInt();
				screen = screen -1 ;

				System.out.print("\nSelect the timing : ");
				show=sc.nextInt();
				show = show-1;
				
				if(screen == 0)
					movie = ticket1.moviename1(show);
				else 
					movie = ticket1.moviename(show);
			}
			else if(theater1==1)
			{
				System.out.println("\t\t\t---PVR---\n\n");

				System.out.println("Screen No.1 : \n");
				Inox.showdetails1();

				System.out.println("Screen No.2 : \n");
				Inox.showdetails();

				theater = "PVR";

				System.out.print("\nSelect the screen : ");
				screen = sc.nextInt();
				screen = screen - 1 ;

				System.out.print("\nSelect the timing : ");
				show =sc.nextInt();
				show = show -1;

				if(screen == 0)
					movie = ticket1.moviename1(show);
				else 
					movie = ticket1.moviename(show);
			}
			else 
				System.out.println("You enter incorrect answer");
			
			
			int end=1;
			while(end==1)
			{
				System.out.println("\n\n------------------------------------------------------------------------------");
				
				System.out.println("\n\n1. BookTicket\n2. CancelTicket\n3. AvailableSeats");
				System.out.print("\nSelect your option : ");
				int a=sc.nextInt();
				a = a-1;
				
				if(a==0)
				{					// for ticket booking
					obj[show][theater1][screen].seatAvailable();
					System.out.println("\n\nNumber of tickets you want to book:");
					int numberOfTicket=sc.nextInt();
					int arr[]=new int[numberOfTicket];
					System.out.println("Enter the seat number:");
				
					for(int n=0;n<numberOfTicket;n++)
					{
						arr[n] = sc.nextInt();
						//invalid seat number.
						if(arr[n]<=60 && arr[n]>=1){
							
						}
						else{
							System.out.println("Invalid seat number. try again.");
							n--;
						}
					}
					obj[show][theater1][screen].bookSeat(arr,show,screen,theater,movie,numberOfTicket);										
					obj[show][theater1][screen].seatAvailable();
				}

				else if(a==1)
				{				// for ticket cancelation
					obj[show][theater1][screen].seatAvailable();
					System.out.println("\n\nNumber of tickets want to cancel:");
					int numberOfTicket=sc.nextInt();
					int arr[]=new int[numberOfTicket];
					System.out.println("Enter the seat number:");

					for(int n=0;n<numberOfTicket;n++)
					{
						arr[n] = sc.nextInt();
					}
					obj[show][theater1][screen].cancelSeat(arr);
					obj[show][theater1][screen].seatAvailable();
				}

				else if(a==2)
				{
					obj[show][theater1][screen].seatAvailable();
				}

				System.out.print("\n\nContinue Booking Process (1) and For Exit (0):");
				end=sc.nextInt();
			}
				System.out.print("\n\n\n 1 For Other Theatre Option (1), 0 For Exit (0):");
				exit=sc.nextInt();
		}
		sc.close();		
	}
}
class Inox
{
	Scanner sc1 =new Scanner(System.in);
	boolean seats[]=new boolean[61]; //{0,1,2,3.....59,60} we will neglect 0th index n only consider 1 to 60
	Inox()
	{
		Arrays.fill(seats,false);
	}

	static void showdetails1()		//inox theater
	{
		System.out.println("Option  time            Movie name              Ticket Price");
		System.out.println("                                            Silver   Gold    Platinum");
		System.out.println(" (1)   09 to 12AM       Avenger 2            100     150      200");
		System.out.println(" (2)   01 to 04PM       The Hulk             100     150      200");
		System.out.println(" (3)   05 to 08PM       The Dark knight	     100     150      200");
		System.out.println(" (4)   09 to 12PM       The Man Of Steel     100     150      200");
		System.out.println("\n\n");
	}
	static void showdetails()		//pvr theater
	{
		System.out.println("Option  time          Movie name         Ticket Price");
		System.out.println("                                      Silver   Gold    Platinum");
		System.out.println(" (1)  09 to 12AM       Sooryavanshi     100     150      200");
		System.out.println(" (2)  01 to 04PM       Eternal	        100     150      200");
		System.out.println(" (3)  05 to 08PM       KGF 2            100     150      200");
		System.out.println(" (4)  09 to 12PM       Iron man 3       100     150      200");
		System.out.println("\n\n");
	}
}

class Screen1 extends Inox
{
	public void seatAvailable()
	{
		System.out.println("\n\n  --------SCREEN----------   	\n");
		for(int i=1;i<seats.length;i++)
		{
			if(i==1)
			{
				System.out.println("\n	[SILVER]	");
			}
			else if(i==21)
			{
				System.out.print("\n	[GOLD]	");
			}
			else if(i==41)
			{
				System.out.print("\n	[PLATINUM]	");
			}
			
			if(seats[i]==false)
			{
				if(i==11 || i==21 || i==41 ||i==31||i==51)
				{
					System.out.println();
				}
				System.out.printf("%02d ",i);
			}
			else
			{
				if(i==11 || i==21 || i==41 ||i==31||i==51)
				{
					System.out.println();
				}
				System.out.print("   ");
			}
		}
	}
	
	public void bookSeat(int a[],int d,int screen,String theater,String movie, int noofticket)
	{
		int s=0;int g=0;int p=0;
		int bill;
		int pay=0;		
		boolean flag=true;
		int booked=0;
		int arj[] = a;
		
		for(int i = 0; i < noofticket; i++ )
			for (int j =i+1; j<noofticket; j++)
				if(arj[i] == a[j])
				{
					System.out.println("\nYou entered same number here Please try again....");
					return;
				}
			

		for(int j=0; j < a.length; j++)
		{
			if(seats[a[j]]==false)
			{
				
			}
			else
			{
				flag=false;
				booked=a[j];
				System.out.println("\nSeat "+booked+" is already book");	
			}

		}
		int k[] = new int [61];
		if(flag==true)
		{
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]<=20)
				{
					k[i] = 100;
					s++;
				}
				else if(a[i]>20 && a[i]<=40)
				{
					k[i] = 150;
					g++;
				}
				else if(a[i]>40 && a[i]<=60)
				{
					k[i]=200;
					p++;
				}
				seats[a[i]]=true;		// for booking seat
			}

			bill=(s*100)+(g*150)+(p*200);

			while(bill!=pay)
			{
				System.out.println("\nYour Total bill is "+bill+" Rs. Please Pay the bill : ");
				pay=sc1.nextInt();
			}
			for (int b= 0; b < a.length; b++)
			ticket1.ticketshow(k[b],d,a[b],screen,theater,movie);

		}		

		else
		{
			System.out.println("\ntry again...\n\n");
		}
	}
	
	public void cancelSeat(int a[])
	{
		
		int s=0;int g=0;int p=0;
		int bill;

		boolean flag=false;
		int booked=0;

		for(int j=0; j < a.length; j++)
		{
			if(seats[a[j]]==true)
			{
				
			}
			else
			{
				flag=true;
				booked=a[j];
				System.out.println("\nSeat "+booked+" is already empty");	
			}
		}
		
		if(flag==false)
		{
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]<=20)
				{
					s++;
				}
				else if(a[i]>20 && a[i]<=40)
				{
					g++;
				}
				else if(a[i]>40 && a[i]<=60)
				{
					p++;
				}
				seats[a[i]]=false;		// for booking seat
			}

			bill=(s*100)+(g*150)+(p*200);

			System.out.println(bill+" Rs."+" Your Amount is refunded");
			System.out.println("Thank you.");
			
		}		

		else
		{
			System.out.println("try again...\n\n");;
		}
		
	} 
}
class ticket1 {

    static String moviename(int choose)
    {
        String str ="Enter again";
        switch (choose)
        {
            case 0 :
            {
                str = "Sooryavanshi";
                break;
            }

            case 1 :
            {
                str = "Eternal";
                break;
            }

            case 2 :
            {
                str = "KGF 2";
                break;
            }

            case 3 :
            {
                str = "Iron Man 3";
                break;
            }

            default :
                System.out.println("Enter incorrect movie");
        }
        return str;
    }

    static String moviename1(int choose)
    {
        String str ="Enter again";
        switch (choose)
        {
            case 0 :
            {
                str = "Avenger 2";
                break;
            }

            case 1 :
            {
                str = "The Hulk";
                break;
            }

            case 2 :
            {
                str = "The Dark knight";
                break;
            }

            case 3 :
            {
                str = "The Man Of Steel";
                break;
            }

            default :
                System.out.println("Enter incorrect movie");
        }
        return str;
    }

    static String showtime(int i)
    {
        String time = "";
        switch(i)
        {
            case 0 :
            {
                time = "09 to 12";
                break;
            }
            case 1:
            {
                time = "01 to 04";
                break;
            }
            case 2 :
            {
                time = "05 to 08";
                break;
            }
            case 3:
            {
                time = "09 to 12";
                break;
            }
            default :
                break;
        }
        return time;
    }
    static void ticketshow(int k, int i, int arr, int screen,String theater,String movie)
    {
        Date date = new Date();
        System.out.println("\n\n======================== "+theater+" Cinemas =======================");
		System.out.println("\t\t      ----Ticket----\n");
        System.out.println("\tMovie: "+movie+"\t");
        System.out.print("\tTime: "+showtime(i));
        System.out.println("\t\t\tSeat No. : "+arr);
        System.out.println("\tScreen: "+(screen+1));
        System.out.println("\tDate: "+date);
        System.out.println("\tPrice: "+k+" rs");
        System.out.println("\tThank You! Hope to see you again soon!\n");
		System.out.println("======================== "+theater+" Cinemas =======================\n\n");
    }
}
