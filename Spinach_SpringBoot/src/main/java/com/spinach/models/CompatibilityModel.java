package com.spinach.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class CompatibilityModel {
    private long userId;
    private long partnerId;
    private double complianceRatio;
}
