import java.util.Scanner;

public class Main {
    public int linearSearch(int value, int[] array) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Main search = new Main();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int value = scanner.nextInt();
        System.out.println(search.linearSearch(value, array));
    }
}
