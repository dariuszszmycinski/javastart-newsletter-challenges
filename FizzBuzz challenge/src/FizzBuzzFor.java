public class FizzBuzzFor implements FizzBuzz {
    @Override
    public void print(int from, int to) {
        for (int i = from; i < to + 1; i++) {
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
}
