package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @Disabled("Don't run this test until JIRA #123 solved")
    void basicTest(){

    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly(){

    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly(){

    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void testForMacAndWindows(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForJavaVersion17(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testForJavaVersion13(){

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_16)
    void testForJavaVersionRange(){

    }


    @Test
    @EnabledForJreRange(min = JRE.JAVA_11)
    void testForJavaVersionMin(){

    }


    @Test
    @EnabledIfEnvironmentVariable(named = "LUV2CODE_DEV", matches = "DEV")
    void testForDevEnv(){

    }


    @Test
    @EnabledIfSystemProperty(named = "LUV2CODE_SYS_PROP", matches = "CI_CD_DEPLOY")
    void testForSystemProp(){

    }









}
