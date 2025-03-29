package com.fundamentals.java;

import java.util.*;
import java.util.function.Predicate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "", "Lambda", "", "Filter");
        Predicate<String> nonEmpty = String::isEmpty;
        long count = words
                .stream()
                .filter(nonEmpty.negate())
                .count();


    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            boolean flag = true;
            while (!st.isEmpty() && i < asteroids.length && st.peek() > 0 && asteroids[i] < 0) {
                if (Math.abs(asteroids[i]) == Math.abs(st.peek())) {
                    flag = false;
                    st.pop();
                    i++; // Move to the next asteroid as both are destroyed
                } else if (Math.abs(asteroids[i]) > Math.abs(st.peek())) {
                    st.pop(); // Destroy the asteroid on the stack
                } else {
                    flag = false; // Current asteroid is destroyed
                }
            }
            if (flag && i < asteroids.length) {
                st.push(asteroids[i]);
            }
        }
        int[] result = new int[st.size()];

        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }

    public int[] findXSum(int[] nums, int k, int x) {
        int[] result = new int[nums.length - k + 1];
        // Iterate over all subarrays of length k
        for (int i = 0; i <= nums.length - k; i++) {
            int[] subArray = Arrays.copyOfRange(nums, i, i + k);
            System.arraycopy(nums, i, subArray, 0, k);
            result[i] = calculateXSum(subArray, x);
        }
        return result;
    }

    private int calculateXSum(int[] arr, int x) {
        // Count the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // Use a max heap to get the top x frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> a.getValue().equals(b.getValue()) ? b.getKey() - a.getKey() : b.getValue() - a.getValue()
        );

        // Add frequency entries to the max heap
        maxHeap.addAll(frequencyMap.entrySet());

        int sum = 0;
        // Extract the top x elements from the max heap
        for (int i = 0; i < x && !maxHeap.isEmpty(); i++) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            sum += entry.getKey() * entry.getValue(); // Add the element multiplied by its frequency
        }

        return sum;
    }
}