package mzaenalmustopa.javalambda.app;

import mzaenalmustopa.javalambda.util.StringUtil;

import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        // Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("hello"));
        System.out.println(predicateIsLowerCase.test("Hello"));
    }
}
