package com.aniket.ex_01_RestAssure_Basic.DELETE;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API_Testing_012_DELETE_Non_BDDStyle_TestNG {
    //token and bookingID

    @Description("Verify delete valid test case")
    @Test
    public void test_GET_NonBDDStyle() {
String token = "c574a03c761567c";
String bookingId = "628";

        RequestSpecification req = RestAssured.given();
        req.baseUri("https://restful-booker.herokuapp.com/");
        req.basePath("/booking/"+ bookingId);
        req.contentType(ContentType.JSON);
        req.cookie("token",token).log().all();
        Response response = req.when().delete();
        ValidatableResponse a = response.then().log().all();
        a.statusCode(201);
    }
}
