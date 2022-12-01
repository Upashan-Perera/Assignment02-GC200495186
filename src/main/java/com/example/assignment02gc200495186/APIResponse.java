package com.example.assignment02gc200495186;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;

public class APIResponse {

    @SerializedName("coins")
    private Crypto[] coins;

    public List<Crypto> getCoins() {
        return Arrays.asList(coins);
    }
}
