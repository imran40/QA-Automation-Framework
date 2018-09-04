package com.testing.stepdefinitions;

import java.util.Map;

import org.junit.Assert;

import com.testing.framework.cucumber.Context;
import com.testing.framework.cucumber.TestContext;
import com.testing.library.GitSearchPaginationLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * @copyrights Imran Aslam
*/
public class GitPaginationStepDef {

	public TestContext testContext = null;
	public GitSearchPaginationLibrary gitSearchPaginationLibrary = null;

	public GitPaginationStepDef(TestContext context) {
		testContext = context;
	}

	@Given("^Customer searches for users with username \"([^\"]*)\" where there are (\\d+) results are returned for page number (\\d+) with the order as \"([^\"]*)\" the results are sorted by \"([^\"]*)\"$")
	public void customer_searches_for_users_with_username_where_there_are_results_are_returned_for_page_number_with_the_order_as_the_results_are_sorted_by(String arg1, int arg2, int arg3, String arg4, String arg5) throws Throwable {
		boolean result = false;
		String message = null;

		Map<String, Object> serviceResponseMap = null;
		String userName = arg1;
		int perPage = arg2;
		int page = arg3;
		String sort = arg4;
		String sortorder = arg5;

		try {

			if(gitSearchPaginationLibrary == null) {
				gitSearchPaginationLibrary = new GitSearchPaginationLibrary();
			}
			
			serviceResponseMap = gitSearchPaginationLibrary.customer_searches_results_with_pagination(userName, perPage, page, sort, sortorder);
			
			if(serviceResponseMap != null) {
				testContext.scenarioContext.setContext(Context.SERVICE_RESPONSE_MAP, serviceResponseMap);
				result = true;
			} else {
				result = false;
				throw new Exception("There is a problem with getting the response \n" + message);
			}
			
			Assert.assertTrue(result);
			
		} catch (Exception e) {
			Assert.assertTrue(e.getMessage(), result);
		}

	}
	
	
	@Then("^Customer validates the items per page to be (\\d+) for page number (\\d+)$")
	public void customer_validates_the_items_per_page_to_be_for_page_number(int arg1, int arg2) throws Throwable {
		boolean result = false;
		
		Map<String, Object> serviceResponseMap = null;
		boolean isValidationSuccessful = false;
		
		int perPage = arg1;
		int page = arg2;
		
		try {	
			
			if(gitSearchPaginationLibrary == null) {
				gitSearchPaginationLibrary = new GitSearchPaginationLibrary();
			}
			
			serviceResponseMap = (Map<String, Object>) testContext.scenarioContext.getContext(Context.SERVICE_RESPONSE_MAP);

			isValidationSuccessful =  gitSearchPaginationLibrary.customer_validates_the_items_per_page_for_a_given_page_number(serviceResponseMap, perPage, page);
			
			if(isValidationSuccessful) {
				result = true;
			} else {
				result = false;
				throw new Exception("There is a problem with validating the items count per page \n");
			}
			
			Assert.assertTrue(result);
			
		} catch (Exception e) {
			Assert.assertTrue(e.getMessage(), result);
		}

	}
	
	@Then("^Customer validates the search results sortorder \"([^\"]*)\" for a given filter \"([^\"]*)\"$")
	public void customer_validates_the_search_results_sortorder_for_a_given_filter(String arg1, String arg2) throws Throwable {
		boolean result = false;
		
		Map<String, Object> serviceResponseMap = null;
		boolean isValidationSuccessful = false;
		
		String sortorder = arg1;
		String sort = arg2;
		
		try {	
			
			if(gitSearchPaginationLibrary == null) {
				gitSearchPaginationLibrary = new GitSearchPaginationLibrary();
			}
			
			serviceResponseMap = (Map<String, Object>) testContext.scenarioContext.getContext(Context.SERVICE_RESPONSE_MAP);

			isValidationSuccessful =  gitSearchPaginationLibrary.customer_validates_the_search_results_sortorder_for_a_given_filter(serviceResponseMap, sortorder, sort);
			
			if(isValidationSuccessful) {
				result = true;
			} else {
				result = false;
				throw new Exception("There is a problem with validating the sort-order for a given sort \n");
			}
			
			Assert.assertTrue(result);
			
		} catch (Exception e) {
			Assert.assertTrue(e.getMessage(), result);
		}

	}
}
