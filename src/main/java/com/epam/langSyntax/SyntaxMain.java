package com.epam.langSyntax;

public class SyntaxMain {
    public static void main(String[] args) {
        NumberReverter numberReverter = new NumberReverter();
        numberReverter.revert(489);

        DigitsSumCalculator digitsSumCalculator = new DigitsSumCalculator();
        digitsSumCalculator.calculateSum(1234);
    }
}
