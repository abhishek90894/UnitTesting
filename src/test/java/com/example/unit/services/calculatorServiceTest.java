package com.example.unit.services;


import org.junit.*;

import java.util.Date;


public class calculatorServiceTest {

    /**
     *   important annotation used
     * @Test
     * @Before
     * @After
     * @BeforeClass
     * @AfterClass
     * @Test(timeout = 2000)  test within 2000 milisecond if exceed then test case failed
     */

    int counter = 0;

         @BeforeClass       // this annotation is used to run method before test cases
         public static void init()
         {
             System.out.println("Before All Test Cases");
             System.out.println("started test"+new Date());
         }

         @Before   // this annotation is used to execute before each test cases
         public void beforeEach()
         {
              counter = 0;
             System.out.println("before each test case");
         }

     // Test method of addTwoNumber
    @Test
    public void addTwoNumberTest()
    {
        for(int i =0;i<=20;i++)
        {
            counter = counter+i;
        }

        System.out.println("test for two numbers");
        int result  =  calculatorService.addTwoNumber(12,45);

        int expected = 57;
        Assert.assertEquals(expected,result);
        System.out.println("counter in first test cases"+counter);
    }

    @Test
    public void sumAnyNumberTest()
    {

        for(int i =0;i<=50;i++)
        {
            counter = counter+i;
        }
        System.out.println("test for sumOfAnyNumbers");
         int result   =   calculatorService.sumAnyNumbers(2,3,4,5,6,7);

         int expected = 27;
           Assert.assertEquals(expected,result);

        System.out.println("counter in second test cases"+counter);

    }

    @AfterClass     // this annotation is used to run method after all test case finished
    public static void cleanUp()
    {
        System.out.println("after all test cases");
        System.out.println("end test cases"+ new Date());
    }
}
