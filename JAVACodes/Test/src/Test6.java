import java.util.Scanner;
 
public class Test6{
	 static double getRate(double age, double deposit){
		 	double rate;
		 		if (age >65 || deposit >=50000)
		 				rate = 5/100;
		 		else
		 				rate = 0;
		 		
		 		return rate;
	 }

	 static double findInterest (double deposit, double rate){
		 	double interest = deposit +rate;
		 		return rate;
	 }
	 
	 public static void main (String[] args){
		 	
		 	Scanner scan = new Scanner(System.in);
		 	System.out.print ("Enter age:");
		 	double a = scan.nextDouble();
		 	System.out.print ("Enter Deposit:");
		 	double d = scan.nextDouble();
		 	double r = getRate(a,r);
		 	double i = findInterest(d,r);
		 	System.out.println ("Interest is:" + i);

	 }

 } // End of Program