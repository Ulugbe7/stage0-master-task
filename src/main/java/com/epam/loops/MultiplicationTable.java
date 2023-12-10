package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numberTableToPrint, i, numberTableToPrint * i);
        }
    }

    public static void main(String[] args) {
        new MultiplicationTable().printTable(4);
    }

}
