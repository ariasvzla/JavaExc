//import class
import java.util.Scanner;
import java.util.*;


//Create class
public class Cashman20

{    //Main Method
	public static void main (String[]args)

	{
		final String EURO = "\u00ae";
        //declare variables
		double scost=0;
		double amountPaid;
		double totalChange;

        //Declare variables for notes
		int fn=0;       	//50 Euro Notes
		int tn=0;   	   //20 euro notes
		int teN=0;  	  //10 euro notes
	    int fIn=0;  	 //5 euro notes
		int tWc=0;  	//2 coins
	    int Oc=0;      //1 coins

	    int nChange;      	  //Variable use to storage the change afer calculate how many 50 euro notes are
        double wronA;

        //Declare classes to call objects later
		Scanner keyb=new Scanner(System.in);


        //Input shopping cost
		System.out.print("Enter shopping cost: ");
		scost=keyb.nextDouble();

        //Input Amount customer has paid
		System.out.print("Enter amount paid: ");
		amountPaid=keyb.nextDouble();


while (amountPaid<scost)
{
	wronA=(scost-amountPaid);




	System.out.print("Please insert " +wronA + " "+"euros more" +" "+ "to complete the payment: ");
	wronA=keyb.nextDouble();

    amountPaid=wronA+amountPaid;
}



			System.out.println("                                    ");
			System.out.println("                                    ");

         //Convert double to integer
          scost= Math.round(scost);

          amountPaid=Math.round(amountPaid);
         //Process to calculate the change

	       totalChange=amountPaid-scost;

           int totalChangeInt= (int) totalChange;
         //Output the total change to give to the customer
           nChange=totalChangeInt;





			System.out.println("                                    ");
			System.out.println("                                    ");
			System.out.println("------------------The change is= " +totalChange);

    while (nChange>0)
    {
			 if (nChange>=50)
			 {

			 fn=totalChangeInt/50;
			 nChange=totalChangeInt%50;
			 }
			 else if (nChange>=20)
			 {
			 tn=nChange/20;
			 nChange=nChange%20;
			 }
			 else if (nChange>=10)
			 {
			 teN=nChange/10;
			 nChange=nChange%10;
			 }
			 else if (nChange>=5)
			 {
			  fIn=nChange/5;
			  nChange=nChange%5;
			 }
			 else if (nChange>=2)
			 {
			 tWc=nChange/2;
			 nChange=nChange%2;
			 }
			 else
			 {
			 Oc=nChange/1;
			 nChange=nChange%1;
			 }
     }

                //Output
				System.out.println("                                    ");
				System.out.println("------------------Change breakdown   ");
				System.out.println("                                     ");
				System.out.println("------------------Notes of 50 euro = " +fn);
				System.out.println("                                     ");
				System.out.println("------------------Notes of 20 euro = "   +tn);
				System.out.println("                                     ");
				System.out.println("------------------Notes of 10 euro = "   +teN);
				System.out.println("                                     ");
				System.out.println("------------------Notes of 5 euro  = "    +fIn);
				System.out.println("                                     ");
				System.out.println("------------------Coisn of 2 euro  = "    +tWc);
				System.out.println("                                     ");
				System.out.println("------------------Coins of 1 euro  = "  +Oc);
				System.out.println("                                     ");

}
}
