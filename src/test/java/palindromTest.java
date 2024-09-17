import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class palindromTest {

    @Test
    void is_pal() {
        assertEquals(true, palindrom.is_pal("a roza ypala na lapy azora".replaceAll(" ", "")));
    }
}