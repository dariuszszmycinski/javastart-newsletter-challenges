import java.util.ArrayList;
import java.util.List;

public class FizzBuzzForEach implements FizzBuzz {
    @Override
    public void print(int from, int to) {
        for (Integer i : makeSequence(from, to)) {
            String result = null;
            if (i % 3 == 0 || i % 5 == 0) {
                result = i + " ";
            }
            if (i % 3 == 0) {
                result = result + "Fizz";
            }
            if (i % 5 == 0) {
                result = result + "Buzz";
            }
            if (result != null) {
                System.out.println(result);
            }
        }

    }

    private List<Integer> makeSequence(int begin, int end) {
        ArrayList<Integer> ret = new ArrayList<>(end - begin + 1);
        for (int i = begin; i <= end; i++, ret.add(i - 1)) ;
        return ret;
    }
}
