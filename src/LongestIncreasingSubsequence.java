import java.util.Stack;

/**
 * Created by Natig on 7/6/16.
 * This is my solution for finding longest increasing subsequence inside array
 * I implemented Stack
 * This is quick code, so, before using it check if it needs your needs
 * This is question of job interview not E-Olymp
 */

public class LongestIncreasingSubsequence {
    public static void main(String args[]) {
        int arr1[] = {1, 12, 7, 0, 23, 11, 52, 31, 61, 69, 70, 2};
        int arr2[] = {6, 1, 5, 2, 9};
        int arr3[] = {6, 1};
        System.out.println(longestIncreasingSubsequence(arr1).toString());
        System.out.println(longestIncreasingSubsequence(arr2).toString());
        System.out.println(longestIncreasingSubsequence(arr3).toString());
    }

    public static Stack<Integer> longestIncreasingSubsequence(int arr[]) {
        Stack<Integer> res = new Stack<Integer>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (res.isEmpty() && arr[i] < arr[i + 1]) {
                res.push(arr[i]);
                res.push(arr[i + 1]);
            } else if (!res.isEmpty() && arr[i + 1] > res.peek()) {
                res.push(arr[i + 1]);
            }
        }
        return res;
    }
}
