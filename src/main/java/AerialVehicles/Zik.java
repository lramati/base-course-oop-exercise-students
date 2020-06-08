package AerialVehicles;

import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Zik extends Hermes implements AerialIntelligenceVehicle, AerialBdaVehicle {
    private String sensorType;
    private String cameraType;

    public Zik(String cameraType, String sensorType, String pilotName, Mission mission, int timeSinceRepair, boolean isReady) {
        super(pilotName, mission, timeSinceRepair, isReady);
        this.cameraType = cameraType;
        this.sensorType = sensorType;
    }

    @Override public String getSensorType() { return sensorType; }
    @Override public String getCameraType() { return cameraType; }
}
