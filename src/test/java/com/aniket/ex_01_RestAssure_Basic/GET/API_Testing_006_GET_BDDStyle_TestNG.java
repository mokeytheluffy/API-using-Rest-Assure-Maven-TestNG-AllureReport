package com.aniket.ex_01_RestAssure_Basic.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class API_Testing_006_GET_BDDStyle_TestNG {

    @Test
    public void test_GET_Req_Positive(){
        String pincode = "400092";
        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/"+pincode).
                when().log().all().get()
                .then().log().all().statusCode(200);
    }

    @Test
    public void test_GET_Req_Negative(){
        String pincode = "-4";
        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/"+pincode).
                when().log().all().get()
                .then().log().all().statusCode(200);
    }
}
