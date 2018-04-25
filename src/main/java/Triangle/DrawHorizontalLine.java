package Triangle;

import java.util.stream.IntStream;

public class DrawHorizontalLine {
    public static final String ASTERISK = "*";
    private int asterisksNumber;

    public DrawHorizontalLine(int asterisksNumber) {
        this.asterisksNumber = asterisksNumber;
    }

    public void printAsterisks() {
        IntStream.range(0,asterisksNumber).forEach(item -> System.out.print(ASTERISK));
    }

    public static void main(String[] args) {
        int n = 8;
        new DrawHorizontalLine(n).printAsterisks();
    }
}
