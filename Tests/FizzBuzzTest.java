/**
 * Tests for the FizzBuzz class
 */

import com.greg.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized.*;

import java.lang.reflect.Executable;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Parameter(0)
    public int p1;

    @Parameter(1)
    public String result;

    private FizzBuzz fizzBuzz;

    @BeforeEach
    private void setup() {
        fizzBuzz = new FizzBuzz();

    }

    @Test()
    void generateFizzBuzz0ThrowsException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            fizzBuzz.generateFizzBuzz(0);
        });
    }

    @Test
    void generateFizzBuzz10ReturnsBuzz() {
        String returnValue = fizzBuzz.generateFizzBuzz(10);
        assertEquals("buzz", returnValue, "Unexpected value returned from FizzBuzz");
    }

    @Test
    void generateFizzBuzz33ReturnsFizz() {
        String returnValue = fizzBuzz.generateFizzBuzz(33);
        assertEquals("fizz", returnValue, "Unexpected value returned from FizzBuzz");
    }

    @Test
    void generateFizzBuzz15ReturnsFizzBuzz() {
        String returnValue = fizzBuzz.generateFizzBuzz(15);
        assertEquals("fizz buzz", returnValue, "Unexpected value returned from FizzBuzz");
    }

    @Test
    void generateFizzBuzz7ReturnsEmptyString() {
        String returnValue = fizzBuzz.generateFizzBuzz(7);
        assertEquals("", returnValue, "Unexpected value returned from FizzBuzz");
    }
}