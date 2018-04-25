package Diamond;


public class Diamond {
    private int lines;
    private IsoscelesTriangle isoscelesTriangle;

    public Diamond(int lines) {
        this.lines = lines;
        isoscelesTriangle = new IsoscelesTriangle(lines);
    }
    public Diamond(int lines, String name) {
        this.lines = lines;
        isoscelesTriangle = new IsoscelesTriangle(lines, name);
    }

    public void printDiamond(boolean hasNameInside) {
        isoscelesTriangle.printTriangle(hasNameInside);
        for (int i = lines - 1, j = 2 * i - 1; i > 0; i--, j -= 2) {
            String asterisks = isoscelesTriangle.printAsterisks(j);
            System.out.println(String.format("%" + (lines + i - 1) + "s", asterisks));
        }
    }

    public static void main(String[] args) {
//        Given a number n, print a centered diamond. Example for n=3:
//                  *
//                 ***
//                *****
//                 ***
//                  *
        int n = 3;
        new Diamond(n).printDiamond(false);
    }
}
