package com.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ExceptionTest {
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void empty() {
		new ArrayList<Object>().get(0);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void pickSecondItem() {
		List<String> list = new ArrayList<String>();
		list.add("Alex");
		
		list.get(1);
	}
	
	@Test
	public void shouldTestExceptionMessage() {
		try {
			new ArrayList<Object>().get(0);
			fail("Expect IndexOutOfBounds to be thrown");			
		} catch (IndexOutOfBoundsException ex) {
			assertThat(ex.getMessage(), is("index:0, Size: 0"));
		}	
	}

	private void assertThat(String message, Object object) {
		// TODO Auto-generated method stub
		
	}

	private Object is(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
