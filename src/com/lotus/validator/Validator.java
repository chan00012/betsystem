package com.lotus.validator;

import java.util.List;

import com.lotus.customer.Customer;

public final class Validator {

	private Validator() {
		
	}
	
	public static boolean checkIfValidUser(String username, List<Customer> cList) {
		boolean isValidUserName;
		boolean isValidLength;
		boolean isUserNameExist;
	}

	public static boolean checkUsernameIfCharNotExist(String username) {
		username = username.toLowerCase();
		for(int i = 0; i<username.length(); i++) {
			if(username.charAt(i) >= 'a' && username.charAt(i) <= 'z' || 
			   username.charAt(i) >= '0' && username.charAt(i) <= '9') {
				
			} else {
				return false;
			}
		}
		return true;
	}
}