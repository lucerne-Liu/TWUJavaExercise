package Triangle;

import java.util.stream.IntStream;

public class DrawRightTriangle {
    public static final String ASTERISK = "*";
    private int lines;

    public DrawRightTriangle(int lines) {
        this.lines = lines;
    }

    public void printAsterisks(int asterisksNumber) {
        IntStream.range(0, asterisksNumber).forEach(item -> System.out.print(ASTERISK));
    }

    public void printTriangle() {
        for (int i = 0; i < lines; i++) {
            printAsterisks(i + 1);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        new DrawRightTriangle(n).printTriangle();
    }

}
