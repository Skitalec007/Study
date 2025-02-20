import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class unitTest
{
    @Test
    void testVowelsCount() {
        // Тест с строкой, содержащей только гласные
        assertEquals(5, Main.vowelsCount("аеиоу"));
        // Тест с строкой, содержащей гласные и согласные
        assertEquals(2, Main.vowelsCount("Привет"));
        // Тест с пустой строкой
        assertEquals(0, Main.vowelsCount(""));
        // Тест с строкой, содержащей только согласные
        assertEquals(0, Main.vowelsCount("бвгд"));
    }

    @Test
    void testConsonantsCount() {
        // Тест с строкой, содержащей только согласные
        assertEquals(5, Main.consonantsCount("бвгдж"));
        // Тест с строкой, содержащей гласные и согласные
        assertEquals(4, Main.consonantsCount("Привет"));
        // Тест с пустой строкой
        assertEquals(0, Main.consonantsCount(""));
        // Тест с строкой, содержащей только гласные
        assertEquals(0, Main.consonantsCount("аеиоу"));
    }

}
