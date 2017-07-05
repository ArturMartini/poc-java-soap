//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.07.05 às 11:15:08 AM BRT 
//


package localhost.authazws.risk;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localhost.authazws.risk package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localhost.authazws.risk
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EvaluateRiskResponse }
     * 
     */
    public EvaluateRiskResponse createEvaluateRiskResponse() {
        return new EvaluateRiskResponse();
    }

    /**
     * Create an instance of {@link EvaluateRiskResponse.RiskAssessment }
     * 
     */
    public EvaluateRiskResponse.RiskAssessment createEvaluateRiskResponseRiskAssessment() {
        return new EvaluateRiskResponse.RiskAssessment();
    }

    /**
     * Create an instance of {@link EvaluateRiskResponse.RiskFortSuccess }
     * 
     */
    public EvaluateRiskResponse.RiskFortSuccess createEvaluateRiskResponseRiskFortSuccess() {
        return new EvaluateRiskResponse.RiskFortSuccess();
    }

    /**
     * Create an instance of {@link EvaluateRiskResponse.RiskAssessment.UserContext }
     * 
     */
    public EvaluateRiskResponse.RiskAssessment.UserContext createEvaluateRiskResponseRiskAssessmentUserContext() {
        return new EvaluateRiskResponse.RiskAssessment.UserContext();
    }

}
