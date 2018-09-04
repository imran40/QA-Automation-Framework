package com.testing.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.testing.framework.cucumber.CommonLibrary;

/**
 * @copyrights Imran Aslam
*/
public class GitSearchPaginationLibrary {

	private int results_testing_threshold = 3;
	
	private String fileNameAndPath = "rest_services_templates/search_pagination.vm";

	/** 
	  * @author Imran Aslam
	*/
	public Map<String, Object> customer_searches_results_with_pagination(String userName, int perPage, int page,
			String sort, String sortorder) {

		String serviceRequest = null;
		Map<String, Object> serviceResponseMap = null;
		Map<String, String> map = null;
		Integer responseStatusCode = null;

		try {

			{
				map = new HashMap<String, String>();
				map.put("user", userName);
				map.put("page", Integer.toString(page));
				map.put("perPage", Integer.toString(perPage));
				map.put("sort", sort);
				map.put("sortorder", sortorder);
			}

			serviceRequest = CommonLibrary.getVMServiceRequest(map, fileNameAndPath);
			serviceResponseMap = CommonLibrary.sendGETRequest(serviceRequest);
			responseStatusCode = (Integer) serviceResponseMap.get("responseStatusCode");

			if (responseStatusCode != null && !responseStatusCode.equals(200)) {
				serviceResponseMap = null;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return serviceResponseMap;
	}
	
	/** 
	  * @author Imran Aslam
	*/
	public boolean customer_validates_the_items_per_page_for_a_given_page_number(Map<String, Object> serviceResponseMap, int perPage, int page) {
		JSONObject jsonObj = null;
		boolean isValidationSuccessful = false;

		try {

			jsonObj = (JSONObject) serviceResponseMap.get("jsonResponseObj");
			JSONArray users = (JSONArray) jsonObj.getJSONArray("items");
			
			if(users.length() == perPage) {
				isValidationSuccessful = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isValidationSuccessful;
	}
	
	/** 
	  * @author Imran Aslam
	*/
	public boolean customer_validates_the_search_results_sortorder_for_a_given_filter(Map<String, Object> serviceResponseMap, String sortorder, String sort) {
		JSONObject jsonObj = null;
		String user_url = null;
		int user_followers_count = 0;
		boolean isValidationSuccessful = false;
		List<Integer> user_followers_count_list = null;

		try {

			jsonObj = (JSONObject) serviceResponseMap.get("jsonResponseObj");
			JSONArray users = (JSONArray) jsonObj.getJSONArray("items");
			
			for (int i = 0; (i < users.length()) && (i < results_testing_threshold); i++) {
				JSONObject jsonUserObj = users.getJSONObject(i);
				user_url = jsonUserObj.getString("url");
				JSONObject jsonUserDetailObj = (JSONObject) CommonLibrary.sendGETRequest(user_url).get("jsonResponseObj");
				
				user_followers_count = jsonUserDetailObj.getInt("followers");

				if(user_followers_count_list == null) {
					user_followers_count_list = new ArrayList<Integer>();
				}
				user_followers_count_list.add(Integer.valueOf(user_followers_count));
			}
			
			if(sortorder.equalsIgnoreCase("desc")) {
				isValidationSuccessful = checkforDescendingOrder(user_followers_count_list);
			} else if(sortorder.equalsIgnoreCase("asc")) {
				isValidationSuccessful = checkforAscendingOrder(user_followers_count_list);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isValidationSuccessful;
	}
	
	/** 
	  * @author Imran Aslam
	*/
	private boolean checkforDescendingOrder(List<Integer> list_to_be_validated) {
		boolean isValidationSuccessful = true;

		try {
			
			for(int i=0; i<list_to_be_validated.size(); i++) {
				if(i+1 < list_to_be_validated.size()) {
				    if (list_to_be_validated.get(i) < list_to_be_validated.get(i+1)) {
				    	isValidationSuccessful = false;
				    	break;
				    }
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isValidationSuccessful;
	}
	
	/** 
	  * @author Imran Aslam
	*/
	private boolean checkforAscendingOrder(List<Integer> list_to_be_validated) {
		boolean isValidationSuccessful = true;

		try {
			
			for(int i=0; i<list_to_be_validated.size(); i++) {
				if(i+1 < list_to_be_validated.size()) {
				    if (list_to_be_validated.get(i) > list_to_be_validated.get(i+1)) {
				    	isValidationSuccessful = false;
				    	break;
				    }
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isValidationSuccessful;
	}
	
	
	
}
