package com.company.test.project;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int result = Solution.countDigit(1234);
        System.out.println(result);
    }

    static class Solution {
        public int findNumbers(int[] nums) {
            int count = 0;
            return 0;
        }

        public static int countDigit(int number) {
            int count = 0;
            while (number != 0) {
                number = number / 10;
                count++;
            }
            return count;
        }
    }
}
