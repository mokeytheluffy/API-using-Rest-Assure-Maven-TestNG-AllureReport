package com.aniket.ex_01_RestAssure_Basic;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API_Testing_010_PUT_Non_BDDStyle_TestNG {
    //token and bookingID

    @Description("Verify put valid test case")
    @Test
    public void test_GET_NonBDDStyle() {
String token = "0ed970b484f94c1";
String bookingId = "2303";
String payload = "{\n" +
        "    \"firstname\" : \"James\",\n" +
        "    \"lastname\" : \"Brown\",\n" +
        "    \"totalprice\" : 111,\n" +
        "    \"depositpaid\" : true,\n" +
        "    \"bookingdates\" : {\n" +
        "        \"checkin\" : \"2018-01-01\",\n" +
        "        \"checkout\" : \"2019-01-01\"\n" +
        "    },\n" +
        "    \"additionalneeds\" : \"Breakfast\"\n" +
        "}";

        RequestSpecification req = RestAssured.given();
        req.baseUri("https://restful-booker.herokuapp.com/");
        req.basePath("/booking/"+ bookingId);
        req.contentType(ContentType.JSON);
        req.cookie("token",token);
        req.body(payload).log().all();
        Response response = req.when().put();
        ValidatableResponse a = response.then().log().all();
        a.statusCode(200);
    }
}
