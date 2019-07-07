package com.test;

public class TestFloat {
    public static void main(String[] args) {
        int i1 = 1;      // 4字节
        int i2 = 3;
        float f1 = 1f;
        float f2 = 3f;     // 2字节 单精度
        float result1,result2;
        double y1,y2;     // 4字节 双精度
        result1=i1/i2;
        result2=f1/f2;
        y1=i1/i2;
        y2=f1/f2;


        System.out.println("result1:"+result1);
        System.out.println("result2:"+result2);

        System.out.println("y1:"+y1);
        System.out.println("y2:"+y2);
    }
}
