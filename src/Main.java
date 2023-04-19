import java.util.Scanner;

public class Main {
    // Реализация алгоритма линейного поиска
    public int linearSearch(int value, int[] array) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == value){ // Если значение найдено
                return i; // Возвращаем индекс первого вхождения
            }
        }
        return -1; // Иначе возвращаем -1
    }

    public static void main(String[] args) {
        Main search = new Main(); // Создаем экземпляр класса
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для ввода данных от пользователя

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt(); // Читаем размер массива
        System.out.print("Введите элементы массива: ");
        int[] array = new int[size]; // Создаем массив заданного размера
        for (int i = 0; i < size; i++){ // Заполняем массив данными, введенными пользователем
            array[i] = scanner.nextInt();
        }

        System.out.print("Введите значение, которое необходимо найти: ");
        int value = scanner.nextInt(); // Читаем значение, которое необходимо найти

        System.out.println("Результат поиска: " + search.linearSearch(value, array)); // Ищем значение в массиве и выводим результат в консоль
    }
}