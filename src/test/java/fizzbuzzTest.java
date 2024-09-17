import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fizzbuzzTest {
    @Test
    void fizzbuzz() {
        assertEquals("fizz", fizzbuzz.fizzbuzz(5));
        assertEquals("buzz", fizzbuzz.fizzbuzz(7));
        assertEquals("1", fizzbuzz.fizzbuzz(1));
        assertEquals("fizzbuzz", fizzbuzz.fizzbuzz(490));
    }
}