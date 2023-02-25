/*
Author: Owen van Mantgem
 */


import java.util.Scanner;


public class Game {






    Player p1;
    Player p2;
    Dice die;

    public Game(Player inputP1, Player inputP2, Dice inputDie) {
        p1 = inputP1;
        p2 = inputP2;
        die = inputDie;

    }

    public void play() {
        Player current = p1;
        takeTurn(current);
        current = nextPlayer(current);
        takeTurn(current);


    }

    public Player nextPlayer(Player current) {
        if (current == p1) {
            return(p2);
        }
        else {
            return (p1);
        }
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
        System.out.println(p1.getName());
        System.out.println("score: "+ p1.getScore());

        System.out.println(p2.getName());
        System.out.println("score: "+p2.getScore());

        if (p1.getScore() > p2.getScore()) {
            return(p1.getName());
        }
        if (p2.getScore() > p1.getScore()) {
            return(p2.getName());
        }

        return("no one");

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many sides does the die have?");

        int sidesOfDice = scanner.nextInt();

        Player Marcy = new Player("Marcy");
        Player Fred = new Player("Fred");
        Dice gameDice = new Dice(sidesOfDice);

        Game game = new Game(Marcy,Fred, gameDice);
        game.play();
        System.out.println(game.announceWinner() + " is the Winner!");


    }
}
