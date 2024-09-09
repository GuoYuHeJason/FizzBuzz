public class Multiples1000 {
    //how many multiples of 3 or 5 there are below 1000.
    public static void main(String[] args) {

        int j = 1000;


        number_of_multiples_under_3_and_5(j);
    }

    private static void number_of_multiples_under_3_and_5(int j) {
        int k = 0;

        for (int i = 1; i < j; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 || divisibleBy5) {

                k++;

            }
        }
        System.out.println(k);
    }
}
