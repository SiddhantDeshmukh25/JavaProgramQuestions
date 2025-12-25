package com.org.access.com;

import com.siddhant.DemoAccessModifier;

public class CheckAccessModifier {
    public static void main(String[] args) {
        DemoAccessModifier demo = new DemoAccessModifier();
        demo.name ="Siddhant";
        //demo.number="1234"; Number will not come as the number is default and in different package
        //demo.m1(); as this is protected method cannot be visible aout side the class
    }

}
