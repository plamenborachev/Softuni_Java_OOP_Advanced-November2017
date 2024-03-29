package core;

import annotations.Inject;
import contracts.*;

import java.util.Collections;
import java.util.List;

public abstract class BaseCommand implements Executable {

    @Inject
    private List<String> params;
    @Inject
    private BoatSimulatorController controller;

    protected BaseCommand() {
    }

    protected List<String> getParams() {
        return Collections.unmodifiableList(this.params);
    }

    protected BoatSimulatorController getController() {
        return this.controller;
    }
}
