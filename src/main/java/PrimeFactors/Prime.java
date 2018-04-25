package PrimeFactors;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    private List<Integer> list = new ArrayList();
    private int num;

    public Prime(int num) {
        this.num = num;
    }

    public void findPrime() {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                list.add(i);
                num = num / i;
                i--;
            }
        }
    }

    public void print() {
//        System.out.println(list.stream().sorted().map(String::valueOf).reduce((a,b) -> a +"," +b).get());
        System.out.println(list);
    }

    public void generate() {
        findPrime();
        print();
    }
}
