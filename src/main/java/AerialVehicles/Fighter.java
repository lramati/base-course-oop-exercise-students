package AerialVehicles;

import Missions.Mission;

public abstract class Fighter extends AerialVehicle {
    public Fighter(String pilotName, Mission mission, int timeSinceRepair, boolean isReady) {
        super(pilotName, mission, timeSinceRepair, isReady);
    }

    @Override public final int getMaxTimeToRepair() { return 250; }
}