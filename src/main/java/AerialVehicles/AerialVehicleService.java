package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;

public interface AerialVehicleService {
    String getPilotName();
    Mission getMission();

    int getHoursOfFlightSinceLastRepair();
    void setHoursOfFlightSinceLastRepair(int time);

    boolean canFly();
    void setReadiness(boolean isReady);

    int getMaxTimeToRepair();
    //String getVehicleClass();

    default void flyTo() { System.out.println("Flying to: " + getMission().getLocation()); };
    default void land() { System.out.println("Landing"); }
    default void check() { if (getHoursOfFlightSinceLastRepair() > getMaxTimeToRepair()) repair(); };
    default void repair() { setHoursOfFlightSinceLastRepair(0); setReadiness(true); };

    void setMissionImpl(Mission mission);
}
