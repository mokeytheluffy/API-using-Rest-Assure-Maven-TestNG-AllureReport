package com.aniket.ex_04_TestNG_Example;

import org.testng.annotations.Test;

public class API_Testing_TestNG_Grouping {
@Test(groups = {"sanity","qa"})
    public void get_token() {

        System.out.println("1");
    }
    @Test(groups = {"qa"})

    public void get_bookingId() {

    System.out.println("2");
    }
    @Test(groups = {"reg"})

    public void test_PUT() {
        //token and bookingId should get fetch
        System.out.println("3");
    }
    @Test(groups = {"sanity","reg"})

    public void CloseAllTabs() {

        System.out.println("Close");
    }
}

