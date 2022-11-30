package com.example.assignment02gc200495186;

import com.google.gson.annotations.SerializedName;

public class APIResponse {

    @SerializedName("coins")
    private Crypto[] coins;

    public Crypto[] getCoins() {
        return coins;
    }
}
