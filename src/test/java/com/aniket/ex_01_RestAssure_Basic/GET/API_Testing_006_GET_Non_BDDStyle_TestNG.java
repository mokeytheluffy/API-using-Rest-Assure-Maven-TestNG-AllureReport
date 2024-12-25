package com.aniket.ex_01_RestAssure_Basic.GET;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API_Testing_006_GET_Non_BDDStyle_TestNG {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
@Description("Verify the positive test cases")
    @Test
    public void test_GET_NonBDDStyle() {

        //RestAssure Interface
        String pincode = "400092";
        r = RestAssured.given(); // RequestSpecification is an interface
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);
        response = r.when().log().all().get(); // Response is an interface
        vr = response.then().log().all().statusCode(200); // ValidatableResponse is an interface
    }
    @Description("Verify the negative test cases-1")
    @Test
    public void test_GET_Req_Negative() {
        String pincode = "-1";
        r = RestAssured.given(); // RequestSpecification is an interface
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);
        response = r.when().log().all().get(); // Response is an interface
        vr = response.then().log().all().statusCode(200); // ValidatableResponse is an interface

    }
    @Description("Verify the negative test cases_blank")
    @Test
    public void test_GET_Req_Negative_1() {
        String pincode = "";
        r = RestAssured.given(); // RequestSpecification is an interface
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);
        response = r.when().log().all().get(); // Response is an interface
        vr = response.then().log().all().statusCode(200); // ValidatableResponse is an interface
    }
}
