package br.com.soap;

import java.util.Random;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import localhost.authazws.risk.EvaluateRiskResponse;
import localhost.authazws.risk.EvaluateRiskResponse.RiskAssessment;
import localhost.authazws.risk.EvaluateRiskResponse.RiskAssessment.UserContext;
import localhost.authazws.risk.EvaluateRiskResponse.RiskFortSuccess;

@Endpoint
public class MockRiskEndpoint {

	private static final String RISK_URI = "http://localhost/authazws/risk";
	
	@PayloadRoot(namespace = RISK_URI, localPart = "risk")
	@ResponsePayload
	public EvaluateRiskResponse getMockRisk() {
		
		EvaluateRiskResponse response = new EvaluateRiskResponse();
		response.setRiskAssessment(new RiskAssessment());
		response.getRiskAssessment().setUserContext(new UserContext());
		
		response.getRiskAssessment().setAdvice("Advice");
		response.getRiskAssessment().setOutputDeviceID("OutputDeviceID");
		response.getRiskAssessment().setTransactionID("TransactionID");
		response.getRiskAssessment().getUserContext().setUserName("UserName");
		response.getRiskAssessment().getUserContext().setOrgName("OrgName");
		response.getRiskAssessment().setRuleAnnotation("UNKNOWNDEVICEID");
		response.getRiskAssessment().setScore((byte) 65);
		response.getRiskAssessment().setRuleAnnotation("UNKNOWNUSER=N;EXCEPTION=N;MFPMISMATCH=Y;TRUSTEDIP=N;UNTRUSTEDIP=N;USERVELOCITY=N;UNKNOWNDEVICEID=Y;DEVICEVELOCITY=N;USERDEVICENOTASSOCIATED=Y;");
		
		Random r = new Random();
		int num = r.nextInt(999999999);
		
		response.setRiskFortSuccess(new RiskFortSuccess());
		response.getRiskFortSuccess().setSuccessMessage("The operation was successful. " + num);
		
		return response;
	}

}
