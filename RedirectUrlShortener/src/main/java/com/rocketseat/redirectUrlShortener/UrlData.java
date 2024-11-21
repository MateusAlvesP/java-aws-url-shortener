package com.rocketseat.redirectUrlShortener;

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

    public UrlData() {}

    public UrlData(String originalUrl, long expirationTimeInSeconds) {
        this.originalUrl = originalUrl;
        this.expirationTime = expirationTimeInSeconds;
    }

    public long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

}
