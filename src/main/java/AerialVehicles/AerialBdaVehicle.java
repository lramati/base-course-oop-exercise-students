package AerialVehicles;

import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public interface AerialBdaVehicle extends AerialVehicleService {
    public String getCameraType();

    default public String preformBda() /*throws MissionTypeException*/ {
        return getPilotName() + ": " + getClass().getSimpleName() + " taking pictures of "
                + getBdaMission().getObjective() + " with: " + getCameraType() + " camera";
    }

    default public BdaMission getBdaMission() /*throws MissionTypeException*/ {
        Mission mission = getMission();
        if (mission instanceof BdaMission) return (BdaMission) mission;
        //throw new MissionTypeException("Mission isn't instance of BdaMission");
        return null;
    }

    default public void setMission(BdaMission mission) { setMissionImpl(mission); }
}
