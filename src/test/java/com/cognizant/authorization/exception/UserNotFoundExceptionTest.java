package com.cognizant.authorization.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
//@SpringBootTest
public class UserNotFoundExceptionTest {

	@Mock
	private UserNotFoundException userNotFoundException;
	
	@Test
	public void testOneArgConstructor() {
		UserNotFoundException userNotFoundException = new UserNotFoundException("User not found.");
		assertEquals("User not found.", userNotFoundException.getMessage());
	}
	
	//@Test
	//public void testNoArgsConstructor() {
		//UserNotFoundException userNotFoundException = new UserNotFoundException();
		//assertEquals(null, userNotFoundException.getMessage());
	//}
}
