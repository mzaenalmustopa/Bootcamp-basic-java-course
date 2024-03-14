package mzaenalmustopa.javaunittest;

import mzaenalmustopa.javaunittest.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
// @DisplayName("test from calculator class") // bisa untuk type class dan method
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before Each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each");
    }

    @Test
    public void testAddSuccess() {
        Calculator calculator = new Calculator();
        var result = calculator.add(10, 10);
        assertEquals(20, result);

        // melakukan pengecekan secara manual
//        if (result != 20){
//            throw new RuntimeException("Test gagal");
//        }
    }

    @Test
    public void testDivideSuccess() {
        var result = calculator.divide(100, 10);
        assertEquals(10, result);
    }

    @Test
    public void testDivideFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    @Disabled
        // untuk menyembunyikan test
    void testComingSoon() {

    }

    @Test
    public void testAborted() {
        var profile = System.getenv("PROFILE");
        if (!"DEV".equals(profile)) {
            // untuk membtalkan test gunakan test aborted exception
            throw new TestAbortedException("Test di batalkan karena bukan DEV");
        }

        // unit test untuk DEV
    }

    @Test
    public void testAssumptions() {
        assumeTrue("DEV".equals(System.getenv("PROFILE")));

        // dev unit test
    }
}
