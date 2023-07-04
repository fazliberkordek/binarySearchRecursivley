/**
 * @author fazliberkordek
 */
//This is a binary search implemantaion with java
import java.text.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
public class Solution{

    //We can implement recursively or iteratively

    //1-Lets do the Recursively firs :
    public static boolean binarySearchRecursiveley(int[] array,int x,int left,int right){
        if(left > right){
            return false;
        }
        int mid  = (left + right)/2;
        if (array[mid]==x){
            return true;
        }else if (x<array[mid]){
            return binarySearchRecursiveley(array,x,left,mid-1);
        }else {
            return binarySearchRecursiveley(array,mid + 1,left,right);
        }

      }
      public static boolean binarySearchRecursiveley(int[] array,int x){
        return binarySearchRecursiveley(array,x,0,array.length-1);
      }

    public static class Main {
        public static void main(String[] args) {

        }
    }

}
