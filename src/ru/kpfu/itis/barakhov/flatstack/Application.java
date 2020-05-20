package ru.kpfu.itis.barakhov.flatstack;

public class Application {

    public static void start() {
        ConsoleWriter.writeInfo();
        Application.run();
    }

    private static void run() {
        try {
            ConsoleWriter.writeInstruction();
            String[] lines = ConsoleReader.inputSequence();
            SequenceCounter sequenceCounter = new SequenceCounter(lines);
            sequenceCounter.count();
        } catch (IllegalArgumentException ex) {
            ConsoleWriter.writeProblems();
            Application.run();
        }
    }
}
