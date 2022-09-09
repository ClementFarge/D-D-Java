package Board;

import java.util.ArrayList;
import java.util.Collections;

public class Board {
    private final ArrayList<Case> table = new ArrayList<>();

    public void initBoard() {
        for (int i = 0; i < 64; i++) {
            if (i <= 21) {
                this.table.add(new EmptyCase());
            }
            if (i > 21 && i <= 42) {
                this.table.add(new EnemyCase());
            }
            if (i > 42) {
                this.table.add(new BonusCase());
            }
        }
        Collections.shuffle(table);
    }

    public ArrayList<Case> getTable(){
        return table ;
    }
}
