package io.github.dunwu.javacore.exception;

import java.lang.reflect.Method;

public class ExceptionDemo {
    public static void main(String[] args) {
        // 放开下面的注释会报错。因为 getMethod 抛出 Exception，编译器会检查 Exception。如果没有 try catch 会报错。
        // Method method = String.class.getMethod("toString", int.class);
    }
};
