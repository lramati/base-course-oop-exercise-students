package AerialVehicles;

import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public interface AerialAttackVehicle extends AerialVehicleService {
    public int getNumMissiles();
    public String getMissileType();

    default public String attack() /*throws MissionTypeException*/ {
        return getPilotName() + ": " + getClass().getSimpleName() + " Attacking "
                + getAttackMission().getTarget() + " with: "
                + getMissileType() + "X" + getNumMissiles();
    }

    default public AttackMission getAttackMission() /*throws MissionTypeException*/ {
        Mission mission = getMission();
        if (mission instanceof AttackMission) return (AttackMission) mission;
        //throw new MissionTypeException("Mission isn't instance of AttackMission");
        return null;
    }

    default public void setMission(AttackMission mission) { setMissionImpl(mission); }
}
