package com.example.assignment02gc200495186;

import com.google.gson.annotations.SerializedName;

public class Crypto {

    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("api_symbol")
    private String api_symbol;

    @SerializedName("symbol")
    private String symbol;

    @SerializedName("market_cap_rank")
    private String market_cap_rank;

    private String thumb;
    private String large;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getApi_symbol() {
        return api_symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getMarket_cap_rank() {
        return market_cap_rank;
    }

    public String getThumb() {
        return thumb;
    }

    public String getLarge() {
        return large;
    }

    public String toString() {
        return market_cap_rank + " - " + name + " - (" + symbol + ")";
    }
}
