package tech.pathtoprogramming.sinkapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tech.pathtoprogramming.sinkapi.client.SINQClient;
import tech.pathtoprogramming.sinkapi.model.SinkResponse;

@RequiredArgsConstructor
@RestController
public class SinkController {

    private final SINQClient sinqClient;

    @GetMapping("/sink/{modelNumber}")
    public SinkResponse getSinkResponse(@PathVariable("modelNumber") String modelNumber) {
        return sinqClient.getSinkDetails(modelNumber);
    }
}
