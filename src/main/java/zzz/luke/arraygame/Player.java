package zzz.luke.arraygame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luke on 5/09/2017.
 */
public abstract class Player {

    private List<Integer> selectedNums = new ArrayList<>();
    private String name;
    private Integer score=0;
    private Game game;

    public void win(){
        score++;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Player() {
        name = setName();
    }

    public final void addNum(Integer num) {
        selectedNums.add(num);
    }

    public final void reset(){
        selectedNums.clear();
    }

    public final List<Integer> getSelectedNums() {
        return selectedNums;
    }

    public final String getName() {
        return name;
    }

    public int getTotal() {
        return selectedNums.stream().reduce((x, y) -> x + y).get();
    }

    public Integer getLeftNum(){
        return getList().get(0);
    }

    public Integer getRightNum(){
        return getList().get(game.getNums().size()-1);
    }

    public List<Integer> getList() {
        return game.getNums();
    }

    abstract public String setName();

    abstract public Move nextMove();


    public Integer getScore() {
        return score;
    }
}
