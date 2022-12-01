package com.example.assignment02gc200495186;

import com.google.gson.annotations.SerializedName;
import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class CryptoDetail {

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("symbol")
    private String symbol;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getMarket_cap_rank() {
        return market_cap_rank;
    }

    @SerializedName("market_cap_rank")
    private String market_cap_rank;
}
