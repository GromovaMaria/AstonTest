import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: "); // Алгоритм 1
        int num = in.nextInt();
        
        if (num > 7) {
            System.out.println("Привет");
        }

        in.nextLine();

        System.out.print("Введите имя: "); // Алгоритм 2
        String name = in.nextLine();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        System.out.print("Введите элементы массива через пробел: "); // Алгоритм 3
        String[] elements = in.nextLine().split(" ");
        int[] array = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }

        in.close();
    }
}
