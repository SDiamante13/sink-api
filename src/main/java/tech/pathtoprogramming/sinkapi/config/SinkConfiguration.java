package tech.pathtoprogramming.sinkapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import tech.pathtoprogramming.reactive.SinqServicePort;
import tech.pathtoprogramming.reactive.SinqServicePortService;
import tech.pathtoprogramming.sinkapi.client.AsyncSINQClient;
import tech.pathtoprogramming.sinkapi.client.SINQClient;

@Configuration
public class SinkConfiguration {

    @Bean
    public SinqServicePort sinqServicePort() {
        return new SinqServicePortService().getSinqServicePortSoap11();
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
