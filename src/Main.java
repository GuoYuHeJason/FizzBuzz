import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int i = 1;

//        FizzBuzz.doFizzBuzz(i);
//        java: doFizzBuzz(int) has private access in FizzBuzz
        FizzBuzz.main(args);
        // placeholder for system parameters, passing system arguments to Fizz
        System.out.println(Arrays.toString(args));
    }
}
