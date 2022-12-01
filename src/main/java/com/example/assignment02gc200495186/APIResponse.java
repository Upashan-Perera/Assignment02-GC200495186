package com.example.assignment02gc200495186;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;

public class APIResponse {

    @SerializedName("coins")
    private Crypto[] coins;

    /**
     * getting the returned results as an array
     * @return
     */
    public List<Crypto> getCoins() {
        return Arrays.asList(coins);
    }

    /**
     * Method to search whether the search result is zero
     * @return
     */
    boolean getResponse() {

        if(coins.length == 0){
            return false;
        }
        else {
            return true;
        }
    }
}
