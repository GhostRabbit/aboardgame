package com.aboardgame.server;

import com.aboardgame.client.GreetingService;
import com.aboardgame.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {

	public String greetServer(String input) throws IllegalArgumentException {
		// Verify that the input is valid. 
		if (!FieldVerifier.isValidGuess(input)) {
			// If the input is not valid, throw an IllegalArgumentException back to
			// the client.
//			throw new IllegalArgumentException(
//					"Please enter a number between 0 and 9");
		}

		String serverInfo = getServletContext().getServerInfo();
		String userAgent = getThreadLocalRequest().getHeader("User-Agent");

		// Escape data from the client to avoid cross-site script vulnerabilities.
		input = escapeHtml(input);
		userAgent = escapeHtml(userAgent);
		
		return numberGuess(Integer.parseInt(input));
//		return "Hello, " + input + "!<br><br>I am running " + serverInfo
//				+ ".<br><br>It looks like you are using:<br>" + userAgent;
	}

	private String numberGuess(int guess) {
		int correct = 3;
		String answer;
		if (guess == correct) {
			answer = "Correct!";
		} else if (guess > correct) {
			answer = "Too high";
		} else {
			answer = "Too low";
		}
		return answer;
	}

	/**
	 * Escape an html string. Escaping data received from the client helps to
	 * prevent cross-site script vulnerabilities.
	 * 
	 * @param html the html string to escape
	 * @return the escaped string
	 */
	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;");
	}
}
