package PrimeFactors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Prime {
    private List<Integer> list = new ArrayList();
    private int num;

    public Prime(int num) {
        this.num = num;
    }

    public void findPrime() {
        for (int i = 2; i <= num; i++) {
            if (num == 1){
                break;
            }
            if (num % i == 0) {
                list.add(i);
                num = num / i--;
            }
        }
    }

    public void print() {
        list = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(list.stream().distinct().sorted().map(String::valueOf).reduce((a,b) -> a +"," +b).get());
        System.out.println(list);
    }

    public void generate() {
        findPrime();
        print();
    }
}
