package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle implements AerialVehicleService {
    String pilotName;
    Mission mission;
    int timeSinceRepair;
    boolean isReady;

    AerialVehicle(String pilotName, Mission mission, int timeSinceRepair, boolean isReady) {
        this.pilotName = pilotName;
        this.mission = mission;
        this.timeSinceRepair = timeSinceRepair;
        this.isReady = isReady;
    }

    @Override public String getPilotName() { return pilotName; }
    @Override public Mission getMission() { return mission; }
    @Override public int getHoursOfFlightSinceLastRepair() { return timeSinceRepair; }
    @Override public boolean canFly() { return isReady; }

    @Override public void setHoursOfFlightSinceLastRepair(int time) { if (time >= 0) timeSinceRepair = time; }
    @Override public void setReadiness(boolean isReady) { this.isReady = isReady; }

    @Override public void setMissionImpl(Mission mission) { this.mission = mission; }
}
