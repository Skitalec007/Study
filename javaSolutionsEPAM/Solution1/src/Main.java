import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите размер массива: ");
        int size = in.nextInt();
        int numbers[] = new int[size];
        for(int i = 0; i < size; i++)
        {
            System.out.println("Введите " + i + "-й элемент массива");
            numbers[i] = in.nextInt();
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < size; i++)
            if ((numbers[i] > 99) && (numbers[i] < 1000))
            {
                a = numbers[i] / 10 / 10;
                b = numbers[i] / 10 % 10;
                c = numbers[i] % 100 % 10;
                if (a != b && a != c && b != a && b != c && c != a && c != b)
                    System.out.println("3х-значное число в десятичной записи которых нет одинаковых цифр: " + numbers[i]);
            }
    }
}
