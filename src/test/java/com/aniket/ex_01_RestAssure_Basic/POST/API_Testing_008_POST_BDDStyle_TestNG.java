package com.aniket.ex_01_RestAssure_Basic.POST;
import java.lang.*;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class API_Testing_008_POST_BDDStyle_TestNG {
    @Description("Verify the positive test cases")
    @Test
    public void test_GET_NonBDDStyle() {

        //https://restful-booker.herokuapp.com
    /*
     {
    "username" : "admin",
    "password" : "password123"
      }
    */
// no Auth provided
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON).log().all() // contextype is use to get header
                .body(payload)// for reading body
                .when().log().all().post()
                .then().log().all().statusCode(200);
    }
}
