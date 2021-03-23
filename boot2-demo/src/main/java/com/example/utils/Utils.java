package com.example.utils;

import org.springframework.core.env.Environment;

public class Utils {

    public static void printMethodInfo() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement ste = stackTraceElements[2];
        String clzName = ste.getClassName();
        String methodName = ste.getMethodName();
        System.out.println(String.format("%s#%s()", clzName, methodName));
    }

    public static boolean isMatchOsName(Environment environment, String osName) {
        String os_name = environment.getProperty("os.name");
        if (os_name.contains(osName)) {
            return true;
        }
        return false;
    }

}
