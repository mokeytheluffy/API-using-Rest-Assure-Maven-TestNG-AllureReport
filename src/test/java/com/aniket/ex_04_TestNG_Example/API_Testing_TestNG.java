package com.aniket.ex_04_TestNG_Example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class API_Testing_TestNG {
    @BeforeTest
    public void get_token() {
        System.out.println("1");
    }

    @BeforeTest
    public void get_bookingId() {
        System.out.println("2");
    }

    @Test
    public void test_PUT() {
        //token and bookingId should get fetch
        System.out.println("3");
    }

    @AfterTest
    public void CloseAllTabs() {
        System.out.println("Close");
    }
}

