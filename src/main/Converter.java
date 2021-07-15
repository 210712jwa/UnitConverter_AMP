package main;

import java.util.Scanner; //Needed for Scanner class

public class Converter {

	public static void main(String[] args) {

		Scanner userConvert = new Scanner(System.in); // User chooses which conversion to do
		
		
		int temp = 0;
		while (temp != 3) {
//			System.out.println("Please Select an option:");
//			System.out.println("1. Cups to Teaspoons:");
//			System.out.println("2. Miles to Kilometers");
//			System.out.println("3. US Gallons to Liters");
//			System.out.println("4. Quit");
			
			System.out.println("What kind of Units would you like to convert?\n");
			System.out.println("1. Volumetric Units");
			System.out.println("2. Distance Units");
			System.out.println("3. Quit");
			
			
			int convert = userConvert.nextInt(); //User inputs which units to convert to based on a valid integer.
			
			double newValue = 0;
			
			if (convert == 1) {
				newValue = convertVolume();
			}
			
			else if (convert == 2) {
				newValue = convertDistance(); 
			}
			
			else if (convert == 3) {
				System.out.println("Thanks for using this converter. Goodbye!");
				break;
			}
			
			else {
				System.out.println("Invalid choice. Restarting...\n\n");
			}
			
			System.out.println("The resulting conversion is " + newValue);
			
			temp = convert;
			
			

//			switch (convert) {
//			case 1: {
//				// Cups to Teaspoons
//				System.out.println("Now enter the amount that you want converted.");
//				double amount = userAmount.nextDouble();
//				System.out.println(amount + " Cups is equal to " + (amount * 16.0) + " Teaspoons\n");
//				break;
//			}
//			case 2: {
//				// Miles to Kilometers
//				System.out.println("Now enter the amount that you want converted.");
//				double amount = userAmount.nextDouble();
//				System.out.println(amount + " Miles is approx. equal to " + (amount * 1.609344) + " Kilometers\n");
//				break;
//			}
//			case 3: {
//				// US Gallons to Imperial Gallons
//				System.out.println("Now enter the amount that you want converted.");
//				double amount = userAmount.nextDouble();
//				System.out.println(amount + " US Gallons is approx. equal to " + (amount * 3.785) + " Liters\n");
//				break;
//			}
//			case 4: {
//				// Quit
//				System.out.println("Thank you for using this converter! Goodbye.\n");
//				break;
//			}
//			default: {
//				System.out.println("That number is invalid. Please reenter.\n");
//			}
//			}

		}

	}

	public static double convertVolume() {
		Scanner userUnits = new Scanner(System.in);
		
		System.out.println("Now choose what you would like to convert to:");
		System.out.println("1. Teaspoons to Tablespoons");
		System.out.println("2. Teaspoons to Cups");
		
		int units = userUnits.nextInt();
		
		System.out.println("Now enter the amount that you want converted.");
		
		double convo = 0.0; //number that contains the converted value
		
		if (units == 1) { 
			convo = teaToTable();
		}
		
		else if (units == 2) {
			convo = teaToCups();
		}
		
		return convo;
	}
	
	public static double convertDistance() {
		Scanner userUnits = new Scanner(System.in);
		
		System.out.println("Now choose what you would like to convert to:");
		System.out.println("1. Feet to Meters");
		System.out.println("2. Miles to Kilometers");
		
		int units = userUnits.nextInt();
		
		System.out.println("Now enter the amount that you want converted.");
		
		double convo = 0.0; //number that contains the converted value
		
		if (units == 1) { 
			convo = feetToMeters();
		}
		
		else if (units == 2) {
			convo = milesToKilos();
		}
		
		return convo;
	}
	
	
	//Conversion Methods
	
	public static double teaToTable() {
		Scanner userAmount = new Scanner(System.in); //
		double amount = userAmount.nextDouble();
		double value;
		
		value = amount / 3;
				
		return value;
	}
	
	public static double teaToCups() {
		Scanner userAmount = new Scanner(System.in); //
		double amount = userAmount.nextDouble();
		
		double value = amount / 48.692;
				
		return value;
	}
	
	public static double feetToMeters() {
		Scanner userAmount = new Scanner(System.in); //
		double amount = userAmount.nextDouble();
		
		double value = amount / 3.281;
				
		return value;
	}
	
	public static double milesToKilos() {
		Scanner userAmount = new Scanner(System.in); //
		double amount = userAmount.nextDouble();
		
		double value = amount * 1.609 ;
				
		return value;
	}
	
}
