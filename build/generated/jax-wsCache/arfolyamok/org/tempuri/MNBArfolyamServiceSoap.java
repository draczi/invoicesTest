
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MNBArfolyamServiceSoap", targetNamespace = "http://www.mnb.hu/webservices/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    hu.mnb.webservices.ObjectFactory.class
})
public interface MNBArfolyamServiceSoap {


    /**
     * 
     * @return
     *     returns java.lang.String
     * @throws MNBArfolyamServiceSoapGetCurrenciesStringFaultFaultMessage
     */
    @WebMethod(operationName = "GetCurrencies", action = "http://www.mnb.hu/webservices/MNBArfolyamServiceSoap/GetCurrencies")
    @WebResult(name = "GetCurrenciesResult", targetNamespace = "http://www.mnb.hu/webservices/")
    @RequestWrapper(localName = "GetCurrencies", targetNamespace = "http://www.mnb.hu/webservices/", className = "hu.mnb.webservices.GetCurrenciesRequestBody")
    @ResponseWrapper(localName = "GetCurrenciesResponse", targetNamespace = "http://www.mnb.hu/webservices/", className = "hu.mnb.webservices.GetCurrenciesResponseBody")
    public String getCurrencies()
        throws MNBArfolyamServiceSoapGetCurrenciesStringFaultFaultMessage
    ;

    /**
     * 
     * @param currencyNames
     * @return
     *     returns java.lang.String
     * @throws MNBArfolyamServiceSoapGetCurrencyUnitsStringFaultFaultMessage
     */
    @WebMethod(operationName = "GetCurrencyUnits", action = "http://www.mnb.hu/webservices/MNBArfolyamServiceSoap/GetCurrencyUnits")
    @WebResult(name = "GetCurrencyUnitsResult", targetNamespace = "http://www.mnb.hu/webservices/")
    @RequestWrapper(localName = "GetCurrencyUnits", targetNamespace = "http://www.mnb.hu/webservices/", className = "hu.mnb.webservices.GetCurrencyUnitsRequestBody")
    @ResponseWrapper(localName = "GetCurrencyUnitsResponse", targetNamespace = "http://www.mnb.hu/webservices/", className = "hu.mnb.webservices.GetCurrencyUnitsResponseBody")
    public String getCurrencyUnits(
        @WebParam(name = "currencyNames", targetNamespace = "http://www.mnb.hu/webservices/")
        String currencyNames)
        throws MNBArfolyamServiceSoapGetCurrencyUnitsStringFaultFaultMessage
    ;

    /**
     * 
     * @return
     *     returns java.lang.String
     * @throws MNBArfolyamServiceSoapGetCurrentExchangeRatesStringFaultFaultMessage
     */
    @WebMethod(operationName = "GetCurrentExchangeRates", action = "http://www.mnb.hu/webservices/MNBArfolyamServiceSoap/GetCurrentExchangeRates")
    @WebResult(name = "GetCurrentExchangeRatesResult", targetNamespace = "http://www.mnb.hu/webservices/")
    @RequestWrapper(localName = "GetCurrentExchangeRates", targetNamespace = "http://www.mnb.hu/webservices/", className = "hu.mnb.webservices.GetCurrentExchangeRatesRequestBody")
    @ResponseWrapper(localName = "GetCurrentExchangeRatesResponse", targetNamespace = "http://www.mnb.hu/webservices/", className = "hu.mnb.webservices.GetCurrentExchangeRatesResponseBody")
    public String getCurrentExchangeRates()
        throws MNBArfolyamServiceSoapGetCurrentExchangeRatesStringFaultFaultMessage
    ;

    /**
     * 
     * @return
     *     returns java.lang.String
     * @throws MNBArfolyamServiceSoapGetDateIntervalStringFaultFaultMessage
     */
    @WebMethod(operationName = "GetDateInterval", action = "http://www.mnb.hu/webservices/MNBArfolyamServiceSoap/GetDateInterval")
    @WebResult(name = "GetDateIntervalResult", targetNamespace = "http://www.mnb.hu/webservices/")
    @RequestWrapper(localName = "GetDateInterval", targetNamespace = "http://www.mnb.hu/webservices/", className = "hu.mnb.webservices.GetDateIntervalRequestBody")
    @ResponseWrapper(localName = "GetDateIntervalResponse", targetNamespace = "http://www.mnb.hu/webservices/", className = "hu.mnb.webservices.GetDateIntervalResponseBody")
    public String getDateInterval()
        throws MNBArfolyamServiceSoapGetDateIntervalStringFaultFaultMessage
    ;

    /**
     * 
     * @param currencyNames
     * @param endDate
     * @param startDate
     * @return
     *     returns java.lang.String
     * @throws MNBArfolyamServiceSoapGetExchangeRatesStringFaultFaultMessage
     */
    @WebMethod(operationName = "GetExchangeRates", action = "http://www.mnb.hu/webservices/MNBArfolyamServiceSoap/GetExchangeRates")
    @WebResult(name = "GetExchangeRatesResult", targetNamespace = "http://www.mnb.hu/webservices/")
    @RequestWrapper(localName = "GetExchangeRates", targetNamespace = "http://www.mnb.hu/webservices/", className = "hu.mnb.webservices.GetExchangeRatesRequestBody")
    @ResponseWrapper(localName = "GetExchangeRatesResponse", targetNamespace = "http://www.mnb.hu/webservices/", className = "hu.mnb.webservices.GetExchangeRatesResponseBody")
    public String getExchangeRates(
        @WebParam(name = "startDate", targetNamespace = "http://www.mnb.hu/webservices/")
        String startDate,
        @WebParam(name = "endDate", targetNamespace = "http://www.mnb.hu/webservices/")
        String endDate,
        @WebParam(name = "currencyNames", targetNamespace = "http://www.mnb.hu/webservices/")
        String currencyNames)
        throws MNBArfolyamServiceSoapGetExchangeRatesStringFaultFaultMessage
    ;

    /**
     * 
     * @return
     *     returns java.lang.String
     * @throws MNBArfolyamServiceSoapGetInfoStringFaultFaultMessage
     */
    @WebMethod(operationName = "GetInfo", action = "http://www.mnb.hu/webservices/MNBArfolyamServiceSoap/GetInfo")
    @WebResult(name = "GetInfoResult", targetNamespace = "http://www.mnb.hu/webservices/")
    @RequestWrapper(localName = "GetInfo", targetNamespace = "http://www.mnb.hu/webservices/", className = "hu.mnb.webservices.GetInfoRequestBody")
    @ResponseWrapper(localName = "GetInfoResponse", targetNamespace = "http://www.mnb.hu/webservices/", className = "hu.mnb.webservices.GetInfoResponseBody")
    public String getInfo()
        throws MNBArfolyamServiceSoapGetInfoStringFaultFaultMessage
    ;

}
