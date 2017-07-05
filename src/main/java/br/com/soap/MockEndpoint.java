package br.com.soap;

import java.util.Random;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import localhost.authazws.auth.Return;

@Endpoint
public class MockEndpoint {
	
	private static final String REQUEST_URI = "http://localhost/authazws/auth";

	@PayloadRoot(namespace = REQUEST_URI, localPart = "login")
	@ResponsePayload
	public Return login() {
		
			
		Return response = new Return();
		response.setMessage("Authentication Successful");
		response.setResultCode("LOGIN_SUCCESS");
		response.setSessionToken("sessionToken");
		
		Random r = new Random();
		int num = r.nextInt(999999999);
		
		response.setSessionToken(num + "");
		
		return response;
	}
	

}
