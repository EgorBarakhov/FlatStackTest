package ru.kpfu.itis.barakhov.flatstack;

public class SequenceCounter {
    private static final String IAE_MESSAGE = "";
    private StringBuilder currentSequence;
    private StringBuilder nextSequence;
    private int numberOfStrings;

    public SequenceCounter(String[] lines) {
        try {
            Integer.parseInt(lines[0]);
            currentSequence = new StringBuilder(lines[0]);
            nextSequence = new StringBuilder();
            numberOfStrings = Integer.parseInt(lines[1]);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(IAE_MESSAGE);
        }
    }

    public void count() {
        ConsoleWriter.writeSequence(currentSequence);
        int counter, pos, length;
        StringBuilder tmp;
        for (int i = 0; i < numberOfStrings - 1; i++) {
            pos = 0;
            length = currentSequence.length();
            while (pos <= length - 1) {
                counter = 1;
                while ((pos + 1) != length && (currentSequence.charAt(pos) == currentSequence.charAt(pos + 1))) {
                    counter++;
                    pos++;
                }
                nextSequence.append(counter).append(currentSequence.charAt(pos));
                pos++;
            }
            ConsoleWriter.writeSequence(nextSequence);
            tmp = currentSequence;
            currentSequence = nextSequence;
            nextSequence = tmp;
            nextSequence.setLength(0);
        }
    }
}
