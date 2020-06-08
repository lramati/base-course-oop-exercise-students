package Missions;
import Entities.Coordinates;

public abstract class Mission {
    Coordinates location;

    Mission(Coordinates location) { this.location = location; }

    public void begin() { System.out.println("Beginning Mission!"); }
    public void cancel() { System.out.println("Abort Mission!"); }
    public void finish() { System.out.println("Finishing Mission!"); }

    public Coordinates getLocation() { return location; }
}
