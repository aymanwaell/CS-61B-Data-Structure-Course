import org.Ayman.Sort;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortTest {

    @Test
    public void testSort() {
        String[] input = {"rawr", "a", "zaza", "newway"};
        String[] expected = {"a", "newway", "rawr", "zaza"};
        Sort.sort(input);
        assertThat(input).isEqualTo(expected);
    }

    @Test
    public void testFindSmallest() {
        String[] input = {"tezo", "a", "bezo", "fekhado"};
        int expected = 1;
        int actual = Sort.findSmallest(input, 0);
        assertThat(actual).isEqualTo(expected);

        expected = 3;
        actual = Sort.findSmallest(input, 2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testSwap() {
        String[] input = {"a", "tezo", "bezo", "fekhado"};
        String[] expected = {"fekhado", "tezo", "bezo", "a"};
        String[] actual = Sort.swap(input, 0, 3);
        assertThat(actual).isEqualTo(expected);
    }
}
