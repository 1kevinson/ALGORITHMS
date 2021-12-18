package com.algo.app;

import java.util.Arrays;
import java.util.stream.IntStream;

// 18/12/2021 - 13:33 | Note : Garder ce bout de code pour l'article sur les nested class
public class LongestConsecutiveNumber {

    int counter = 1;

    public int longestConsecutive(int[] numbers) {
        final var algorithms = new AlgoTools();
        algorithms.getConsecutiveNumbers(numbers);

        return this.counter;
    }

    private class AlgoTools {

        private void getConsecutiveNumbers(int[] numbers) {
            final var reversedSortedArray = this.sortedAndReverse(numbers);

            for (int i = reversedSortedArray.length - 1; i > 0; i--) {
                if (reversedSortedArray[i] == reversedSortedArray[i - 1]) {
                    LongestConsecutiveNumber.this.counter = LongestConsecutiveNumber.this.counter;
                    continue;
                }

                if (reversedSortedArray[i] + 1 == reversedSortedArray[i - 1]) {
                    LongestConsecutiveNumber.this.counter++;
                } else {
                    break;
                }
            }
        }

        private int[] sortedAndReverse(int[] arrayOfNumbers) {
            Arrays.sort(arrayOfNumbers);
            return IntStream.rangeClosed(1, arrayOfNumbers.length)
                    .map(arrayElement -> arrayOfNumbers[arrayOfNumbers.length - arrayElement])
                    .toArray();
        }

    }
}


