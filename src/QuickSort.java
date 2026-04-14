import java.util.Random;

public class QuickSort {

    private static final Random random = new Random();

    // Sorts the array using the first element as pivot
    public static void sortFirst(int[] array, int low, int high) {
        int[] stack = new int[high - low + 1];
        int top = -1;

        stack[++top] = low;
        stack[++top] = high;

        while (top >= 0) {
            high = stack[top--];
            low = stack[top--];

            if (low < high) {
                int pivot = partitionFirst(array, low, high);
                if (pivot - 1 > low) {
                    stack[++top] = low;
                    stack[++top] = pivot - 1;
                }
                if (pivot + 1 < high) {
                    stack[++top] = pivot + 1;
                    stack[++top] = high;
                }
            }
        }
    }
    // Selects the first element as pivot and moves it to the end before partitioning
    private static int partitionFirst(int[] array, int low, int high) {
        int pivot = array[low];
        swap(array, low, high);
        return partition(array, low, high, pivot);
    }

    // Sorts the array using the last element as pivot
    public static void sortLast(int[] array, int low, int high) {
        int[] stack = new int[high - low + 1];
        int top = -1;

        stack[++top] = low;
        stack[++top] = high;

        while (top >= 0) {
            high = stack[top--];
            low = stack[top--];

            if (low < high) {
                int pivot = partitionLast(array, low, high);
                if (pivot - 1 > low) {
                    stack[++top] = low;
                    stack[++top] = pivot - 1;
                }
                if (pivot + 1 < high) {
                    stack[++top] = pivot + 1;
                    stack[++top] = high;
                }
            }
        }
    }
    // Selects the last element as pivot and partitions the array around it
    private static int partitionLast(int[] array, int low, int high) {
        int pivot = array[high];
        return partition(array, low, high, pivot);
    }

    // Sorts the array using the middle element as pivot
    public static void sortMiddle(int[] array, int low, int high) {
        int[] stack = new int[high - low + 1];
        int top = -1;

        stack[++top] = low;
        stack[++top] = high;

        while (top >= 0) {
            high = stack[top--];
            low = stack[top--];

            if (low < high) {
                int pivot = partitionMiddle(array, low, high);
                if (pivot - 1 > low) {
                    stack[++top] = low;
                    stack[++top] = pivot - 1;
                }
                if (pivot + 1 < high) {
                    stack[++top] = pivot + 1;
                    stack[++top] = high;
                }
            }
        }
    }
    // Selects the middle element as pivot and moves it to the end before partitioning
    private static int partitionMiddle(int[] array, int low, int high) {
        int mid = low + (high - low) / 2;
        int pivot = array[mid];
        swap(array, mid, high);
        return partition(array, low, high, pivot);
    }

    // Sorts the array using a randomly selected element as pivot
    public static void sortRandom(int[] array, int low, int high) {
        int[] stack = new int[high - low + 1];
        int top = -1;

        stack[++top] = low;
        stack[++top] = high;

        while (top >= 0) {
            high = stack[top--];
            low = stack[top--];

            if (low < high) {
                int pivot = partitionRandom(array, low, high);
                if (pivot - 1 > low) {
                    stack[++top] = low;
                    stack[++top] = pivot - 1;
                }
                if (pivot + 1 < high) {
                    stack[++top] = pivot + 1;
                    stack[++top] = high;
                }
            }
        }
    }
    // Selects a random element as pivot to avoid worst-case scenarios
    private static int partitionRandom(int[] array, int low, int high) {
        int randIndex = low + random.nextInt(high - low + 1);
        int pivot = array[randIndex];
        swap(array, randIndex, high);
        return partition(array, low, high, pivot);
    }

    // Sorts the array using the median of first, middle, and last elements as pivot
    public static void sortMedian(int[] array, int low, int high) {
        int[] stack = new int[high - low + 1];
        int top = -1;

        stack[++top] = low;
        stack[++top] = high;

        while (top >= 0) {
            high = stack[top--];
            low = stack[top--];

            if (low < high) {
                int pivot = partitionMedian(array, low, high);
                if (pivot - 1 > low) {
                    stack[++top] = low;
                    stack[++top] = pivot - 1;
                }
                if (pivot + 1 < high) {
                    stack[++top] = pivot + 1;
                    stack[++top] = high;
                }
            }
        }
    }
    // Selects the median of three elements as pivot for balanced partitioning
    private static int partitionMedian(int[] array, int low, int high) {
        int mid = low + (high - low) / 2;
        if (array[low] > array[mid]) {
            swap(array, low, mid);
        }
        if (array[low] > array[high]) {
            swap(array, low, high);
        }
        if (array[mid] > array[high]) {
            swap(array, mid, high);
        }
        int pivot = array[mid];
        swap(array, mid, high);
        return partition(array, low, high, pivot);
    }
    // Partitions the array around the given pivot and returns the pivot index
    private static int partition(int[] array, int low, int high, int pivot) {
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }
    // Swaps two elements in the array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}