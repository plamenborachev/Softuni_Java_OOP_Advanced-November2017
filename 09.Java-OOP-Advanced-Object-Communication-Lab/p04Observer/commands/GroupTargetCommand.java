package p04Observer.commands;

import p04Observer.interfaces.AttackGroup;
import p04Observer.interfaces.Command;
import p04Observer.interfaces.Target;

public class GroupTargetCommand implements Command {

    private AttackGroup group;
    private Target target;

    public GroupTargetCommand(AttackGroup group, Target target) {
        this.group = group;
        this.target = target;
    }

    @Override
    public void execute() {
        this.group.groupTarget(this.target);
    }
}
