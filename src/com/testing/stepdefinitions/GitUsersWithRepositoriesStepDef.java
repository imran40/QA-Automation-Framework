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
public class GitUsersWithRepositoriesStepDef {

	public TestContext testContext = null;
	public GitUserServicesLibrary searchUserLibrary = null;

	public GitUsersWithRepositoriesStepDef(TestContext context) {
		testContext = context;
	}

	@Given("^Customer searches for users with username \"([^\"]*)\" who have \"([^\"]*)\" than (\\d+) repositories$")
	public void customer_searches_for_users_with_username_who_have_than_repositories(String arg1, String arg2, int arg3) throws Throwable {
		boolean result = false;
		String message = null;

		Map<String, Object> serviceResponseMap = null;
		String userName = arg1;	
		String repos_greater_or_less = arg2;
		int repos_count = arg3;


		try {

			if(searchUserLibrary == null) {
				searchUserLibrary = new GitUserServicesLibrary();
			}
			
			serviceResponseMap = searchUserLibrary.customer_searches_for_users_with_username_who_have_repositories(userName,repos_greater_or_less, repos_count);
			
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

	@Then("^Customer validates users with username \"([^\"]*)\" who have \"([^\"]*)\" than (\\d+) repositories$")
	public void customer_validates_users_with_username_who_have_than_repositories(String arg1, String arg2, int arg3) throws Throwable {
		boolean result = false;
		Map<String, Object> serviceResponseMap = null;
		boolean isValidationSuccessful = false;
		
		String userName = arg1;	
		String repos_greater_or_less = arg2;
		int repos_count = arg3;
		
		try {	

			serviceResponseMap = (Map<String, Object>) testContext.scenarioContext.getContext(Context.SERVICE_RESPONSE_MAP);
			isValidationSuccessful =  searchUserLibrary.customer_validates_search_results_with_respositories ( serviceResponseMap, userName, repos_greater_or_less, repos_count);

			if(isValidationSuccessful) {
				result = true;
			} else {
				result = false;
				throw new Exception("There is a problem with validation of respositories count \n");
			}
			
			Assert.assertTrue(result);
			
		} catch (Exception e) {
			Assert.assertTrue(e.getMessage(), result);
		}
		
	}


}
