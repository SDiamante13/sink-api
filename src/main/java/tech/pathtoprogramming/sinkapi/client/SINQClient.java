package tech.pathtoprogramming.sinkapi.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.transport.http.ClientHttpRequestMessageSender;
import tech.pathtoprogramming.sinkapi.model.SinkResponse;
import tech.pathtoprogramming.soapy_sinq.GetSinqRequest;
import tech.pathtoprogramming.soapy_sinq.GetSinqResponse;
import tech.pathtoprogramming.soapy_sinq.SinkDetails;

@Slf4j
public class SINQClient extends WebServiceGatewaySupport {

    @Cacheable(cacheNames = "sinkResponse", key = "#modelNumber")
    public SinkResponse getSinkDetails(String modelNumber) {

        GetSinqRequest request = new GetSinqRequest();
        request.setModelNumber(modelNumber);

        log.info("Requesting sink details for " + modelNumber);

        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(10000);
        requestFactory.setReadTimeout(10000);
        setMessageSender(new ClientHttpRequestMessageSender(requestFactory));

        GetSinqResponse response = (GetSinqResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8091/ws/sink", request,
                        new SoapActionCallback(
                                "http://pathtoprogramming.tech/soapy-sinq/GetSinqRequest"));

        SinkDetails sinkDetails = response.getSinkDetails();

        return SinkResponse.builder()
                .modelNumber(sinkDetails.getModelNumber())
                .skuNumber(sinkDetails.getSKUNumber())
                .modelName(sinkDetails.getModelName())
                .description(sinkDetails.getDescription())
                .price(sinkDetails.getPrice())
                .numOfBowls(sinkDetails.getNumOfBowls())
                .length(sinkDetails.getLength())
                .depth(sinkDetails.getDepth())
                .sinkMaterial(sinkDetails.getSinkMaterial())
                .build();
    }
}
