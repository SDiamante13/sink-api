
package tech.pathtoprogramming.soapy_sinq;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SinqServicePortService", targetNamespace = "http://pathToProgramming.tech/soapy-sinq", wsdlLocation = "http://localhost:8091/ws/sink.wsdl")
public class SinqServicePortService
    extends Service
{

    private final static URL SINQSERVICEPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException SINQSERVICEPORTSERVICE_EXCEPTION;
    private final static QName SINQSERVICEPORTSERVICE_QNAME = new QName("http://pathToProgramming.tech/soapy-sinq", "SinqServicePortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8091/ws/sink.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SINQSERVICEPORTSERVICE_WSDL_LOCATION = url;
        SINQSERVICEPORTSERVICE_EXCEPTION = e;
    }

    public SinqServicePortService() {
        super(__getWsdlLocation(), SINQSERVICEPORTSERVICE_QNAME);
    }

    public SinqServicePortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SINQSERVICEPORTSERVICE_QNAME, features);
    }

    public SinqServicePortService(URL wsdlLocation) {
        super(wsdlLocation, SINQSERVICEPORTSERVICE_QNAME);
    }

    public SinqServicePortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SINQSERVICEPORTSERVICE_QNAME, features);
    }

    public SinqServicePortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SinqServicePortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SinqServicePort
     */
    @WebEndpoint(name = "SinqServicePortSoap11")
    public SinqServicePort getSinqServicePortSoap11() {
        return super.getPort(new QName("http://pathToProgramming.tech/soapy-sinq", "SinqServicePortSoap11"), SinqServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SinqServicePort
     */
    @WebEndpoint(name = "SinqServicePortSoap11")
    public SinqServicePort getSinqServicePortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://pathToProgramming.tech/soapy-sinq", "SinqServicePortSoap11"), SinqServicePort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SINQSERVICEPORTSERVICE_EXCEPTION!= null) {
            throw SINQSERVICEPORTSERVICE_EXCEPTION;
        }
        return SINQSERVICEPORTSERVICE_WSDL_LOCATION;
    }

}
