package army2.fight.boss;

import army2.fight.Boss;
import army2.fight.FightManager;
import java.io.IOException;

/**
 *
 * @author Văn Tú
 */
public class BoxGift extends Boss {

    public BoxGift(FightManager fightMNG, byte idGun, String name, byte location, int HPMax, short X, short Y) throws IOException {
        super(fightMNG, idGun, name, location, HPMax, X, Y);
        super.theLuc = 0;
        super.width = 30;
        super.height = 30;
        this.fly = idNV == 24;
        this.XPExist = 0;
    }

    @Override
    public void turnAction() {
    }

}
