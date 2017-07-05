//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.07.05 às 11:15:08 AM BRT 
//


package localhost.authazws.risk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="riskAssessment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="advice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="outputDeviceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="matchedRuleMnemonic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ruleAnnotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="userContext">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="riskFortSuccess">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="successMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "riskAssessment",
    "riskFortSuccess"
})
@XmlRootElement(name = "EvaluateRiskResponse")
public class EvaluateRiskResponse {

    @XmlElement(required = true)
    protected EvaluateRiskResponse.RiskAssessment riskAssessment;
    @XmlElement(required = true)
    protected EvaluateRiskResponse.RiskFortSuccess riskFortSuccess;

    /**
     * Obtém o valor da propriedade riskAssessment.
     * 
     * @return
     *     possible object is
     *     {@link EvaluateRiskResponse.RiskAssessment }
     *     
     */
    public EvaluateRiskResponse.RiskAssessment getRiskAssessment() {
        return riskAssessment;
    }

    /**
     * Define o valor da propriedade riskAssessment.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluateRiskResponse.RiskAssessment }
     *     
     */
    public void setRiskAssessment(EvaluateRiskResponse.RiskAssessment value) {
        this.riskAssessment = value;
    }

    /**
     * Obtém o valor da propriedade riskFortSuccess.
     * 
     * @return
     *     possible object is
     *     {@link EvaluateRiskResponse.RiskFortSuccess }
     *     
     */
    public EvaluateRiskResponse.RiskFortSuccess getRiskFortSuccess() {
        return riskFortSuccess;
    }

    /**
     * Define o valor da propriedade riskFortSuccess.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluateRiskResponse.RiskFortSuccess }
     *     
     */
    public void setRiskFortSuccess(EvaluateRiskResponse.RiskFortSuccess value) {
        this.riskFortSuccess = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="advice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="outputDeviceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="matchedRuleMnemonic" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ruleAnnotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="userContext">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "advice",
        "outputDeviceID",
        "score",
        "matchedRuleMnemonic",
        "ruleAnnotation",
        "transactionID",
        "userContext"
    })
    public static class RiskAssessment {

        @XmlElement(required = true)
        protected String advice;
        @XmlElement(required = true)
        protected String outputDeviceID;
        protected byte score;
        @XmlElement(required = true)
        protected String matchedRuleMnemonic;
        @XmlElement(required = true)
        protected String ruleAnnotation;
        @XmlElement(required = true)
        protected String transactionID;
        @XmlElement(required = true)
        protected EvaluateRiskResponse.RiskAssessment.UserContext userContext;

        /**
         * Obtém o valor da propriedade advice.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdvice() {
            return advice;
        }

        /**
         * Define o valor da propriedade advice.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdvice(String value) {
            this.advice = value;
        }

        /**
         * Obtém o valor da propriedade outputDeviceID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutputDeviceID() {
            return outputDeviceID;
        }

        /**
         * Define o valor da propriedade outputDeviceID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutputDeviceID(String value) {
            this.outputDeviceID = value;
        }

        /**
         * Obtém o valor da propriedade score.
         * 
         */
        public byte getScore() {
            return score;
        }

        /**
         * Define o valor da propriedade score.
         * 
         */
        public void setScore(byte value) {
            this.score = value;
        }

        /**
         * Obtém o valor da propriedade matchedRuleMnemonic.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMatchedRuleMnemonic() {
            return matchedRuleMnemonic;
        }

        /**
         * Define o valor da propriedade matchedRuleMnemonic.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMatchedRuleMnemonic(String value) {
            this.matchedRuleMnemonic = value;
        }

        /**
         * Obtém o valor da propriedade ruleAnnotation.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuleAnnotation() {
            return ruleAnnotation;
        }

        /**
         * Define o valor da propriedade ruleAnnotation.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuleAnnotation(String value) {
            this.ruleAnnotation = value;
        }

        /**
         * Obtém o valor da propriedade transactionID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionID() {
            return transactionID;
        }

        /**
         * Define o valor da propriedade transactionID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionID(String value) {
            this.transactionID = value;
        }

        /**
         * Obtém o valor da propriedade userContext.
         * 
         * @return
         *     possible object is
         *     {@link EvaluateRiskResponse.RiskAssessment.UserContext }
         *     
         */
        public EvaluateRiskResponse.RiskAssessment.UserContext getUserContext() {
            return userContext;
        }

        /**
         * Define o valor da propriedade userContext.
         * 
         * @param value
         *     allowed object is
         *     {@link EvaluateRiskResponse.RiskAssessment.UserContext }
         *     
         */
        public void setUserContext(EvaluateRiskResponse.RiskAssessment.UserContext value) {
            this.userContext = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "orgName",
            "userName"
        })
        public static class UserContext {

            @XmlElement(required = true)
            protected String orgName;
            @XmlElement(required = true)
            protected String userName;

            /**
             * Obtém o valor da propriedade orgName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrgName() {
                return orgName;
            }

            /**
             * Define o valor da propriedade orgName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrgName(String value) {
                this.orgName = value;
            }

            /**
             * Obtém o valor da propriedade userName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUserName() {
                return userName;
            }

            /**
             * Define o valor da propriedade userName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUserName(String value) {
                this.userName = value;
            }

        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="successMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "successMessage"
    })
    public static class RiskFortSuccess {

        @XmlElement(required = true)
        protected String successMessage;

        /**
         * Obtém o valor da propriedade successMessage.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuccessMessage() {
            return successMessage;
        }

        /**
         * Define o valor da propriedade successMessage.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuccessMessage(String value) {
            this.successMessage = value;
        }

    }

}
