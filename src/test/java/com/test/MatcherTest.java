package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatcherTest {
	
	@Test
	public void checkEquality() {
		Person person = new Person("Alex");
		Person clonePerson = person;
		
		assertThat(person).isEqualTo(clonePerson);
	}

}
