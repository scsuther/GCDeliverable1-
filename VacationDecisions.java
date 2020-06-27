import java.util.Scanner;
public class VacationDecisions {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String musical = "musical";
		String tropical = "tropical";
		String adventurous = "adventurous";
		String destination = "destination";
		String vacationType = "vacationType";	
		String travelType = "traveltype";
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Would you like to go on a musical, tropical, or adventurous vacation? ");
		vacationType = scnr.next();
		
		if (vacationType.equals(musical)) 
		{destination = ("New Orleans!");}
				
		else if (vacationType.equals(tropical)) 
		{destination =("a beach in Mexico!");}
		
		else if (vacationType.equals(adventurous)) 
		{destination = ("go whitewater rafting in the Grand Canyon!");}	
		 
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
		int groupSize;
		
		System.out.println("How many are in your group?");
		groupSize = scnr.nextInt();
		
		if (groupSize <=2 ) {travelType =("fly first class");}
		
		else if (groupSize <=5) {travelType = ("take a helicopter");}
		
		else if (groupSize >=6) {travelType = ("charter a flight");}
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
		System.out.println("Since you're a group of " + groupSize + " going on a " 
		
				+ vacationType + " vacation you should " + travelType + " to " + destination);
		
		
		
			
			}
		
		}
		
		
		
		
		
		
		
		
		

		
		
		
	

