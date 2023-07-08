import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void minMoves2Test1() {
        int[] nums = {1, 2, 3};
        int expected = 2;
        int actual = new Solution().minMoves2(nums);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMoves2Test2() {
        int[] nums = {1, 10, 2, 9};
        int expected = 16;
        int actual = new Solution().minMoves2(nums);

        Assertions.assertEquals(expected, actual);
    }
}
