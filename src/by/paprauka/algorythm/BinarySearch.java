package by.paprauka.algorythm;

public class BinarySearch {

    public static void main(String[] args) {
        var array = generateArray(10);
        var aimElement = 7;

        long start = System.currentTimeMillis();
        var i = lenearSearch(array, aimElement);
        System.out.println(i);
        long finish = System.currentTimeMillis();
        System.out.println("Линейный выполнился за: " + (finish - start) + " милисекунд");

        long start2 = System.currentTimeMillis();
        var i1 = binarySearch(array, aimElement);
        System.out.println(i1);
        long finish2 = System.currentTimeMillis();
        System.out.println("Бинарный выполнился за: " + (finish2 - start2) + " милисекунд");
    }

    private static int binarySearch(int arr[], int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex < lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (arr[middleIndex] > elementToSearch) {
                lastIndex = middleIndex;
            } else {
                firstIndex = middleIndex;
            }
        }

        return -1;
    }

    private static int lenearSearch(int arr[], int elementToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

    private static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }
}
