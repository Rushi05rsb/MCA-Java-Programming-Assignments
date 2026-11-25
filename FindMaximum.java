public class FindMaximum {

    static <T extends Comparable<T>> T findMaximum(T[] arr) {
        T max = arr[0];

        for (T i : arr) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Integer[] a = {10, 20, 30, 40};
        Double[] b = {2.5, 5.5, 1.5};
        String[] c = {"Apple", "Mango", "Banana"};

        System.out.println("Maximum Integer: " + findMaximum(a));
        System.out.println("Maximum Float: " + findMaximum(b));
        System.out.println("Maximum String: " + findMaximum(c));
    }
}