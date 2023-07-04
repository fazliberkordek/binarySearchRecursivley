/**
 * @author fazliberkordek
 */
//This is a binary search implemantaion with java

public class Solution {

    //We can implement recursively or iteratively

    //1-Lets do the Recursively first :
    public static boolean binarySearchRecursiveley(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (array[mid] == x) {
                return true;
            } else if (x < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return false;
    }

    public static boolean binarySearchRecursiveley(int[] array, int x) {
        return binarySearchRecursiveley(array, x, 0, array.length - 1);
    }
}


public static class Main {
    public static void main(String[] args) {

    }
}

}
