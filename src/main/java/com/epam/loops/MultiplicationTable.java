package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }
    }

    public static void main(String[] args) {
        new MultiplicationTable().printTable(4);
    }

}
