package tech.pathtoprogramming.sinkapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import tech.pathtoprogramming.sinkapi.client.AsyncSINQClient;
import tech.pathtoprogramming.sinkapi.client.SINQClient;
import tech.pathtoprogramming.sinkapi.model.SinkResponse;
import tech.pathtoprogramming.soapy_sinq.GetSinqResponse;

@RequiredArgsConstructor
@RestController
public class SinkController {

    private final SINQClient sinqClient;
    private final AsyncSINQClient asyncSINQClient;

    @GetMapping("/sink/{modelNumber}")
    public SinkResponse getSinkResponse(@PathVariable("modelNumber") String modelNumber) {
        return sinqClient.getSinkDetails(modelNumber);
    }

    @GetMapping("/sink/reactive/{modelNumber}")
    public Mono<GetSinqResponse> getReactiveSinkResponse(@PathVariable("modelNumber") String modelNumber) {
        return asyncSINQClient.getSinkDetails(modelNumber);
    }
}
