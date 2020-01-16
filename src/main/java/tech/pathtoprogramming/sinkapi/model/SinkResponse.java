package tech.pathtoprogramming.sinkapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SinkResponse {
    private String modelNumber;
    private String skuNumber;
    private String modelName;
    private String description;
    private double price;
    private int numOfBowls;
    private double length;
    private double depth;
    private String sinkMaterial;
}
