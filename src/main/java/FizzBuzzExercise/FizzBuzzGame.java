package FizzBuzzExercise;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private InputReader reader = new InputReader();

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            results.add(replace(i));
        }
    }

    public void init() throws Exception {
        System.out.println("请输入总数：");
        start(Integer.parseInt(reader.read()));
        getResults().stream().forEach(item -> System.out.println(item));
    }

    public List<String> getResults() {
        return results;
    }

    public String replace(int i) {
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (result == "") {
            result = Integer.toString(i);
        }
        return result;
    }
}
