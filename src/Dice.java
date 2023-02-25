import java.util.Random;


public class Dice {

    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    public Dice(int startingSide) {

        sides = startingSide;

        randomGenerator = new Random();
    }

    public void roll() {
        sideFacingUp = randomGenerator.nextInt(1, sides);

    }

    public int view() {
        return(sideFacingUp);
    }


}



