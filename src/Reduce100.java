public class Reduce100 {
    public static void main(String[] args) {

        int i = 100;
        reduce(i);
    }

    private static void reduce(int i) {
        int k = 0;
        while (i > 0) {
            if (i % 2 == 0) {
                i = i /2;
            }
            else {
                i = i -1;
            }
            k = k+1;
        }
        System.out.println(k);
    }
}
