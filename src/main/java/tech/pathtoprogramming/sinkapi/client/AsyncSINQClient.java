package tech.pathtoprogramming.sinkapi.client;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import reactor.core.publisher.Mono;
import tech.pathtoprogramming.reactive.SinqServicePort;
import tech.pathtoprogramming.soapy_sinq.GetSinqRequest;
import tech.pathtoprogramming.soapy_sinq.GetSinqResponse;

import static tech.pathtoprogramming.sinkapi.ReactorAsyncHandler.into;

@Slf4j
@RequiredArgsConstructor
public class AsyncSINQClient extends WebServiceGatewaySupport {

    private final SinqServicePort port;

    public Mono<GetSinqResponse> getSinkDetails(String modelNumber) {

        GetSinqRequest request = new GetSinqRequest();
        request.setModelNumber(modelNumber);

        log.info("Requesting sink details for in non-blocking manner for model number " + modelNumber);

        return nonBlockingCall(request);
    }

    private Mono<GetSinqResponse> nonBlockingCall(GetSinqRequest request) {
        return Mono.create(sink -> port.getSinqAsync(request, into(sink)));
    }
}
