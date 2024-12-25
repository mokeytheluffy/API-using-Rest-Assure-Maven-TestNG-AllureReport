package com.aniket.ex_04_TestNG_Example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class API_Testing_TestNG_Priority {
@Test(priority = 2)
    public void get_token() {
        System.out.println("1");
    }

    @Test(priority = 1)
    public void get_bookingId() {
        System.out.println("2");
    }

    @Test(priority = 4)
    public void test_PUT() {
        //token and bookingId should get fetch
        System.out.println("3");
    }

    @Test(priority = 3)
    public void CloseAllTabs() {
        System.out.println("Close");
    }
}

