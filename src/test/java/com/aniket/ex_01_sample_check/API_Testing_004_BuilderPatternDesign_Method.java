package com.aniket.ex_01_sample_check;

public class API_Testing_004_BuilderPatternDesign_Method {

    public API_Testing_004_BuilderPatternDesign_Method step1(String name) {
        System.out.println("step1");
        return this;
    }

    public API_Testing_004_BuilderPatternDesign_Method step2(String name) {
        System.out.println("step2");
        return this;
    }

    public API_Testing_004_BuilderPatternDesign_Method step3(String name) {
        System.out.println("step3");
        return this;
    }

    public static void main(String[] args) {
        API_Testing_004_BuilderPatternDesign_Method steps = new API_Testing_004_BuilderPatternDesign_Method();
        steps.step1().step2().step3("Aniket");
    }
}