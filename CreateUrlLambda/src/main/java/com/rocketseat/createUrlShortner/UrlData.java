package com.rocketseat.createUrlShortner;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UrlData {
    @JsonProperty("originalUrl")
    private String originalUrl;
    @JsonProperty("expirationTime")
    private long expirationTime;

    public UrlData(String originalUrl, long expirationTimeInSeconds) {

        this.originalUrl = originalUrl;
        this.expirationTime = expirationTimeInSeconds;
    }
}
