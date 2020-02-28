import static org.junit.jupiter.api.Assertions.*;

class OrchestraTest {
    Orchestra orchestra;
    Musician m;

    @org.junit.jupiter.api.BeforeEach
    void setUp() throws Exception {
        orchestra = Orchestra.getInstance();
        m = MusicianFactory.createMusician("Bob", "piano");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void addMusician() {
        orchestra.addMusician(m);
        assertEquals(orchestra.musicians.size(), 1);
    }

    @org.junit.jupiter.api.Test
    void removeMusician() {
        orchestra.removeMusician(m);
        assertEquals(orchestra.musicians.size(), 0);
    }

    @org.junit.jupiter.api.Test
    void addPartition() {
        orchestra.addPartition(new Partition("p1", 'G'));
        assertEquals(orchestra.partitions.size(), 1);
    }
}