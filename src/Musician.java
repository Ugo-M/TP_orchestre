import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

public class Musician implements PropertyChangeListener {

    public String name;
    public Instrument instrument;

    Musician(String nom, Instrument i){
        this.name = name;
        this.instrument = i;
    }


    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        System.out.println("Musician : " + this.name + "\n " + propertyChangeEvent.getSource() + "\n " + propertyChangeEvent.getNewValue());
    }

}
