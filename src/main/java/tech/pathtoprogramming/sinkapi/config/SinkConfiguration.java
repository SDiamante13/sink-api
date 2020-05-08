package tech.pathtoprogramming.sinkapi.config;

import com.sun.tools.internal.ws.wsdl.document.http.HTTPConstants;
import com.sun.xml.internal.ws.client.BindingProviderProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import tech.pathtoprogramming.reactive.SinqServicePort;
import tech.pathtoprogramming.reactive.SinqServicePortService;
import tech.pathtoprogramming.sinkapi.client.AsyncSINQClient;
import tech.pathtoprogramming.sinkapi.client.SINQClient;

import javax.xml.ws.BindingProvider;

import static com.sun.xml.internal.ws.developer.JAXWSProperties.CONNECT_TIMEOUT;
import static com.sun.xml.internal.ws.developer.JAXWSProperties.REQUEST_TIMEOUT;

@Configuration
public class SinkConfiguration {

    @Bean
    public SinqServicePort sinqServicePort() {
        SinqServicePort sinqServicePortSoap = new SinqServicePortService().getSinqServicePortSoap11();
        ((BindingProvider) sinqServicePortSoap).getRequestContext().put(CONNECT_TIMEOUT, 10000);
        ((BindingProvider) sinqServicePortSoap).getRequestContext().put(REQUEST_TIMEOUT, 10000);
        return sinqServicePortSoap;
    }

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("tech.pathtoprogramming.soapy_sinq");
        return marshaller;
    }

    @Bean
    public SINQClient sinqClient(Jaxb2Marshaller marshaller) {
        SINQClient client = new SINQClient();
        client.setDefaultUri("http://localhost:8091/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

    @Bean
    public AsyncSINQClient asyncSINQClient(Jaxb2Marshaller marshaller, SinqServicePort port) {
        AsyncSINQClient asyncClient = new AsyncSINQClient(port);
        asyncClient.setDefaultUri("http://localhost:8091/ws");
        asyncClient.setMarshaller(marshaller);
        asyncClient.setUnmarshaller(marshaller);
        return asyncClient;
    }
}
