public class Die {

    public static final int DICE_SIDES = 6;

    public int value;

    //Constructor for Die class
    public Die()
    {
        value = 1;
    }

    //generates random number from 1 to DICE_SIDES, and stores in value
    public void rollDie()
    {
        value = (int)(Math.random() * (DICE_SIDES) + 1);
    }

    //sets value to input
    public void setValue(int newValue)
    {
        value = newValue;
    }
}
