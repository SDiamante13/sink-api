package tech.pathtoprogramming.sinkapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SinkResponse implements Serializable {
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
