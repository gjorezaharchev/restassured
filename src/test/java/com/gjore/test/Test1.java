package com.gjore.test;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    @Description("sample test")
    public void test1(){
        System.out.println("This is my test");
    }
}
