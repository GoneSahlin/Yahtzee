public class AllDice {
    static final int NUM_DICE = 5;

    static public Die[] dice;

    //constructor
    public AllDice()
    {
        dice = new Die[NUM_DICE];
        for (int i = 0; i < NUM_DICE; i ++)
        {
            dice[i] = new Die();
        }
    }

    //returns die object, dieNumber index starts at 0 ends at NUM_DICE-1
    public Die GetDie(int dieNumber)
    {
        return dice[dieNumber];
    }

    //prints the values of all of the dice
    public void PrintDiceValues()
    {
        for (int i = 0; i < NUM_DICE - 1; i++)
        {
            System.out.print(dice[i].value + " ");
        }
        System.out.println(dice[NUM_DICE - 1].value);
    }

    //rolls all dice
    public void RollAllDice()
    {
        for (int i = 0; i < NUM_DICE; i++)
        {
            dice[i].rollDie();
        }
    }

    //rolls single die
    public void RollDie(int dieNumber)
    {
        dice[dieNumber].rollDie();
    }
}
