package Missions;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class AttackMission extends Mission {
    private String target;

    public AttackMission(String target, Coordinates location) {
        super(location);
        this.target = target;
    }

    public String getTarget() { return target; }
}
