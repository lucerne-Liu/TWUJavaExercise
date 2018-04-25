package Diamond;

import javax.print.DocFlavor;

public class DiamondWithName extends Diamond{
    private String name;


    public DiamondWithName(String name, int lines) {
        super(lines);
        this.name = name;
        getIsoscelesTriangle().setName(name);
    }

    public static void main(String[] args) {
//        Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//              *
//             ***
//            Bill
//             ***
//              *
        String name = "Bill";
        int n = 3;
        new DiamondWithName(name,n).printDiamond(true);
    }
}
