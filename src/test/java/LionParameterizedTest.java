import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LionParameterizedTest {

    @Mock
    Feline feline;

    @ParameterizedTest
    @MethodSource("testData")
    public void hasManeTest(String sex, boolean hasMane) throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(hasMane, actualHasMane, "Наличие гривы не соотвествует полу");
    }

    public static Object[][] testData() {
        Object[][] objects = {
                {"Самец", true},
                {"Самка", false}
        };
        return objects;
    }

}
