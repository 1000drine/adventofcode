package dev.vinyard.aoc.plugins.solution.api;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Interface for the solutions.
 * @param <T> Return type of the solution.
 */
public interface Solution<T> {

    /**
     * Implement your solution here.
     * @param input Content of the input file (the puzzle).
     * @return The solution.
     */
    T solve(String input);
}
