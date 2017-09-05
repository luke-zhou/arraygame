package zzz.luke.arraygame.player;

import zzz.luke.arraygame.Move;
import zzz.luke.arraygame.Player;
import zzz.luke.arraygame.util.NumberGenUtil;

/**
 * Created by Luke on 5/09/2017.
 */
public class RandomPlayer extends Player {

    @Override
    public String setName() {
        return "Random("+ NumberGenUtil.randomGenerateNumber(10)+")";
    }

    @Override
    public Move nextMove() {
        int num = NumberGenUtil.randomGenerateNumber(0, 10);
        if (num ==0) return Move.SKIP;
        else if (num % 2 == 0) {
            return Move.LEFT;
        } else {
            return Move.RIGHT;
        }
    }
}
