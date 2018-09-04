package com.testing.stepdefinitions;

import java.util.Map;

import org.junit.Assert;

import com.testing.framework.cucumber.Context;
import com.testing.framework.cucumber.TestContext;
import com.testing.library.GitUserServicesLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * @copyrights Imran Aslam
*/
public class GitUserServicesStepDef {

	public TestContext testContext = null;
	public GitUserServicesLibrary searchUserLibrary = null;

	public GitUserServicesStepDef(TestContext context) {
		testContext = context;
	}

	@Given("^Customer searches for users with username \"([^\"]*)\" who have \"([^\"]*)\" than (\\d+) repositories and have \"([^\"]*)\" than (\\d+) followers$")
	public void customer_searches_for_users_with_username_who_have_than_repositories_and_have_than_followers(String arg1, String arg2, int arg3, String arg4, int arg5) throws Throwable {
		boolean result = false;
		String message = null;

		Map<String, Object> serviceResponseMap = null;
		String userName = arg1;
		String repos_greater_or_less = arg2;
		int repos_count = arg3;
		String followers_greater_or_less = arg4;
		int followers_count = arg5;

		try {

			if(searchUserLibrary == null) {
				searchUserLibrary = new GitUserServicesLibrary();
			}
			
			serviceResponseMap = searchUserLibrary.customer_searches_for_users_with_username_who_have_repositories_and_followers(userName,repos_greater_or_less, repos_count, followers_greater_or_less, followers_count);
			
			if(serviceResponseMap != null) {
				testContext.scenarioContext.setContext(Context.SERVICE_RESPONSE_MAP, serviceResponseMap);
			} else {
				result = false;
				throw new Exception("There is a problem with getting the response \n" + message);
			}
			
		} catch (Exception e) {
			Assert.assertTrue(e.getMessage(), result);
		}

	}

	@Then("^Customer validates users with username \"([^\"]*)\" who have \"([^\"]*)\" than (\\d+) repositories and have \"([^\"]*)\" than (\\d+) followers$")
	public void customer_validates_users_with_username_who_have_than_repositories_and_have_than_followers(String arg1, String arg2, int arg3, String arg4, int arg5) throws Throwable {
		boolean result = false;
		Map<String, Object> serviceResponseMap = null;
		boolean isValidationSuccessful = false;
		
		String userName = arg1;
		String repos_greater_or_less = arg2;
		int repos_count = arg3;
		String followers_greater_or_less = arg4;
		int followers_count = arg5;
		
		try {	
			
			serviceResponseMap = (Map<String, Object>) testContext.scenarioContext.getContext(Context.SERVICE_RESPONSE_MAP);

			isValidationSuccessful =  searchUserLibrary.customer_validates_search_results_with_respositories_and_followers(serviceResponseMap, userName, repos_greater_or_less, repos_count, followers_greater_or_less, followers_count);
			
			if(isValidationSuccessful) {
				result = true;
			} else {
				result = false;
				throw new Exception("There is a problem with validation of respositories and followers count \n");
			}
			
			Assert.assertTrue(result);
			
		} catch (Exception e) {
			Assert.assertTrue(e.getMessage(), result);
		}
		
	}

}
