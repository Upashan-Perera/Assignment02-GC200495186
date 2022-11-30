package com.example.assignment02gc200495186;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIUtility {

    /**
     * This method will call the coingecko API with the search term
     * @param searchTerm
     * @throws IOException
     * @throws InterruptedException
     */
    public static void getCryptoFromCoinGecko(String searchTerm) throws IOException, InterruptedException {

        //replacing all spaces in order to read correctly
        searchTerm = searchTerm.replaceAll(" ","%20");
        String uri = "https://api.coingecko.com/api/v3/search?query=" + searchTerm;

        //String uri = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&ids=" + searchTerm + "&order=market_cap_desc&per_page=100&page=1&sparkline=false";

        //configure the environment to make a HTTP request
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        HttpResponse<Path> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofFile(Paths.get("cryptos.json")));


    }

    /**
     * This method will read the json file and create API response object. That APIResponse object will hold the Crypto objects
     */
    public static APIResponse getCryptosFromFile() {

        //converting JSON to Java objects
        Gson gson = new Gson();
        APIResponse apiResponse = null;

        //try with resources
        try(
                //accessing the file from the file system
                FileReader fileReader = new FileReader("cryptos.json");
                JsonReader jsonReader = new JsonReader(fileReader);
                ) {
            apiResponse = gson.fromJson(jsonReader,APIResponse.class);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return apiResponse;
    }
}
