import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuaternarySquareTest {
    @Test
    void testQuaternarySquare() {
        Quaternary quaternary = new Quaternary();
        int qTestOne = 12;
        int qTestTwo = 101;
        int qSquaredOne = quaternary.quaternarySquare(qTestOne);
        int qSquaredTwo = quaternary.quaternarySquare(qTestTwo);
        Assertions.assertEquals(210, qSquaredOne);
        Assertions.assertEquals(10201, qSquaredTwo);
    }
}
