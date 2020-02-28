import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicianFactoryTest {
    Musician m;

    @Test
    void createMusician() throws Exception {
        m = MusicianFactory.createMusician("Bob", "piano");
        assertEquals(m.name,"Bob");
    }

    /*
    @Test
    void createMusicianWithUnknownInstrument() throws Exception {
        m = MusicianFactory.createMusician("Bob", "guitar");
        assertEquals(m.name,"Bob");
    }
     */
}