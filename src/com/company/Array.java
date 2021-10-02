package com.company;

import java.util.*;

public class Array {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                profit += prices[i] - prices[i - 1];
        }
        return profit;
    }

    public void rotate(int[] nums, int k) {
        int m = k % nums.length;
        int[] holder = new int[nums.length];
        int j = 0;

        System.arraycopy(nums, 0, holder, 0, nums.length);

        for(int i = m; i < nums.length; i++) {
            nums[i] = holder[j];
            j++;
        }

        for(int i = 0; i < m; i++) {
            nums[i] = holder[holder.length - m + i];
        }
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);

        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }

        return false;
    }

    public int singleNumber(int[] nums) {
        if(nums.length < 1) return 0;
        HashMap<Integer,Integer> numQuants = new HashMap<>();

        for(int num: nums) {
            if(!numQuants.containsKey(num)) numQuants.put(num, 1);
            else numQuants.put(num, numQuants.get(num)+1);
        }

        for(int num: numQuants.keySet()) {
            if(numQuants.get(num) != 2) return num;
        }

        return 0;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        return  nums1;
    }

    public int[] plusOne(int[] digits) {
        long num = 0;
        int pow  = digits.length - 1;

        for(int n : digits) {
            num += n*Math.pow(10,pow);
            System.out.println(num);
            pow--;
        }

        num++;
        double placeholder = num;
        System.out.println("New num: " + num);

        int size = 0;

        if((num/Math.pow(10, digits.length-1)) < 10) {
            size = digits.length;
            pow = digits.length - 1;
        }
        else {
            System.out.println("extra 10s");
            size = digits.length+1;
            pow = digits.length;
        }

        int[] plop = new int[size];
        System.out.println("new num: " + num);
        for(int i = 0; i < plop.length; i++) {
            placeholder = Math.floor(num/Math.pow(10,pow));
            System.out.println("digit: " + placeholder);
            num -= placeholder * Math.pow(10,pow);
            System.out.println("new num: " + num);
            pow--;
            plop[i] = (int)placeholder;
        }

        return plop;
    }

}
