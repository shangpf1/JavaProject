package com.test;

public class TestConstant {
    public static void main(String[] args) {
        final int APP_PRICE_PER_KM;   // 声明常量，不能再次赋值
        int weightOfApple;     // 变量可以再次赋值
        int money;
        APP_PRICE_PER_KM=3;
        weightOfApple=2;
        weightOfApple=5;

        money=APP_PRICE_PER_KM*weightOfApple;

        System.out.println(money);


    }
}
