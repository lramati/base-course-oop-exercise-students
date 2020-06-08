package Missions;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class IntelligenceMission extends Mission {
    private String region;

    public IntelligenceMission(String region, Coordinates location) {
        super(location);
        this.region = region;
    }

    public String getRegion() { return region; }
}
