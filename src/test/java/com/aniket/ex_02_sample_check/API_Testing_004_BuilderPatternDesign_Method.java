package com.aniket.ex_02_sample_check;

public class API_Testing_004_BuilderPatternDesign_Method {

    public API_Testing_004_BuilderPatternDesign_Method step1() {
        System.out.println("step1");
        return this;
    }

    public API_Testing_004_BuilderPatternDesign_Method step2() {
        System.out.println("step2");
        return this;
    }

    public API_Testing_004_BuilderPatternDesign_Method step3() {
        System.out.println("step3");
        return this;
    }

    public static void main(String[] args) {
        API_Testing_004_BuilderPatternDesign_Method steps = new API_Testing_004_BuilderPatternDesign_Method();
        steps.step1().step2().step3();
    }
}