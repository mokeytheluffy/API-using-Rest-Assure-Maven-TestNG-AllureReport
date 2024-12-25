package com.aniket.ex_01_RestAssure_Basic.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API_Testing_009_POST_Non_BDDStyle_TestNG {
    RequestSpecification a;
    Response response1;
    ValidatableResponse var1;

    @Description("Verify the positive test cases")
    @Test
    public void test_GET_NonBDDStyle() {

        String payload = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        RequestSpecification a = RestAssured.given();
        a = RestAssured.given();
        a.baseUri("https://restful-booker.herokuapp.com");
        a.basePath("/auth");
        a.contentType(ContentType.JSON).log().all(); // contextype is use to get header
        a.body(payload);
        Response response1 = a.when().log().all().post();
        ValidatableResponse var1 = response1.then().log().all().statusCode(200);

    }
}
