import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private Feline feline;
    private Lion lion;

    @Before
    public void setUp() throws Exception {
        feline = Mockito.mock(Feline.class);
        lion = new Lion("Самец", feline);
    }

    @Test
    public void testDoesHaveMane() {
        assertTrue(lion.doesHaveMane()); // Проверка наличия гривы у самца
    }

    @Test
    public void testGetKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(2);
        assertEquals(2, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Мясо"));
        List<String> food = lion.getFood();
        assertEquals(List.of("Мясо"), food);
    }

    @Test
    public void shouldThrowExceptionForInvalidSex() {
        // Проверяем, что при передаче некорректного значения пола будет выброшено исключение
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Неизвестно", feline); // Здесь ожидается исключение
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}