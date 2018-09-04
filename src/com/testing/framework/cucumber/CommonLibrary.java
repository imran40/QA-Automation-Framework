package com.testing.framework.cucumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @copyrights Imran Aslam
*/
public class CommonLibrary {

	
	/** Method to get rest API request from VM Template 
	  * @author Imran Aslam
	*/
	public static String getVMServiceRequest(Map<String, String> map, String filePath) {
		String serviceRequest = null;
		StringWriter stringWriter = null;
		VelocityEngine velocityEngine = null;
		VelocityContext velocityContext = null;
		Template velocityTemplate = null;

		try {
			if (map == null)
				return null;

			velocityEngine = new VelocityEngine();
			velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
			velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
			velocityEngine.init();
			
			velocityContext = new VelocityContext();
			Iterator<String> it = map.keySet().iterator();
			while (it.hasNext()) {
				String name = (String) (it.next());
				Object value = map.get(name);
				velocityContext.put(name, value);
			}

			velocityTemplate = velocityEngine.getTemplate(filePath);
			
			stringWriter = new StringWriter();
			velocityTemplate.merge(velocityContext, stringWriter);

			serviceRequest = stringWriter.toString();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Uncomment to print for troubleshooting
			//System.out.println(serviceRequest);
		}

		return serviceRequest;

	}

	/** Method to make a rest service request 
	  * @author Imran Aslam
	*/
	public static Map<String, Object> sendGETRequest(String requestStr) {

		Map<String, Object> responseMap = null;
		JSONObject jsonObj = null;
		JSONArray jsonArray = null;
		String USER_AGENT = "";

		try {
			responseMap = new HashMap<String, Object>();

			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(requestStr);

			// add request header
			request.addHeader("User-Agent", USER_AGENT);

			HttpResponse response = client.execute(request);

			responseMap.put("responseStatusCode", Integer.valueOf(response.getStatusLine().getStatusCode()));

			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

			StringBuffer jsonResponse = new StringBuffer();
			String line = "";

			while ((line = rd.readLine()) != null) {
				jsonResponse.append(line);
			}

			String responseStr = jsonResponse.toString();

			System.out.println("Request: " + requestStr);
			System.out.println("Response: " + responseStr + "\n\n");
			
			if(StringUtils.substring(responseStr, 0, 1).equals("[")) {
				jsonArray = new JSONArray(responseStr);
				responseMap.put("jsonResponseObj", jsonArray);
			} else {
				jsonObj = new JSONObject(responseStr);
				responseMap.put("jsonResponseObj", jsonObj);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Uncomment to print for troubleshooting
			//System.out.println(jsonObj.toString());
		}

		return responseMap;

	}

}
