package com.algo.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveNumberTests {

    @Test
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
    public void shoudReturn6() {
        // ARRANGE
        final int[] numbersArray = new int[]{ 0, 3, 7, 2, 5, 2, 4, 4, 0, 1 };

        // ACT
        final var manager = new LongestConsecutiveNumber();
        final var actual = manager.longestConsecutive(numbersArray);

        // ASSERT
        assertEquals(6, actual);

    }
}