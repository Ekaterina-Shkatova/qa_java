
import com.example.Alex;
import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex(feline);
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        List<String> actualFriends = alex.getFriends();
        assertEquals(expectedFriends, actualFriends, "Не правильные друзья");
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Alex alex = new Alex(feline);
        String expectedPlace = "Нью-Йоркский зоопарк";
        String actualPlace = alex.getPlaceOfLiving();
        assertEquals(expectedPlace, actualPlace, "Не правильное место жительства");
    }

    @Test
    public void getKittensTest() throws Exception {
        Alex alex = new Alex(feline);
        int expectedKittens = 0;
        int actualKittens = alex.getKittens();
        assertEquals(expectedKittens, actualKittens, "Не правильное количество котят");
    }

}