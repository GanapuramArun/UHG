package ScannerDemo;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Please enter your  First Name : ");
		String FirstName = scan.nextLine();
		System.out.println("Enter your Last Name : ");
		String LastName = scan.nextLine();
		System.out.println("Enter your House Number: ");
		int HouseNumber = scan.nextInt();
		System.out.println("Enter your Street Name : ");
		String StreetName = scan.nextLine();
		System.out.println("Enter your city Name :");
		String city = scan.nextLine();
		System.out.println(FirstName+" "+LastName+" "+HouseNumber+" ");
		System.out.println(StreetName+" "+city);
		
	}

}
