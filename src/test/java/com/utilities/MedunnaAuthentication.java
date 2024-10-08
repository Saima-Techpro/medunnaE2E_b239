package com.utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class MedunnaAuthentication {


    public static void main(String[] args) {
        System.out.println(generateToken());
    }

    public static String generateToken(){
        String credentials = "{\n" +
                "  \"password\": \"Mark.123\",\n" +
                "  \"rememberMe\": true,\n" +
                "  \"username\": \"mark_twain\"\n" +
                "}";

        Response response = given().when().body(credentials).contentType(ContentType.JSON).post("https://medunna.com/api/authenticate");

        return response.jsonPath().getString("id_token");

    }
}
