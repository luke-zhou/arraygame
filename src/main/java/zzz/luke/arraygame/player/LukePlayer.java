package zzz.luke.arraygame.player;

import zzz.luke.arraygame.Move;
import zzz.luke.arraygame.Player;

/**
 * Created by Luke on 5/09/2017.
 */
public class LukePlayer extends Player {
    @Override
    public String setName() {
        return "Luke";
    }

    @Override
    public Move nextMove() {
        return getLeftNum() > getRightNum() ? Move.LEFT : Move.RIGHT;
    }
}
