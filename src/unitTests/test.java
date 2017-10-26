package unitTests;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import com.lotus.customer.Customer;
import com.lotus.customexceptions.*;
import com.lotus.validator.Validator;

public class test {

	@Test
	public void test() {
		String sample ="aaa";
		
		Customer c = new Customer("aaa", "aaa", "aaa","aaa");
		
		List<Customer> clist = new ArrayList();
		clist.add(c);
		
		try {
			Validator.checkUsernameIfSpecCharExist(sample);
			Validator.checkUsernameIfValidLength(sample);
			Validator.checkIfStringIsEmpty(sample);
			Validator.checkIfUsernameExist(sample, clist);
			System.out.println("Valid Username");
		}
		catch(CharacterEx e) {
			System.out.println("[SYSTEM MSG] Username must not contain special characters.");
	
		}
		catch(UsernameLengthEx e) {
			System.out.println("[SYSTEM MSG] Username must not be greater than 10 characters.");
		}
		catch(EmptyStringEx e) {
			System.out.println("[SYSTEM MSG] Username cannot be empty.");
			
		} catch (CustomerExistEx e) {
			System.out.println("[SYSTEM MSG] Username already been used.");
			
		}
		
	
	}

}
