package com.testing.library;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.testing.framework.cucumber.CommonLibrary;

/**
 * @copyrights Imran Aslam
*/
public class GitUserServicesLibrary {

	private static int users_testing_threshold = 2;
	
	/** 
	  * @author Imran Aslam
	*/
	public Map<String, Object> customer_searches_for_users_with_username_who_have_repositories_and_followers (
			String userName, String repos_more_or_less, int repos_count, String followers_more_or_less,
			int followers_count) {

		String serviceRequest = null;
		Map<String, Object> serviceResponseMap = null;
		Map<String, String> map = null;
		Integer responseStatusCode = null;

		String fileNameAndPath = "rest_services_templates/users_with_repositories_and_followers.vm";
		
		try {

			if (repos_more_or_less != null && followers_more_or_less != null) {
				
				{
					map = new HashMap<String, String>();
					map.put("user", userName);
					if(repos_more_or_less != null) {
						if(repos_more_or_less.equalsIgnoreCase("greater")) {
							map.put("repos_more_or_less", "%3E");
						} else {
							map.put("repos_more_or_less", "%3C");
						}
					}
					map.put("repos_count", Integer.toString(repos_count));
					if(followers_more_or_less != null) {
						if(followers_more_or_less.equalsIgnoreCase("greater")) {
							map.put("followers_more_or_less", "%3E");
						} else {
							map.put("followers_more_or_less", "%3C");
						}
					}
					map.put("followers_count", Integer.toString(followers_count));
				}
				
				serviceRequest = CommonLibrary.getVMServiceRequest(map, fileNameAndPath);

				serviceResponseMap = CommonLibrary.sendGETRequest(serviceRequest);

				responseStatusCode = (Integer) serviceResponseMap.get("responseStatusCode");

				if (responseStatusCode != null && !responseStatusCode.equals(200)) {
					serviceResponseMap = null;
				}

			}


		} catch (Exception e) {
			e.printStackTrace();
		}

		return serviceResponseMap;
	}

