package zzz.luke.arraygame.player;

import zzz.luke.arraygame.Move;
import zzz.luke.arraygame.Player;

import java.util.List;

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
        List<Integer> nums = getList();
        return nums.get(0) > nums.get(nums.size()-1) ? Move.LEFT : Move.RIGHT;
    }
}
