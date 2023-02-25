public class Player {

    private String name;
    private int score;

    public Player(String inputName) {

        name = inputName;

    }

    public String getName() {
        return(name);
    }

    public int getScore() {
        return(score);
    }

    public void toss(Dice thisDie) {
        thisDie.roll();
        score = thisDie.view();


    }
}
