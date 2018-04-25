package Diamond;

import java.util.stream.IntStream;

public class IsoscelesTriangle {
    public static final String ASTERISK = "*";
    private int lines;
    private String name;

    public IsoscelesTriangle(int lines) {
        this.lines = lines;
    }

    public IsoscelesTriangle(int lines, String name) {
        this.lines = lines;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String printAsterisks(int asterisksNumber) {
        return IntStream.range(0, asterisksNumber).mapToObj(item -> ASTERISK).reduce("", String::concat);
    }

    public void printTriangle(boolean hasNameInside) {
        for (int i = 0, j = 1; i < lines; i++, j += 2) {
            String asterisks = printAsterisks(j);
            if (hasNameInside && name.length() > 0 && i == lines - 1) {
                System.out.println(name);
            }else{
                System.out.println(String.format("%" + (lines + i) + "s", asterisks));
            }

        }
    }

    public static void main(String[] args) {
//        Given a number n, print a centered triangle. Example for n=3:
//             *
//            ***
//           *****
        int n = 3;
        new IsoscelesTriangle(n).printTriangle(false);
    }
}