	/** 
	  * @author Imran Aslam
	*/
	public boolean customer_validates_search_results_with_respositories_and_followers( Map<String, Object> serviceResponseMap, String userName, String repos_greater_or_less, int repos_count, String followers_greater_or_less, int followers_count) {
		JSONObject jsonObj = null;
		boolean isRepositoriesCountValidationSuccessful = false;
		boolean isFollowerCountValidationSuccessful = false;
		boolean isValidationSuccessful = false;

		try {

			jsonObj = (JSONObject) serviceResponseMap.get("jsonResponseObj");

			if (repos_greater_or_less != null && followers_greater_or_less != null) {
				isRepositoriesCountValidationSuccessful = reposistories_count_validation(jsonObj, repos_greater_or_less, repos_count);
				isFollowerCountValidationSuccessful = followers_count_validation(jsonObj, followers_greater_or_less, followers_count);
			}

			if(isRepositoriesCountValidationSuccessful == true && isFollowerCountValidationSuccessful == true) {
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
	public Map<String, Object> customer_searches_for_users_with_username_who_have_repositories (String userName, String repos_more_or_less, int repos_count) {

		String serviceRequest = null;
		Map<String, Object> serviceResponseMap = null;
		Map<String, String> map = null;
		Integer responseStatusCode = null;

		String fileNameAndPath = "rest_services_templates/users_with_repositories.vm";
		
		try {

			if (repos_more_or_less != null) {
				
				{
					map = new HashMap<String, String>();
					map.put("user", userName);
					if(repos_more_or_less != null) {
						if(repos_more_or_less.equalsIgnoreCase("greater")) {
							map.put("repos_more_or_less", "%3E");
						} else {
							map.put("repos_more_or_less", "%3C");
						}
					}
					map.put("repos_count", Integer.toString(repos_count));
				}
				
				serviceRequest = CommonLibrary.getVMServiceRequest(map, fileNameAndPath);

				serviceResponseMap = CommonLibrary.sendGETRequest(serviceRequest);

				responseStatusCode = (Integer) serviceResponseMap.get("responseStatusCode");

				if (responseStatusCode != null && !responseStatusCode.equals(200)) {
					serviceResponseMap = null;
				}

			}


		} catch (Exception e) {
			e.printStackTrace();
		}

		return serviceResponseMap;
	}

	/** 
	  * @author Imran Aslam
	*/
	public boolean customer_validates_search_results_with_respositories ( Map<String, Object> serviceResponseMap, String userName, String repos_greater_or_less, int repos_count) {
		JSONObject jsonObj = null;
		boolean isValidationSuccessful = false;

		try {

			jsonObj = (JSONObject) serviceResponseMap.get("jsonResponseObj");

			if (repos_greater_or_less != null) {
				isValidationSuccessful = reposistories_count_validation(jsonObj, repos_greater_or_less, repos_count);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isValidationSuccessful;
	}
	
	/** 
	  * @author Imran Aslam
	*/
	public Map<String, Object> customer_searches_for_users_with_username_who_have_followers (String userName, String followers_more_or_less, int followers_count) {

		String serviceRequest = null;
		Map<String, Object> serviceResponseMap = null;
		Map<String, String> map = null;
		Integer responseStatusCode = null;

		String fileNameAndPath = "rest_services_templates/users_with_followers.vm";
		
		try {

			if (followers_more_or_less != null) {
				
				{
					map = new HashMap<String, String>();
					map.put("user", userName);
					if(followers_more_or_less != null) {
						if(followers_more_or_less.equalsIgnoreCase("greater")) {
							map.put("followers_more_or_less", "%3E");
						} else {
							map.put("followers_more_or_less", "%3C");
						}
					}
					map.put("followers_count", Integer.toString(followers_count));
				}
				
				serviceRequest = CommonLibrary.getVMServiceRequest(map, fileNameAndPath);

				serviceResponseMap = CommonLibrary.sendGETRequest(serviceRequest);

				responseStatusCode = (Integer) serviceResponseMap.get("responseStatusCode");

				if (responseStatusCode != null && !responseStatusCode.equals(200)) {
					serviceResponseMap = null;
				}

			}


		} catch (Exception e) {
			e.printStackTrace();
		}

		return serviceResponseMap;
	}

	/** 
	  * @author Imran Aslam
	*/
	public boolean customer_validates_search_results_with_followers( Map<String, Object> serviceResponseMap, String userName, String followers_greater_or_less, int followers_count) {
		JSONObject jsonObj = null;
		boolean isValidationSuccessful = false;

		try {

			jsonObj = (JSONObject) serviceResponseMap.get("jsonResponseObj");

			if (followers_greater_or_less != null) {
				isValidationSuccessful = followers_count_validation(jsonObj, followers_greater_or_less, followers_count);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isValidationSuccessful;
	}
	
	/** 
	  * @author Imran Aslam
	*/
	private boolean reposistories_count_validation(JSONObject jsonObj, String repos_more_or_less, int repos_count) {
		boolean isRepositoriesCountValidationSuccessful = false;
		String user_url = null;
		int user_public_repos_count = 0;

		try {
			JSONArray users = (JSONArray) jsonObj.getJSONArray("items");

			for (int i = 0; (i < users.length()) && (i < GitUserServicesLibrary.users_testing_threshold); i++) {
				JSONObject jsonUserObj = users.getJSONObject(i);
				user_url = jsonUserObj.getString("url");
				JSONObject jsonUserDetailObj = (JSONObject) CommonLibrary.sendGETRequest(user_url).get("jsonResponseObj");
				
				user_public_repos_count = jsonUserDetailObj.getInt("public_repos");
				
				if(repos_more_or_less.equalsIgnoreCase("greater") && user_public_repos_count > repos_count) {
					isRepositoriesCountValidationSuccessful = true;
				} else if (repos_more_or_less.equalsIgnoreCase("less") && user_public_repos_count < repos_count) {
					isRepositoriesCountValidationSuccessful = true;
				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return isRepositoriesCountValidationSuccessful;
	}

	/** 
	  * @author Imran Aslam
	*/
	private boolean followers_count_validation(JSONObject jsonObj, String followers_more_or_less, int followers_count) {
		boolean isFollowerCountValidationSuccessful = false;
		String user_url = null;
		int user_followers_count = 0;

		try {
			JSONArray users = (JSONArray) jsonObj.getJSONArray("items");

			for (int i = 0; (i < users.length()) && (i < GitUserServicesLibrary.users_testing_threshold); i++) {
				JSONObject jsonUserObj = users.getJSONObject(i);
				user_url = jsonUserObj.getString("url");
				JSONObject jsonUserDetailObj = (JSONObject) CommonLibrary.sendGETRequest(user_url).get("jsonResponseObj");
				
				user_followers_count = jsonUserDetailObj.getInt("followers");

				if(followers_more_or_less.equalsIgnoreCase("greater") && user_followers_count > followers_count) {
					isFollowerCountValidationSuccessful = true;
				} else if (followers_more_or_less.equalsIgnoreCase("less") && user_followers_count < followers_count) {
					isFollowerCountValidationSuccessful = true;
				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return isFollowerCountValidationSuccessful;
	}
}
