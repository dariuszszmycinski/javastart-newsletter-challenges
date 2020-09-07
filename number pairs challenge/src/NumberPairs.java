import java.util.Arrays;
import java.util.HashMap;

class NumberPairs {
    // {1 2 3 4 5};
    // {-5 0 5 -10 5 15};
    // {-5 0 10 -5 0 5 5};

    public static void main(String[] args) {
        int [] data = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        HashMap<Integer, Integer> low = findLowSumPair(data);
        System.out.println("Number pairs with lowest sum:");
        printResults(low);
        HashMap<Integer, Integer> high = findHighSumPair(data);
        System.out.println("Number pairs with highest sum:");
        printResults(high);
    }

    private static HashMap<Integer, Integer> findLowSumPair(int[] data) {
        int lowSum = (data[0] + data[1]);
        for (int i = 0; i < data.length - 1; i++) {
            if ((data[i] + data[i + 1]) < lowSum) {
                lowSum = data[i] + data[i + 1];
            }
        }
        HashMap<Integer,Integer> result = new HashMap<>();
        for (int i = 0; i < data.length -1; i++) {
            if ((data[i] + data[i + 1]) == lowSum) {
                result.put(data[i],data[i+1]);
            }
        }
        return result;
    }

    private static HashMap<Integer, Integer> findHighSumPair(int[] data) {
        int highSum = (data[0] + data[1]);
        for (int i = 0; i < data.length - 1; i++) {
            if ((data[i] + data[i + 1]) > highSum) {
                highSum = data[i] + data[i + 1];
            }
        }
        HashMap<Integer,Integer> result = new HashMap<>();
        for (int i = 0; i < data.length -1; i++) {
            if ((data[i] + data[i + 1]) == highSum) {
                result.put(data[i],data[i+1]);
            }
        }
        return result;
    }

    private static void printResults(HashMap<Integer, Integer> data) {
        System.out.println(Arrays.toString(data.entrySet().toArray()));
    }

}
