package test.java;

import java.awt.List;

import org.junit.Test;

import main.java.SILab2;


public class SILab2Test {
	 @Test
	 public void test1() {
		 User testUser = new User(username = "JovanMitrovski", password = "password", email = "jovce_23@hotmail.com");
		 List testList = new List();
		 assertEquals(SILab2.function(testUser, testList), true);
	 } 

	 @Test
	 public void test2() {
	 }
}
