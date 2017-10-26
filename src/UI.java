import java.io.Console;
import java.util.Scanner;

import com.lotus.admin.Admin;

public class UI {
	
	private Scanner userInput;
	private Admin admin;
	private BetSystem betSystem;
	private boolean adminLoop;
	private boolean userLoop;
	
	UI(){
		userInput = new Scanner(System.in);
		betSystem = new BetSystem();
		admin = new Admin();
		adminLoop = true;
		userLoop = true;
	}
	
	public void displayUserTypeMenu() {
		while(userLoop) {
			System.out.println("Welcome to LODIPETMALU betting system");
			System.out.println("[1] Admin");
			System.out.println("[2] Customer");
			System.out.println("[0] Exit");
			askTypeOfUser();
		}
	}

	private void askTypeOfUser() {
		String option = userInput.nextLine();
		
		if(option.equals("0")) {
			this.userLoop = false;
		} else if (option.equals("1")) {
			requestAdminControl();
		} else {
			System.out.println("Invalid choice.\n");
		}
	}
	
	private void displayAdminMenu() {
		this.adminLoop = true;
		while(adminLoop){
			System.out.println("[1] Create account");
			System.out.println("[2] Create event");
			System.out.println("[3] Show accounts");
			System.out.println("[4] Show events");
			System.out.println("[5] Show event result");
			System.out.println("[5] Show bets");
			System.out.println("[6] Specify event");
			System.out.println("[7] Adjust customer balance");
			System.out.println("[0] Exit");
			
			askAdminActions();
		}
	}
	
	private void askAdminActions() {
		String option = userInput.nextLine();
		
		if(option.equals("0")) {
			this.adminLoop = false;
		} else if(option.equals("1")){
			askFieldsForNewCustomer();
		} else {
			System.out.println("Invalid choice.\n");
		}
	}
	
	private void requestAdminControl() {
		System.out.println("Please enter admin password: ");
		String inputPassword =userInput.nextLine();
		
		if(inputPassword.equals(admin.getPassword())) {
			displayAdminMenu();
		} else {
			System.out.println("Wrong password.\n");
		}
		
	}

	private void askFieldsForNewCustomer() {
		String username, password, firstname, lastname;
		System.out.print("Username: ");
		username = userInput.nextLine();
		System.out.print("Passord: ");
		password = userInput.nextLine();
		System.out.print("Firstname: ");
		firstname = userInput.nextLine();
		System.out.print("Lastname: ");
		lastname = userInput.nextLine();
		
	}

	private boolean checkNewCustomerFields(String username, String password, String firstname, String lastname) {
		
	}
}
