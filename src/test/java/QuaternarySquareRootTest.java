import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuaternarySquareRootTest {
    @Test
    void testQuaternarySquareRoot() {
        Quaternary quaternary = new Quaternary();
        int qTestOne = 21;
        int qTestTwo = 1000;
        int qSquareRootOne = quaternary.quaternarySquareRoot(qTestOne);
        int qSquareRootTwo = quaternary.quaternarySquareRoot(qTestTwo);
        Assertions.assertEquals(3, qSquareRootOne);
        Assertions.assertEquals(20, qSquareRootTwo);
    }
}
