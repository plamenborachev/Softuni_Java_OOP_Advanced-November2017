package pr0304Barracks.models.units;

public class Gunner extends AbstractUnit {
    private static final int GUNNER_HEALHT = 20;
    private static final int GUNNER_DAMAGE = 20;


    public Gunner() {
        super(GUNNER_HEALHT, GUNNER_DAMAGE);
    }
}
