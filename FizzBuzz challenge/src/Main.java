public class Main {
    public static void main(String[] args) {
        System.out.println("Pętla for:");
        FizzBuzzFor fizzBuzzFor = new FizzBuzzFor();
        fizzBuzzFor.print(0,15);
        System.out.println("Strumień:");
        FizzBuzzStream fizzBuzzStream = new FizzBuzzStream();
        fizzBuzzStream.print(0,15);
        System.out.println("Pętla for each:");
        FizzBuzzForEach fizzBuzzForEach = new FizzBuzzForEach();
        fizzBuzzForEach.print(0,15);
    }
}
