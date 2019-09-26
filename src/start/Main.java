package start;

import java.util.Scanner;

import page.tests.HumanityAddNewEmpAUTO;
import page.tests.HumanityAddNewEmployeeTests;
import page.tests.HumanityEditStaffTest;
import page.tests.HumanityHomeTest;
import page.tests.HumanityHomeTestAUTO;
import page.tests.HumanityProfileTest;
import page.tests.HumanitySettingsTest;
import page.tests.HumanitySingOutTest;

public class Main {

	public static void main(String[] args) throws InterruptedException  {
		System.out.println("WELCOME to the testing room");
		Scanner sc = new Scanner(System.in);
		int opcija;
		do {
			System.out.println("Please choose number for testing:");
			System.out.println("0 - EXIT");
			System.out.println("1 - Login");
			System.out.println("2 - Sing out");
			System.out.println("3 - Profile test");
			System.out.println("4 - Settings test");
			System.out.println("5 - Edit staff test ");
			System.out.println("6 - Add employee test");
			 opcija = sc.nextInt();
		  switch(opcija) {
		  case 1:
			  	HumanityHomeTestAUTO.FirstTestAUTO();
			  	break;  
		  case 2:
			  	HumanitySingOutTest.SingOutTest();
			  	break;
		  case 3: 
			  	HumanityProfileTest.ProfileTest();
			  	break;
		  case 4: 
			  	HumanitySettingsTest.SettingsTest();
			  	break;
		  case 5: 
			  	HumanityEditStaffTest.EditStaffTest();
			  	break;
		  case 6:
			  	HumanityAddNewEmpAUTO.AddEmpAUTO();
			  	break;
			case 0: 
				System.out.println("You left the testing room");
				break;
			}
		  
		} while (opcija!=0);

		
		}
	}


