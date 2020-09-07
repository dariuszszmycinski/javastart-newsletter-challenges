import java.util.stream.IntStream;

public class FizzBuzzStream implements FizzBuzz {
    @Override
    public void print(int from, int to) {
        IntStream.rangeClosed(from, to)
                .forEach(i -> {
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.println(i + " FizzBuzz");
                    } else if (i % 3 == 0) {
                        System.out.println(i + " Fizz");
                    } else if (i % 5 == 0) {
                        System.out.println(i + " Buzz");
                    }
                });
    }
}
