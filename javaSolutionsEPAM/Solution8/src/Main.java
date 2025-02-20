

public class Main {
    public static void main(String[] args)
    {
        String str = "Строка для посчета количества гласный и согласных звуков в предложении. Поиск будет происходить в каждом предложении.";
        String[] sentences = str.split("[.!?]");
        int vowels = 0;
        int consonants = 0;
        for(String sentence : sentences)
        {
            vowels = vowelsCount(sentence);
            consonants = consonantsCount(sentence);
            System.out.printf("Предложение: %s" +
                    "\nКоличество гласных в предложении: %d" +
                    "\nКоличество согласных в предложении %d",
                    sentence.trim(), vowels, consonants);
            System.out.println();
            if(vowels > consonants) System.out.println("Гласных больше чем согласных!");
            else if(consonants > vowels) System.out.println("Согласных больше чем гласных!");
            else System.out.println("Гласных и согласных одинаковое количество");
        }
    }
    public static int vowelsCount(String input)
    {
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        int count = 0;
        for(char letter : input.toCharArray())
        {
            if(vowels.indexOf(letter) != -1)
                count++;
        }
        return count;
    }

    public static int consonantsCount(String input)
    {
        String consonants = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ";
        int count = 0;
        for(char letter : input.toCharArray())
        {
            if(consonants.indexOf(letter) != -1)
                count++;
        }
        return count;
    }
}