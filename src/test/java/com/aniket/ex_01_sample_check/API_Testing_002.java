package com.aniket.ex_01_sample_check;

import io.restassured.RestAssured;

public class API_Testing_002 {
    public static void main(String[] args) {
        //Gherkins Syntax
        // Given() -- URL, header, Auth, Body
        // When() -- methods like- POST,GET,PATCH,DELETE,PUT
        // Then() -- Validation --> 200 OK, first name


        // Full URL :- https://api.zippopotam.us/IN/400092
        // Base URL :- https://api.zippopotam.us
        // Base Path :- /IN/400092
        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/400092")
                .when().get()
                .then().log().all().statusCode(200);

    }
}
