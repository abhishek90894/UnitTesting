package com.example.unit.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertExamples {

    // Validating actual result with expected result
    //Assertions class

    @Test
    public void test1()
    {
        System.out.println("Testing some assertions method");
        int actual = 12;
        int expected =12;
        //Overloaded
        Assertions.assertEquals(expected,actual);

        int actualIntArray[] = {1,4,3,5,6};
        int expectedIntArray[] = {1,4,3,5,6};

        Assertions.assertArrayEquals(expectedIntArray,actualIntArray);

//        String actualName = new String("abhishek");
//        String expectedName = new String("abhishek");
        String actualName = "abhishek";
        String expectedName = "abhishek";

        Assertions.assertSame(expectedName,actualName); // to compare two object

    }
}
