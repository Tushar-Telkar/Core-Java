package com.tnsif.testcase.basictestcases;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

public class RepeatingTest {

	
	@DisplayName("RTest")
	@RepeatedTest(5)
	void test(TestInfo testInfo) {
		System.out.println(testInfo.getDisplayName());
	}

}