public class BubbleSort {
    public static void main(String[] args) {
        // Наш массив для проверки
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("До сортировки: ");
        printArray(numbers);

        // Запуск алгоритма
        bubbleSort(numbers);

        System.out.println("\nПосле сортировки (по возрастанию): ");
        printArray(numbers);
    }

    // Логика сортировки
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Если текущий элемент больше следующего — меняем их местами
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Вспомогательный метод для вывода массива
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}