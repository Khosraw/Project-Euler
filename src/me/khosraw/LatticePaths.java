package me.khosraw;

public class LatticePaths {
    public static void main (String[] args) {
        int gridSize = 20;
        long paths = 1;

        for (int i = 0; i < gridSize; i++) {
            paths *= (2 * gridSize) - i;
            paths /= i + 1;
        }

        System.out.println(paths);
    }
}
