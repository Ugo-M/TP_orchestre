import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Orchestra {

    public static Orchestra instance;
    public ArrayList<Musician> musicians;
    public ArrayList<Partition> partitions;

    public Orchestra() {
        this.musicians = new ArrayList<>();
        this.partitions = new ArrayList<>();
    }

    static public Orchestra getInstance() {
        if (instance == null){
            instance = new Orchestra();
        }

        return instance;
    }

    public void addMusician(Musician m){
        /*
        if (partitions.size() != 0){
            partitions.forEach(partition -> {
                partition.addPropertyChangeListener(m);

            });
        }
        */
        this.musicians.add(m);
    }

    public void removeMusician(Musician m){
        //if (partitions.size() != 0){        }
        //partitions.forEach(partition -> partition.removePropertyChangeListener(m));
        this.musicians.remove(m);
    }

    public void addPartition(Partition p){
        //if (musicians.size() != 0){        }
        //musicians.forEach(musician -> p.addPropertyChangeListener(musician));
        //p.pcs.firePropertyChange(new PropertyChangeEvent(p));
        this.partitions.add(p);
    }

    public void removePartition(Partition p){
        this.partitions.remove(p);
    }

    public Integer getNbMusicians(){
        return musicians.size();
    }

    public Integer getNbPartitions(){
        return partitions.size();
    }
}
