package com.algo.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveNumberTests {

    @Test
    @DisplayName("Should return 4")
    public void shouldReturn4() {
        // ARRANGE
        final int[] numbersArray = new int[]{ 100, 4, 200, 1, 3, 2 };

        // ACT
        final var manager = new LongestConsecutiveNumber();
        final var actual = manager.longestConsecutive(numbersArray);

        // ASSERT
        assertEquals(4, actual);
    }

    @Test
    @DisplayName("Should return 9")
    public void shoudReturn9() {
        // ARRANGE
        final int[] numbersArray = new int[]{ 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

        // ACT
        final var manager = new LongestConsecutiveNumber();
        final var actual = manager.longestConsecutive(numbersArray);

        // ASSERT
        assertEquals(9, actual);

    }

    @Test
    @DisplayName("Should return 0")
    public void shoudReturn0() {
        // ARRANGE
        final int[] numbersArray = new int[]{};

        // ACT
        final var manager = new LongestConsecutiveNumber();
        final var actual = manager.longestConsecutive(numbersArray);

        // ASSERT
        assertEquals(0, actual);
    }
}