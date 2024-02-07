package com.mehmetberkan.SpringGraphQLExample.dto;

import lombok.Data;

@Data
public class VehicleDto {
    private String type;
    private String modelCode;
    private String brandName;
}
