package com.siddhant;

public class DemoAccessModifier {
    public String name;
    private int age;
     String number;
     protected String address;
     protected void m1(){
         System.out.println("M1 method ");
     }
}
class Child extends DemoAccessModifier{
void test(){
    this.name="Nilesh";
    //this.age=10;
    this.address="BEED";
    this.m1();

}
}

