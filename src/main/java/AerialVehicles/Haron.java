package AerialVehicles;

import Missions.Mission;

public abstract class Haron extends AerialVehicle {
    public Haron(String pilotName, Mission mission, int timeSinceRepair, boolean isReady) {
        super(pilotName, mission, timeSinceRepair, isReady);
    }

    @Override public final int getMaxTimeToRepair() { return 150; }
}