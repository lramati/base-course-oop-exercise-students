package AerialVehicles;

import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends Fighter implements AerialAttackVehicle, AerialBdaVehicle {
    private int nMissiles;
    private String missileType;
    private String cameraType;

    public F16(String cameraType, int nMissiles, String missileType, String pilotName, Mission mission, int timeSinceRepair, boolean isReady) {
        super(pilotName, mission, timeSinceRepair, isReady);
        this.nMissiles = nMissiles;
        this.missileType = missileType;
        this.cameraType = cameraType;
    }

    @Override public int getNumMissiles() { return nMissiles; }
    @Override public String getMissileType() { return missileType; }
    @Override public String getCameraType() { return cameraType; }

}
