import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBinOps {

    @Test
    public void TestedBinOps () {

        BinOps testedBinOps = new BinOps();

        //тест умножения
        String testMult = testedBinOps.mult("111", "11"); //111 (7) * 11 (3) = 10101 (21)

        Assertions.assertEquals(testMult, "10101");

        //тест суммы
        String testSum = testedBinOps.sum("111", "11"); //111 (7) + 11 (3) = 1010 (10)

        Assertions.assertEquals(testSum, "1010");

    }
}
