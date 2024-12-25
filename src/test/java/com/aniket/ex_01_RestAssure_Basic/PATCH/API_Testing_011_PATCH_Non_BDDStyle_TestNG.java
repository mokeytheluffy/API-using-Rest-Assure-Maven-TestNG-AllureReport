package com.aniket.ex_01_RestAssure_Basic.PATCH;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API_Testing_011_PATCH_Non_BDDStyle_TestNG {
    //token and bookingID

    @Description("Verify put valid test case")
    @Test
    public void test_GET_NonBDDStyle() {
String token = "ab564dfa0609338";
String bookingId = "590";
String payload = "{\n" +
        "    \"firstname\" : \"Aniket\",\n" +
        "    \"lastname\" : \"Brown\"\n" +
        "}";

        RequestSpecification req = RestAssured.given();
        req.baseUri("https://restful-booker.herokuapp.com/");
        req.basePath("/booking/"+ bookingId);
        req.contentType(ContentType.JSON);
        req.cookie("token",token);
        req.body(payload).log().all();
        Response response = req.when().patch();
        ValidatableResponse a = response.then().log().all();
        a.statusCode(200);
    }
}
