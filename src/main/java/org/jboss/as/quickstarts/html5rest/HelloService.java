
package org.jboss.as.quickstarts.html5rest;

import java.util.Map;

public class HelloService {

	String getEnvironmentVar() {
		Map<String, String> env = System.getenv();
		String result= "";
		for (String envName : env.keySet()) {
			result += String.format("%s=%s%n", envName, env.get(envName));
		}
		
		return result;
	}
}