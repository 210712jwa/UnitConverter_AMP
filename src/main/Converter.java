package main;

import java.util.Scanner; //Needed for Scanner class

public class Converter {

	public static void main(String[] args) {

		Scanner userConvert = new Scanner(System.in); // User chooses which conversion to do

		int temp = 0;
		while (temp != 3) {
			
			System.out.println("\nWhat kind of Units would you like to convert?\n");
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
			
			System.out.println("\nThe resulting conversion is " + newValue + " Units.");
			
			temp = convert;

		}

	}

	public static double convertVolume() {
		Scanner userUnits = new Scanner(System.in);
		
		System.out.println("Now choose what you would like to convert to:");
		System.out.println("1. Teaspoons to Tablespoons");
		System.out.println("2. Teaspoons to Cups");
		
		int units = userUnits.nextInt();
		
		double convo = 0.0; //number that contains the converted value
		
		if (units == 1) { 
			System.out.println("Now enter the amount that you want converted.");
			convo = teaToTable();
		}
		
		else if (units == 2) {
			System.out.println("Now enter the amount that you want converted.");
			convo = teaToCups();
		}
		
		else {
			System.out.println("Invalid choice. Reenter:.\n\n");
			convo = convertVolume();
		}
		
		return convo;
	}
	
	public static double convertDistance() {
		Scanner userUnits = new Scanner(System.in);
		
		System.out.println("Now choose what you would like to convert to:");
		System.out.println("1. Feet to Meters");
		System.out.println("2. Miles to Kilometers");
		
		int units = userUnits.nextInt();
		
		
		
		double convo = 0.0; //contains the converted value
		
		if (units == 1) { 
			System.out.println("Now enter the amount that you want converted.");
			convo = feetToMeters();
		}
		
		else if (units == 2) {
			System.out.println("Now enter the amount that you want converted.");
			convo = milesToKilos();
		}
		
		else {
			System.out.println("Invalid choice. Reenter:.\n\n");
			convo = convertVolume();
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
