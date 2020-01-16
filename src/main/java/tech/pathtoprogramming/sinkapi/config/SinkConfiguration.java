package tech.pathtoprogramming.sinkapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import tech.pathtoprogramming.sinkapi.client.SINQClient;

@Configuration
public class SinkConfiguration {

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
}
