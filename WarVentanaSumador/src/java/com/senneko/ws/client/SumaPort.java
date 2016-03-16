
package com.senneko.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SumaPort", targetNamespace = "http://main.ws.senneko.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SumaPort {


    /**
     * 
     * @param parametroB
     * @param parametroA
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sumar", targetNamespace = "http://main.ws.senneko.com/", className = "com.senneko.ws.client.Sumar")
    @ResponseWrapper(localName = "sumarResponse", targetNamespace = "http://main.ws.senneko.com/", className = "com.senneko.ws.client.SumarResponse")
    public String sumar(
        @WebParam(name = "parametro_a", targetNamespace = "")
        int parametroA,
        @WebParam(name = "parametro_b", targetNamespace = "")
        int parametroB);

}