package models.boats;

import contracts.BoatRace;
import models.boat_engines.BaseBoatEngine;

public class PowerBoat extends BaseMotorBoat {

    private BaseBoatEngine secondEngine;

    public PowerBoat(String model, int weight, BaseBoatEngine engine, BaseBoatEngine secondEngine) {
        super(model, weight, engine);
        this.secondEngine = secondEngine;
    }

    @Override
    public double calculateRaceSpeed(BoatRace boatRace) {
        return super.getEngine().getOutput() + this.secondEngine.getOutput() - super.getWeight() + boatRace.getOceanCurrentSpeed() / 5D;
    }

}
