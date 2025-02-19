import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "Example.java";
        String outputFilePath = "ModifiedProgram.java";

        try {
            String code = readFile(inputFilePath);
            String modifiedCode = replacePublicWithPrivate(code);
            saveToFile(outputFilePath, modifiedCode);
            System.out.println("Изменения сохранены в файл: " + outputFilePath);
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: Файл не найден.");
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
    private static String readFile(String filePath) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        Scanner scanner = new Scanner(new File(filePath));

        while (scanner.hasNextLine()) {
            content.append(scanner.nextLine()).append("\n");
        }
        scanner.close();

        return content.toString();
    }
    private static String replacePublicWithPrivate(String code) {
        String regex = "\\bpublic\\s+(static\\s+)?(\\w+\\s+)?(\\w+\\s*\\([^)]*\\)|\\w+\\s*;)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(code);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String replacement = matcher.group().replace("public", "private");
            matcher.appendReplacement(result, replacement);
        }
        matcher.appendTail(result);

        return result.toString();
    }
    private static void saveToFile(String filePath, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        }
    }
}
