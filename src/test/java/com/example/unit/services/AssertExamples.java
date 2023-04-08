package com.example.unit.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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
         String actualN = null;
       String  expectedNameN = null;

        Assertions.assertNull(expectedNameN, actualN); // to check wether the object is null or not
       // Assertions.assertNotNull();

        boolean value = true;
        Assertions.assertTrue(value);

//        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
//        List<Integer> l2 = Arrays.asList(1,2,3,5,4);
//
//        Assertions.assertIterableEquals(l2,l1);  // two check the object of two collections
        Assertions.assertThrows(RuntimeException.class,()->{
            throw new RuntimeException();
        });  // to check whether it shows the same exception or not



    }
}
