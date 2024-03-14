package mzaenalmustopa.javaunittest;

import org.junit.jupiter.api.*;

import java.util.Random;


public class RandomCalculatorTest extends AbstractCalculatorTest {


    @Test
    void testRandom(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test Random calculator")
    @RepeatedTest(
            value = 10,
            name = "{displayName} Ke {currentRepetition} dari {totalRepetitions}"
    )
    void testRandomRepeat(Random random, TestInfo testInfo) {
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }
}
