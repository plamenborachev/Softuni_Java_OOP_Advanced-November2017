package p02Command;

import p02Command.commands.AttackCommand;
import p02Command.commands.TargetCommand;
import p02Command.interfaces.*;
import p02Command.loggers.CombatLogger;
import p02Command.loggers.EventLogger;

public class Main {
    public static void main(String[] args) {

        Handler combatLog = new CombatLogger();
        Handler eventLog = new EventLogger();

        combatLog.setSuccessor(eventLog);

        Attacker warrior = new Warrior("p02Command.Warrior", 10, combatLog);
        Target dragon = new Dragon("p02Command.Dragon", 10, 25, combatLog);

        Executor executor = new CommandExecutor();

        Command target = new TargetCommand(warrior, dragon);
        Command attack = new AttackCommand(warrior);

        executor.executeCommand(target);
        executor.executeCommand(attack);

        combatLog.handle(LogType.ATTACK, "some attack");
        combatLog.handle(LogType.ERROR, "some attack");
        combatLog.handle(LogType.EVENT, "some attack");
    }
}
