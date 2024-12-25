package com.aniket.ex_01_RestAssure_Basic.GET;

import io.restassured.RestAssured;

public class API_Testing_005_GET_BDDStyle {
    public static void main(String[] args) {
        String pincode = "400092";
        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/"+pincode).
                when().log().all().get()
                .then().log().all().statusCode(200);
pincode = "-1";
        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/"+pincode).
                when().log().all().get()
                .then().log().all().statusCode(200);
    }
}
