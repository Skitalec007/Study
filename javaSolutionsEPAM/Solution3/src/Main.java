//
//        ╭━╮┈╭━╮┈┈┈┈┈╭━╮
//        ┃╭╯┈┃┊┗━━━━━┛┊┃
//        ┃╰┳┳┫┏━▅╮┊╭━▅┓┃
//        ┃┫┫┫┫┃┊▉┃┊┃┊▉┃┃
//        ┃┫┫┫╋╰━━┛▅┗━━╯╋
//        ┃┫┫┫╋┊┊┊┣┻┫┊┊┊╋
//        ┃┊┊┊╰┈┈┈┈┈┈┈┳━╯
//        ┃┣┳┳━━┫┣━━┳╭╯
//
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите количество автобусов:");
        int count = in.nextInt();
        Buses buses = new Buses(count);
        for (Bus bus : buses.getBuses()) System.out.println(bus);
        System.out.println("Укажите номер маршрута: ");
        String route = in.next();
        System.out.println("\n------------------------------");
        System.out.printf("\nСписок автобусов %s маршрута:", route);
        System.out.println("------------------------------");
        Bus[] busesRoute = buses.filterByRoute(route);
        for (Bus bus : busesRoute) System.out.println(bus);
        System.out.println("Укажите срок экстплуатации: ");
        int year = in.nextInt();
        System.out.println("\n------------------------------------------------");
        System.out.printf("\nСписок автобусов, эксплуатирующихся более %d лет:", year);
        System.out.println("------------------------------------------------");
        Bus[] busesAge = buses.filterByAge(year);
        for (Bus bus : busesAge) System.out.println(bus);
        System.out.println("Укажите пробег: ");
        int miliage = in.nextInt();
        System.out.println("\n---------------------------------------------");
        System.out.printf("\nСписок автобусов с пробегом более %d км:", miliage);
        System.out.println("---------------------------------------------");
        Bus[] busesMileage = buses.filterByMileage(miliage);
        for (Bus bus : busesMileage) System.out.println(bus);
        }
    }

