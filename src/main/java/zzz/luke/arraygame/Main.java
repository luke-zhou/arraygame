package zzz.luke.arraygame;

import zzz.luke.arraygame.player.LukePlayer;
import zzz.luke.arraygame.player.RandomPlayer;

import java.util.stream.IntStream;

/**
 * Created by Luke on 5/09/2017.
 */
public class Main {
    public static void main(String[] args) {

        Player player1 = new RandomPlayer();
        Player player2 = new LukePlayer();
        IntStream.range(0,10).forEach(i-> {
            Game game = new Game();
            game.setFirstPlayer(player1);
            game.setSecondPlayer(player2);
            game.start().win();
            game = new Game();
            game.setFirstPlayer(player2);
            game.setSecondPlayer(player1);
            game.start().win();
        });
        System.out.println(player1.getName()+" vs "+player2.getName() +"\t"+player1.getScore()+":"+player2.getScore());
    }
}
