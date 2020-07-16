public class FizzBuzz {
    public static String input(int number){
        boolean divideBy5 = number % 5 == 0;
        boolean divideBy3 = number % 3 == 0;
        if (divideBy3 && divideBy5){
            return "FizzBuzz";
        } else if (divideBy5){
            return  "Buzz";
        } else if (divideBy3){
            return  "Fizz";
        }
        return number + "";
    }
}
