package Triangle;

import java.util.stream.IntStream;

public class DrawVerticalLine {
    public static final String ASTERISK = "*";
    private int lines;

    public DrawVerticalLine(int lines) {
        this.lines = lines;
    }

    public void printAsterisks() {
        IntStream.range(0,lines).forEach(item -> System.out.println(ASTERISK));
    }

    public static void main(String[] args) {
        int n = 3;
        new DrawVerticalLine(n).printAsterisks();
    }
}
