public abstract class MusicianFactory {

    public static Musician createMusician(String nom, String instrument) throws Exception {
        switch (instrument){
            case "piano":
                return new Musician(nom, new Piano());
            case "violin":
                return new Musician(nom, new Violin());
            case "trumpet":
                return new Musician(nom, new Trumpet());
            default:
                throw new Exception("Unknown Instrument");
        }
    }
}
