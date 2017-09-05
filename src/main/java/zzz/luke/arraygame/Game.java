package zzz.luke.arraygame;

import zzz.luke.arraygame.util.NumberGenUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Luke on 5/09/2017.
 */
public class Game {

    private static int MAX_SIZE = 50;
    private static int MIN_SIZE = 20;
    private static int MAX_NUM = 1000;

    private List<Integer> nums;
    private Player player1;
    private Player player2;
    private Player nextPlayer;


    public Game() {
        int size = NumberGenUtil.randomGenerateNumber(MIN_SIZE, MAX_SIZE);
        this.nums = IntStream.range(0, size).mapToObj(i -> NumberGenUtil.randomGenerateNumber(MAX_NUM)).collect(Collectors.toList());
    }

    public Player start() {
//        displayNums("Array", nums);
        while (nums.size() > 0) {
            switch (nextPlayer.nextMove()) {
                case LEFT:
                    Integer left = nums.remove(0);
                    nextPlayer.addNum(left);
                    break;
                case RIGHT:
                    Integer right = nums.remove(nums.size() - 1);
                    nextPlayer.addNum(right);
                    break;
            }
            swapNextPlayer();
        }


//        displayNums(player1.getName() + ":" + player1.getTotal(), player1.getSelectedNums());
//        displayNums(player2.getName() + ":" + player2.getTotal(), player2.getSelectedNums());
        Player winner = player1.getTotal() > player2.getTotal() ? player1 : player2;
//        System.out.println("Winner is " + winner.getName());
        return winner;
    }

    private void displayNums(String name, List<Integer> numbers) {
        System.out.print(name + ": ");
        numbers.stream().forEach(i -> System.out.print(i + ","));
        System.out.println();
    }

    private void swapNextPlayer() {
        nextPlayer = nextPlayer == player1 ? player2 : player1;
    }

    public List<Integer> getNums() {
        return nums.stream().collect(Collectors.toList());
    }

    public void setFirstPlayer(Player player) {
        player.reset();
        this.player1 = player;
        player1.setGame(this);
        nextPlayer = player1;
    }

    public void setSecondPlayer(Player player) {
        player.reset();
        this.player2 = player;
        player2.setGame(this);
    }
}
