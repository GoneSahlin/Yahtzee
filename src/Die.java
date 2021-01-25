public class Die {

    static final int DICE_SIDES = 6;

    private int value;

    //Constructor for Die class
    public Die()
    {
        value = 1;
    }

    //returns value
    public int getValue()
    {
        return value;
    }

    //generates random number from 1 to DICE_SIDES, and stores in value
    public void rollDie()
    {
        value = (int)(Math.random() * (DICE_SIDES) + 1);
    }
}
