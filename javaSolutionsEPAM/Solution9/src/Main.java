import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String filePath = "numbers.txt"; // Путь к файлу
        try {
            getFromFile(filePath);
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: Файл не найден.");
        } catch (OutOfMemoryError e) {
            System.err.println("Ошибка: Недостаточно памяти.");
        } catch (numberExeption e) {
            System.err.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Неизвестная ошибка: " + e.getMessage());
        }
    }
    public static void getFromFile(String path) throws FileNotFoundException, numberExeption
    {
        File file = new File(path);
        Scanner in = new Scanner(file);
        float summ = 0;
        int count = 0;
        while(in.hasNextLine())
        {
            String line = in.nextLine().trim();
            if(line.isEmpty()) continue;
            String[] splt = line.split(";");
            if(splt.length != 2) throw new numberExeption("Неизвестный формат строки: " + line);
            String number = splt[0].trim();
            String localestr = splt[1].trim();
            try
            {
                Locale locale = Locale.forLanguageTag(localestr);
                NumberFormat format = NumberFormat.getInstance(locale);
                Number num = format.parse(number);
                double value = num.doubleValue();

                if(Double.isInfinite(value) || Double.isNaN(value))
                    throw new numberExeption("Недопустимое значение: " + value);
                summ += value;
                count++;
            } catch (ParseException e) {
                throw new numberExeption("Некоректное число: " + number);
            }
        }
        in.close();
        if(count == 0) System.out.println("В файле нет корректных чисел");
        else System.out.println("Сумма: " + summ + "\nСреднее значение: " + (summ/count));

    }
}