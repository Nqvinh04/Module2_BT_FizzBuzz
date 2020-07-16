import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void input() {
        int number  = 3;
        String expected = "Fizz";
        String result = FizzBuzz.input(number);
        assertEquals(expected,result);
    }

    @Test
    void input1() {
        int number  = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.input(number);
        assertEquals(expected,result);
    }

    @Test
    void input2() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzz.input(number);
        assertEquals(expected, result);
    }

    @Test
    void input3() {
        int number  = 35;
        String expected = "Buzz";
        String result = FizzBuzz.input(number);
        assertEquals(expected,result);
    }

    @Test
    void input4() {
        int number  = 30;
        String expected = "FizzBuzz";
        String result = FizzBuzz.input(number);
        assertEquals(expected,result);
    }

    @Test
    void input5() {
        int number  = 2;
        String expected = "2";
        String result = FizzBuzz.input(number);
        assertEquals(expected,result);
    }
}