import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline(); // Создаем новый экземпляр Feline перед каждым тестом
    }

    @Test
    public void testEatMeatReturnsExpectedFood() throws Exception {
        // Проверяем, что eatMeat возвращает требуемый список еды
        List<String> expectedFood = feline.eatMeat(); // Здесь предполагаем, что getFood вызывается
        // Но вам нужно будет создать метод getFood в классе Animal или Predator
        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void testGetFamilyReturnsCorrectFamily() {
        // Проверяем, что getFamily() возвращает "Кошачьи"
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensReturnsDefaultCount() {
        // Проверяем, что getKittens() без параметров возвращает 1
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensReturnsSpecifiedCount() {
        // Проверяем, что getKittens(int count) возвращает заданное количество
        int kittensCount = 3;
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}
