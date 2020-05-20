package ru.kpfu.itis.barakhov.flatstack;

import java.util.List;

public class ConsoleWriter {

    public static void writeInfo() {
        System.out.println("Test task for FlatStack RoR courses.");
    }

    public static void writeInstruction() {
        System.out.println("Enter initial sequence and number of elements separated by space:");
    }

    public static void writeSequence(StringBuilder currentSequence) {
        System.out.println(currentSequence.toString());
    }

    public static void writeProblems() {
        System.out.println("Something going wrong. Try again");
    }
}
