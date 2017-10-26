package com.lotus.validator;

import java.util.List;

import com.lotus.customer.Customer;
import com.lotus.customexceptions.*;

public final class Validator {

	private Validator() {
		
	}
	

	public static void checkUsernameIfSpecCharExist(String username) throws CharacterEx {
		username = username.toLowerCase();
		for(int i = 0; i<username.length(); i++) {
			if(username.charAt(i) >= 'a' && username.charAt(i) <= 'z' || 
			   username.charAt(i) >= '0' && username.charAt(i) <= '9') {
				
			} else { 
				throw new CharacterEx();
			}
		}
		
	}

	public static void checkUsernameIfValidLength(String str) throws UsernameLengthEx {
		if(str.length()>10) {
			throw new UsernameLengthEx();
		}
	}

	public static void checkIfStringIsEmpty(String str) throws EmptyStringEx {
		if(str.isEmpty()) {
			throw new EmptyStringEx();
		}
	}

	public static void checkIfUsernameExist(String username, List<Customer> cList) throws CustomerExistEx {
		for(Customer c: cList) {
			if(c.getFirstname().equals(username)) {
				throw new CustomerExistEx();
			}
		}
		
	}
}