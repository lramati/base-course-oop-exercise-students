package AerialVehicles;

import Missions.Mission;
import Missions.IntelligenceMission;
import Missions.MissionTypeException;

public interface AerialIntelligenceVehicle extends AerialVehicleService {
    public String getSensorType();

    default public String collectIntelligence() /*throws MissionTypeException*/ {
        return getPilotName() + ": " + getClass().getSimpleName() + " Collecting Data in "
                + getIntelligenceMission().getRegion() + " with sensor type: " + getSensorType();
    }

    default public IntelligenceMission getIntelligenceMission() /*throws MissionTypeException*/ {
        Mission mission = getMission();
        if (mission instanceof IntelligenceMission) return (IntelligenceMission) mission;
        //throw new MissionTypeException("Mission isn't instance of IntelligenceMission");
        return null;
    }

    default public void setMission(IntelligenceMission mission) { setMissionImpl(mission); }
}
