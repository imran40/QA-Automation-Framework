package com.testing.framework;

import java.util.ArrayList;
import java.util.List;

import cucumber.runtime.ClassFinder;
import cucumber.runtime.Runtime;
import cucumber.runtime.RuntimeOptions;
import cucumber.runtime.io.MultiLoader;
import cucumber.runtime.io.ResourceLoader;
import cucumber.runtime.io.ResourceLoaderClassFinder;

/**
 * @copyrights Imran Aslam
*/
public class TestRunner {

	static List<String> command = null;

	/**
	  * @author Imran Aslam
	*/
	public static void main(String[] args) {

		command = new ArrayList<String>();
		command.add("--glue");
		command.add("com/testing/stepdefinitions");
		command.add("src/com/testing\\features\\webservices");
		command.add("--plugin");
		command.add("html:report/html");
		command.add("--plugin");
		command.add("json:report/json/cucumber-report.json");
		command.add("--tags");
		command.add(args[0]);
		command.add("--strict");

		run();

	}

	/** Method to execute Cucumber command
	  * @author Imran Aslam
	*/
	public static void run() {
		RuntimeOptions runtimeOptions = null;
		ClassLoader classLoader = null;
		ResourceLoader resourceLoader = null;
		ClassFinder classFinder = null;
		Runtime runtime = null;
		
		try {
			runtimeOptions = new RuntimeOptions(command);
			classLoader = Thread.currentThread().getContextClassLoader();
			resourceLoader = new MultiLoader(classLoader);
			classFinder = new ResourceLoaderClassFinder(resourceLoader, classLoader);
			runtime = new Runtime(resourceLoader, classFinder, classLoader, runtimeOptions);
			runtime.run();
			runtime.exitStatus();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
