
import java.util.Iterator;
import java.util.Random;

public class InfiniteLoop {

    public static void main(String[] args) {
        Random random = new Random();
        Iterable<Integer> range = () -> new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(101);
            }
        };
        for (Integer next : range) {
            System.out.println(next);
        }

    }
}
