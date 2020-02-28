public class Main {
    public static void main(String[] args) throws Exception {
        Orchestra orchestra = Orchestra.getInstance();

        orchestra.addMusician(MusicianFactory.createMusician("Bob", "piano"));
        orchestra.addMusician(MusicianFactory.createMusician("Toto", "violin"));
        orchestra.addMusician(MusicianFactory.createMusician("Johnny", "trumpet"));

        orchestra.addPartition(new Partition("p1", 'G'));
        orchestra.addPartition(new Partition("p2", 'D'));
    }
}
