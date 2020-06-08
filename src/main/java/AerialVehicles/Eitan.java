package AerialVehicles;

import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Eitan extends Haron implements AerialIntelligenceVehicle, AerialAttackVehicle {
    private int nMissiles;
    private String missileType;
    private String sensorType;

    public Eitan(int nMissiles, String missileType, String sensorType, String pilotName, Mission mission, int timeSinceRepair, boolean isReady) {
        super(pilotName, mission, timeSinceRepair, isReady);
        this.nMissiles = nMissiles;
        this.missileType = missileType;
        this.sensorType = sensorType;
    }

    @Override public int getNumMissiles() { return nMissiles; }
    @Override public String getMissileType() { return missileType; }
    @Override public String getSensorType() { return sensorType; }
}
