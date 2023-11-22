package com.luv2code.junitdemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class DemoUtilsTest {

    @Test
//    @DisplayName("Equals and Not Equals")
    void testEqualsAndNotEquals(){
        DemoUtils demoUtils = new DemoUtils();

        assertEquals(6, demoUtils.add(2,4),"2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "1+9 must not be 6");

    }

    @Test
//    @DisplayName("Object Or Null")
    void testObjectOrNull(){
        DemoUtils demoUtils = new DemoUtils();
        String s1 = null;
        String s2 = "java";
        assertNull(demoUtils.checkNull(s1));
        assertNotNull(demoUtils.checkNull(s2));
    }


    @Test
    void testSameOrNot(){
        DemoUtils demoUtils = new DemoUtils();
        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate());
        assertNotSame("luv2code", demoUtils.getAcademyDuplicate());
    }

    @Test
    void testTrueFalse(){
        DemoUtils demoUtils = new DemoUtils();
        assertTrue(demoUtils.isGreater(2,1));
        assertFalse(demoUtils.isGreater(5,6));

    }

    @Test
    void testThrowAndNotThrow(){
        DemoUtils demoUtils = new DemoUtils();
        assertThrows(Exception.class, () -> demoUtils.throwException(-4));
        assertDoesNotThrow(() -> demoUtils.throwException(9));
    }

    @Test
    @DisplayName("Timing method")
    void testForTimeOut(){
        DemoUtils demoUtils = new DemoUtils();
        assertTimeoutPreemptively(Duration.ofSeconds(6), () -> demoUtils.checkTimeout());
    }

    @Test
    @DisplayName("Multiplication")
    void testMultiply(){
        DemoUtils demoUtils = new DemoUtils();
        assertEquals(12, demoUtils.multiply(4,3));
    }
}