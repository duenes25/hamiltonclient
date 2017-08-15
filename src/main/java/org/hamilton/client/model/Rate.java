package org.hamilton.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rate {
    private String name;
    private String code;
    private Double rate;
    // add getters and setters
}
