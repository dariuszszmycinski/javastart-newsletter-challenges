import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int number = getNumber();
        int length = getNumberLength(number);
        int[] reversedArray = getReversedArray(number,length);
        int reversedNumber = getReversedNumber(reversedArray,length);
        System.out.println(reversedNumber);
    }

    private static int getReversedNumber(int[] array,int length) {
        int result = 0;
        for (int i = 0; i <length ; i++) {
            result+=array[i]*Math.pow(10,length-i-1);
        }
        return result;
    }

    private static int[] getReversedArray(int number,int length) {
        int[] numberArray = new int[length];
        for (int i = 0; i <length ; i++) {
            numberArray[length-i-1]= (int) (number/Math.pow(10,length-i-1));
            number-=numberArray[length-i-1]*Math.pow(10,length-i-1);
        }
        return numberArray;
    }

    private static int getNumberLength(int number) {
        int temp = 1;
        int length = 0;
        while ((number/temp)>=1){
            temp*=10;
            length++;
        }
        return length;
    }

    private static int getNumber(){
        System.out.println("Podaj liczbę do odwrócenia");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }
}
