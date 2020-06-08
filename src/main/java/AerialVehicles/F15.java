package AerialVehicles;

import Missions.Mission;



public class F15 extends Fighter implements AerialAttackVehicle, AerialIntelligenceVehicle {
    private int nMissiles;
    private String missileType;
    private String sensorType;

    public F15(String sensorType, int nMissiles, String missileType, String pilotName, Mission mission, int timeSinceRepair, boolean isReady) {
        super(pilotName, mission, timeSinceRepair, isReady);
        this.nMissiles = nMissiles;
        this.missileType = missileType;
        this.sensorType = sensorType;
    }

    @Override public int getNumMissiles() { return nMissiles; }
    @Override public String getMissileType() { return missileType; }
    @Override public String getSensorType() { return sensorType; }

}
