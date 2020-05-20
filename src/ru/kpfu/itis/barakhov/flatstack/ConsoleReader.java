package ru.kpfu.itis.barakhov.flatstack;

import java.util.Scanner;

public class ConsoleReader {
    private Scanner sc;
    private static final String IAE_MESSAGE = "";
    public static String[] inputSequence() {
        Scanner sc = new Scanner(System.in);
        String[] lines;
        lines = sc.nextLine().split(" ");
        if (lines.length > 2) throw new IllegalArgumentException(IAE_MESSAGE);
        return lines;
    }
}
