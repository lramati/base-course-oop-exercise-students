package AerialVehicles;

import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Shoval extends Haron implements AerialBdaVehicle, AerialIntelligenceVehicle, AerialAttackVehicle {
    private int nMissiles;
    private String missileType;
    private String sensorType;
    private String cameraType;

    public Shoval(String cameraType, int nMissiles, String missileType, String sensorType, String pilotName, Mission mission, int timeSinceRepair, boolean isReady) {
        super(pilotName, mission, timeSinceRepair, isReady);
        this.nMissiles = nMissiles;
        this.missileType = missileType;
        this.cameraType = cameraType;
        this.sensorType = sensorType;
    }

    @Override public int getNumMissiles() { return nMissiles; }
    @Override public String getMissileType() { return missileType; }
    @Override public String getSensorType() { return sensorType; }
    @Override public String getCameraType() { return cameraType; }
}

