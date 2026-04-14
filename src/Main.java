import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        int[] random = FileOperations.readFromFile("random.txt");
        int[] semiOrdered = FileOperations.readFromFile("semi_ordered.txt");

        int n = 1000000;
        int[] increasing = new int[n];
        int[] decreasing = new int[n];

        for (int i = 0; i < n; i++) {
            increasing[i] = i + 1;
            decreasing[i] = n - i;
        }

        System.out.println("===== TIM SORT =====");

        long start = System.currentTimeMillis();
        TimSort.sort(Arrays.copyOf(random, random.length));
        long end = System.currentTimeMillis();
        System.out.println("TimSort - Random: " + (end - start) + " ms");
        FileOperations.writeToFile("timsort_random_out.txt", Arrays.copyOf(random, random.length));

        start = System.currentTimeMillis();
        TimSort.sort(Arrays.copyOf(semiOrdered, semiOrdered.length));
        end = System.currentTimeMillis();
        System.out.println("TimSort - Semi-Ordered: " + (end - start) + " ms");
        FileOperations.writeToFile("timsort_semi_ordered_out.txt", Arrays.copyOf(semiOrdered, semiOrdered.length));

        start = System.currentTimeMillis();
        TimSort.sort(Arrays.copyOf(increasing, n));
        end = System.currentTimeMillis();
        System.out.println("TimSort - Increasing: " + (end - start) + " ms");
        FileOperations.writeToFile("timsort_increasing_out.txt", Arrays.copyOf(increasing, n));

        start = System.currentTimeMillis();
        TimSort.sort(Arrays.copyOf(decreasing, n));
        end = System.currentTimeMillis();
        System.out.println("TimSort - Decreasing: " + (end - start) + " ms");
        FileOperations.writeToFile("timsort_decreasing_out.txt", Arrays.copyOf(decreasing, n));

        System.out.println("\n===== QUICK SORT =====");

        // first
        start = System.currentTimeMillis();
        QuickSort.sortFirst(Arrays.copyOf(random, random.length), 0, random.length - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (first) - Random: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_first_random_out.txt", Arrays.copyOf(random, random.length));

        start = System.currentTimeMillis();
        QuickSort.sortFirst(Arrays.copyOf(semiOrdered, semiOrdered.length), 0, semiOrdered.length - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (first) - Semi-Ordered: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_first_semi_ordered_out.txt", Arrays.copyOf(semiOrdered, semiOrdered.length));

        start = System.currentTimeMillis();
        QuickSort.sortFirst(Arrays.copyOf(increasing, n), 0, n - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (first) - Increasing: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_first_increasing_out.txt", Arrays.copyOf(increasing, n));

        start = System.currentTimeMillis();
        QuickSort.sortFirst(Arrays.copyOf(decreasing, n), 0, n - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (first) - Decreasing: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_first_decreasing_out.txt", Arrays.copyOf(decreasing, n));

        // last
        start = System.currentTimeMillis();
        QuickSort.sortLast(Arrays.copyOf(random, random.length), 0, random.length - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (last) - Random: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_last_random_out.txt", Arrays.copyOf(random, random.length));

        start = System.currentTimeMillis();
        QuickSort.sortLast(Arrays.copyOf(semiOrdered, semiOrdered.length), 0, semiOrdered.length - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (last) - Semi-Ordered: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_last_semi_ordered_out.txt", Arrays.copyOf(semiOrdered, semiOrdered.length));

        start = System.currentTimeMillis();
        QuickSort.sortLast(Arrays.copyOf(increasing, n), 0, n - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (last) - Increasing: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_last_increasing_out.txt", Arrays.copyOf(increasing, n));

        start = System.currentTimeMillis();
        QuickSort.sortLast(Arrays.copyOf(decreasing, n), 0, n - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (last) - Decreasing: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_last_decreasing_out.txt", Arrays.copyOf(decreasing, n));

        // Middle
        start = System.currentTimeMillis();
        QuickSort.sortMiddle(Arrays.copyOf(random, random.length), 0, random.length - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (middle) - Random: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_middle_random_out.txt", Arrays.copyOf(random, random.length));

        start = System.currentTimeMillis();
        QuickSort.sortMiddle(Arrays.copyOf(semiOrdered, semiOrdered.length), 0, semiOrdered.length - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (middle) - Semi-Ordered: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_middle_semi_ordered_out.txt", Arrays.copyOf(semiOrdered, semiOrdered.length));

        start = System.currentTimeMillis();
        QuickSort.sortMiddle(Arrays.copyOf(increasing, n), 0, n - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (middle) - Increasing: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_middle_increasing_out.txt", Arrays.copyOf(increasing, n));

        start = System.currentTimeMillis();
        QuickSort.sortMiddle(Arrays.copyOf(decreasing, n), 0, n - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (middle) - Decreasing: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_middle_decreasing_out.txt", Arrays.copyOf(decreasing, n));

        // random
        start = System.currentTimeMillis();
        QuickSort.sortRandom(Arrays.copyOf(random, random.length), 0, random.length - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (random) - Random: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_random_random_out.txt", Arrays.copyOf(random, random.length));

        start = System.currentTimeMillis();
        QuickSort.sortRandom(Arrays.copyOf(semiOrdered, semiOrdered.length), 0, semiOrdered.length - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (random) - Semi-Ordered: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_random_semi_ordered_out.txt", Arrays.copyOf(semiOrdered, semiOrdered.length));

        start = System.currentTimeMillis();
        QuickSort.sortRandom(Arrays.copyOf(increasing, n), 0, n - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (random) - Increasing: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_random_increasing_out.txt", Arrays.copyOf(increasing, n));

        start = System.currentTimeMillis();
        QuickSort.sortRandom(Arrays.copyOf(decreasing, n), 0, n - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (random) - Decreasing: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_random_decreasing_out.txt", Arrays.copyOf(decreasing, n));

        // median
        start = System.currentTimeMillis();
        QuickSort.sortMedian(Arrays.copyOf(random, random.length), 0, random.length - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (median) - Random: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_median_random_out.txt", Arrays.copyOf(random, random.length));

        start = System.currentTimeMillis();
        QuickSort.sortMedian(Arrays.copyOf(semiOrdered, semiOrdered.length), 0, semiOrdered.length - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (median) - Semi-Ordered: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_median_semi_ordered_out.txt", Arrays.copyOf(semiOrdered, semiOrdered.length));

        start = System.currentTimeMillis();
        QuickSort.sortMedian(Arrays.copyOf(increasing, n), 0, n - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (median) - Increasing: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_median_increasing_out.txt", Arrays.copyOf(increasing, n));

        start = System.currentTimeMillis();
        QuickSort.sortMedian(Arrays.copyOf(decreasing, n), 0, n - 1);
        end = System.currentTimeMillis();
        System.out.println("QuickSort (median) - Decreasing: " + (end - start) + " ms");
        FileOperations.writeToFile("quicksort_median_decreasing_out.txt", Arrays.copyOf(decreasing, n));
    }
}