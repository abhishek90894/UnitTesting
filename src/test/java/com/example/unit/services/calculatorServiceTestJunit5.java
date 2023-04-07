package com.example.unit.services;

import org.junit.jupiter.api.*;

public class calculatorServiceTestJunit5 {

    /**
     * @Display  to display test case name
     * @Disabled to disable particular test case
     * @Tag
     * @TestFactory
     * @Nested
     */

    @BeforeAll
    public static void init()
    {
        System.out.println("before all test cases");
    }

    @AfterAll
    public static void cleanup()
    {
        System.out.println("after all test cases");
    }

    @BeforeEach
    public void eachTestCase()
    {
        System.out.println("before each test case");
    }
    @AfterEach
    public void afterTestCase()
    {
        System.out.println("after each test case");
    }

    @Test
    public void addTwoNumberTest()
    {
       int actual = calculatorService.addTwoNumber(12,15);
       int expected = 27;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public  void addAnyNumberTest()
    {
       int actual = calculatorService.sumAnyNumbers(12,3,4,5,6);
       int expected = 30;
       Assertions.assertEquals(expected,actual);
    }


}
