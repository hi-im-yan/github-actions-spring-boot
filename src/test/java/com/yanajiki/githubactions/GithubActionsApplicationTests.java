package com.yanajiki.githubactions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class GithubActionsApplicationTests {

	@Test
	@DisplayName("Test just to show on log")
	void contextLoads() {

		assertTrue(true);
	}

}
