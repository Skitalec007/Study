import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++)
        {
            System.out.printf("Введите %d-ый элемент: ", i);
            array[i] = in.nextInt();
        }
        System.out.println("Массив заполнен!\n Вывод элементов в обратном порядке:");
        for(int i = array.length-1; i >= 0; i--)
        {
            System.out.println(array[i] + " ");
        }

    }
}