import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class equationsTest {

    @Test
    void equations_method() {
        assertEquals("x1 = 7.0\nx2 = -3.0", equations.equations_method(1, -4, -21));
        assertEquals("Нет вещественных корней", equations.equations_method(1, -4, 4));
    }
}