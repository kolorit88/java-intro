import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class make_instTest {

    @Test
    void reverser() {
        assertEquals("llatsni ekam", make_inst.reverser("make install"));
    }
}