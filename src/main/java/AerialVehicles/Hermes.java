package AerialVehicles;

import Missions.Mission;

public abstract class Hermes extends AerialVehicle {
    public Hermes(String pilotName, Mission mission, int timeSinceRepair, boolean isReady) {
        super(pilotName, mission, timeSinceRepair, isReady);
    }

    @Override public final int getMaxTimeToRepair() { return 100; }
}