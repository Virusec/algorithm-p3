package example;

public class Main {
    private static void sortBubbles(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    IntegerListImpl.swapElements(array, j, j + 1);
                }
            }
        }
    }

    private static void sortSelection(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            IntegerListImpl.swapElements(array, i, minElementIndex);
        }
    }

    private static void sortInsertion(Integer[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] >= temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }


    public static void main(String[] args) {
        Integer[] integers1 = IntegerListImpl.toRandomArray(100000, 1000, 0);
        Integer[] integers2 = IntegerListImpl.toRandomArray(100000, 1000, 0);
        Integer[] integers3 = IntegerListImpl.toRandomArray(100000, 1000, 0);
        long start1 = System.currentTimeMillis();
        sortBubbles(integers1);
        System.out.println("Сортировка пузырьком - " + (System.currentTimeMillis() - start1));
        long start2 = System.currentTimeMillis();
        sortInsertion(integers2);
        System.out.println("Сортировка вставками - " + (System.currentTimeMillis() - start2));
        long start3 = System.currentTimeMillis();
        sortSelection(integers3);
        System.out.println("Сортировка выбором - " + (System.currentTimeMillis() - start3));
    }
}
