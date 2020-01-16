
package tech.pathtoprogramming.soapy_sinq;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tech.pathtoprogramming.soapy_sinq package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tech.pathtoprogramming.soapy_sinq
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSinqResponse }
     * 
     */
    public GetSinqResponse createGetSinqResponse() {
        return new GetSinqResponse();
    }

    /**
     * Create an instance of {@link SinkDetails }
     * 
     */
    public SinkDetails createSinkDetails() {
        return new SinkDetails();
    }

    /**
     * Create an instance of {@link GetSinqRequest }
     * 
     */
    public GetSinqRequest createGetSinqRequest() {
        return new GetSinqRequest();
    }

}
