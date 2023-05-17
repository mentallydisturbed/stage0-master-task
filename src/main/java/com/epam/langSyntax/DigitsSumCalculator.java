package com.epam.langSyntax;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = number / 10000;
        number %= 10000;
        sum += number / 1000;
        number %= 1000;
        sum += number / 100;
        number %= 100;
        sum += number / 10;
        number %= 10;
        sum += number;
        System.out.println(sum);
    }
}