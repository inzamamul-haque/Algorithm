public class LinearSearch {

    public static void main(String[] args) {
        int[] a = {1,8,3,4,5,7};
        int target = 5;

        for (int value : a) {
            if (value == target) {
                System.out.println(value);
            }
        }
    }
}
