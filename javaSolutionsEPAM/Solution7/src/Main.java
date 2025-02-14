import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        String str = "Какой-то набранный текст для проверки работоспособности программы";
        int L = 50;
        int N = 3;
        int M = 4;
        String result = processString(str, N, L, M);
        System.out.println(result);
    }
    public static String processString(String str, int N, int L, int M)
    {
        java.util.function.Function<String, String> process = string ->
        {
            String[] words = string.split(" ");
            if(words.length > M)
                words = Arrays.copyOf(words, M);
            String processedString = Arrays.stream(words).map(word -> word + ", ").collect(Collectors.joining(" "));
            if(processedString.length() > L)
                processedString = processedString.substring(0, L);
            return processedString;
        };
        String processedString = process.apply(str);
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < N; i++)
            res.append(processedString).append("\n");
        return res.toString();
    }
}