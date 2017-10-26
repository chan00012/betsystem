package unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lotus.validator.Validator;

public class test {

	@Test
	public void test() {
		assertTrue(Validator.checkUsernameIfCharNotExist("a1aAAa"));
	}

}
