package org.cursjava.Optional_testing_practice.Example2;

import org.cursjava.EXTRA_EXERCITII.Optional_testing_practice.Example2.CarMercedes;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarMercedesTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Usually is used to MAKE the connection to Data base");
    }

    private CarMercedes testObject= new CarMercedes("c", Color.GRAY, false);;
    private CarMercedes testObject2 = new CarMercedes("c", Color.GRAY, true);;
    @BeforeEach
    void setUp() {
        testObject = new CarMercedes("c", Color.GRAY, false);
        testObject2 = new CarMercedes("c", Color.GRAY, true);
    }

    @Test
    public void test_calculateCarPrice_isSUV_true(){
        System.out.println("Check car price for isSUV:");

        int result = testObject2.calculateCarPrice();
        assertEquals(20000, result);
        System.out.println(result);
    }

    @Test
    public void test_calculateCarPrice_isSUV_false(){
        System.out.println("Check car price for isNotSUV:");

        int result = testObject.calculateCarPrice();
        assertEquals(15000, result);
        System.out.println(result);
    }

    @AfterEach
    void tearDown() {
        testObject = null;
        testObject2 = null;
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Usually is used to CLOSE the connection to Data base");
    }
}