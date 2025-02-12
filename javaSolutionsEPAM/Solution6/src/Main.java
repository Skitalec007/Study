import java.util.Arrays;
import java.util.Currency;
import java.util.Scanner;

public class Main
{
    static int count = 0;
    static String answer = "";
    static String duration = "";
    static String  type = "";
    static double amount = 0;
    static String currency = "";
    static double percentRate = 0;
    static boolean menuMode = true;
    static int action = 1;
    public static void main(String[] args)
    {
        System.out.println("|--------------------|");
        System.out.println("| Добро пожаловать   |");
        System.out.println("|--------------------|");

        Scanner in = new Scanner(System.in);
        System.out.printf("В базе %d вкладов, создать новый? (Да(Yes), Нет(No)): ", count);
        answer = in.next();
        if(answer.equals("Да") || answer.equals("Yes"))
        {
            System.out.println("Сколько вкладов будем создавать? ");
            count = in.nextInt();
            Deposits[] deposits = new Deposits[count];
            if(count == 0) System.out.println("Отменено! выход из программы.");
            System.out.println("Укажите: ");
            for(int i = 0; i < deposits.length; i++)
            {
                    System.out.printf("========================================" +
                            "\n%d - ый вклад", i+1);
                    System.out.print("\nПродолжительсть вклада (бессрочный/долгосрочный/краткосрочный): ");
                    duration = new Scanner(System.in).next();
                    System.out.print("\nВид вклада (отзывной/безотзывной): ");
                    type = new Scanner(System.in).next();
                    System.out.print("\nСумму вклада: ");
                    amount = new Scanner(System.in).nextDouble();
                    System.out.print("\nВалюту: ");
                    currency = new Scanner(System.in).next();
                    System.out.print("\nПроцентную ставку: ");
                    percentRate = new Scanner(System.in).nextDouble();
                    deposits[i] = new Deposits(duration, type, amount, currency, percentRate);

            }
            System.out.printf("Успешно ! создан(о) %d вклад(ов)\n", deposits.length);
            while(getMenuMode())
            {
            System.out.println("Операции по вкладам:" +
                    "\n1. получить список вкладов" +
                    "\n2. изменить продолжительность вклада" +
                    "\n3. изменить валюту (закрыть текущий вклад и открыть новый)" +
                    "\n4. расчитать начисление процентов по вкладу");
            answer = in.next();
                    switch (answer)
                    {
                        case "1":
                        {
                            System.out.println("Список вкладов: ");
                            for (int i = 0; i < deposits.length; i++)
                                System.out.println(deposits[i] + "\n");
                            getMenuMode();
                        }
                        case "2":
                        {
                            System.out.println("Укажите номер вклада: ");
                            int numberDeposit = in.nextInt();
                            System.out.println("Укажите новую продолжительность " +
                                    "\n(бессрочный/долгосрочный/краткосрочный): ");
                            duration = in.next();
                            deposits[numberDeposit-1].setDepositType(duration);
                            System.out.println("Успех ! Изменено");
                            getMenuMode();
                        }
                        case "3":
                        {
                            System.out.println("Укажите номер вклада: ");
                            int numberDeposit = in.nextInt();
                            System.out.println("Укажите новую валюту: ");
                            currency = in.next();
                            deposits[numberDeposit-1].changeCurrency(currency);
                            System.out.println("Успех ! Изменено");
                            getMenuMode();
                        }
                        case "4":
                        {
                            System.out.println("Укажите номер вклада: ");
                            int numberDeposit = in.nextInt();
                            System.out.println("Укажите номер протяженность лет: ");
                            int age = in.nextInt();
                            double interest = deposits[numberDeposit-1].calculate(age);
                            System.out.printf("Начисленные процента за %d год(а/лет): %f\n", age, interest);
                            getMenuMode();
                        }
                    }
            }
        }

    }
    static public boolean getMenuMode()
    {
        System.out.println("Открыть меню операций по вкладам (1-да, 0-нет)?");
        answer = "";
        action = new Scanner(System.in).nextInt();
        if(action == 1)
        {
            menuMode = true;
        }
        else
        {
            System.out.println("Возврат в меню отменен! Закрытие программы!");
            menuMode = false;
        }
        return menuMode;
    }
}