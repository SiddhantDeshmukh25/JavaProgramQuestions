package com.siddhant;

public class Secondclass {
    public static void main(String[] args) {
        DemoAccessModifier demo = new DemoAccessModifier();
        demo.name="Nilesh";
        //demo.age = 10;   As age is a poriate variable it will not come
        demo.number="1234";
        demo.address="Pune";
        demo.m1();
        Child c = new Child();
        c.test();
    }
}
