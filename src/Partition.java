import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Partition {
    String name, event;
    Character tone;
    //PropertyChangeSupport pcs;

    Partition(String name, Character tone){
        this.name = name;
        this.tone = tone;
        this.event = "creation";
        //this.pcs = new PropertyChangeSupport(this);

    }
    /*

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }
*/

}
