package com.aniket.ex_05_Assertions;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.hamcrest.Matchers;

public class API_Testing_020_RestAssured_Assertion {
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
        a.basePath("/booking");
        a.contentType(ContentType.JSON).log().all(); // contextype is use to get header
        a.body(payload);

        //Get validable response
        Response response1 = a.when().log().all().post();
        ValidatableResponse var1 = response1.then().log().all().statusCode(200);

        //RestAssured---> import org.hamcrest.Matchers;
        //Matchers.equalto()
        var1.body("bookingid",Matchers.notNullValue());
        var1.body("booking.firstname",Matchers.equalTo("Jim"));
       var1.body("booking.lastname",Matchers.equalTo("Brown"));
       var1.body("booking.totalprice",Matchers.equalTo(111));
        var1.body("booking.depositpaid",Matchers.equalTo(true));

    }
}
