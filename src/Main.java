public class Main {
    public static void main(String[] args) {
        for(int i = 1;i < 100;i++){
            if(canBeDividedByFive(i) && canBeDividedByThree(i))
                System.out.println("FizzBuzz");

            else if(canBeDividedByThree(i))
                System.out.println("Fizz");

            else if(canBeDividedByFive(i))
                System.out.println("Buzz");

            else
                System.out.println(i);
        }
    }
    public static boolean canBeDividedByFive(int number){
        return number % 5 == 0;
    }
    public static boolean canBeDividedByThree(int number){
        return number % 3 == 0;
    }
}