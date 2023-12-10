package com.epam.conditions;

public class ConditionsMain {
    public static void main(String[] args) {
        System.out.println("SeasonDeterminer");
        SeasonDeterminer seasonDeterminer = new SeasonDeterminer();
        seasonDeterminer.tellTheSeason(4);

        System.out.println("\nTriangleSidesValidator");
        TriangleSidesValidator triangleSidesValidator = new TriangleSidesValidator();
        triangleSidesValidator.validate(6, 6, 5);
        triangleSidesValidator.validate(1, 2, 3);

        System.out.println("\nDaysInMonth");
        DaysInMonth daysInMonth = new DaysInMonth();
        daysInMonth.printDays(2023, 11);

        System.out.println("\nIntegerDivider");
        IntegerDivider integerDivider = new IntegerDivider();
        integerDivider.printCompletelyDivided(4, 3);
        integerDivider.printCompletelyDivided(4, 0);
        integerDivider.printCompletelyDivided(4, 4);

        System.out.println("\nCoordinatePane");
        CoordinatePane coordinatePane = new CoordinatePane();
        coordinatePane.printQuadrant(3, 6);

        System.out.println("\nBitwiseValuesSwap");
        BitwiseValuesSwap bitwiseValuesSwap = new BitwiseValuesSwap();
        bitwiseValuesSwap.swap(4, 5);
    }
}
