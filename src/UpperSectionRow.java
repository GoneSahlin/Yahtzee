public class UpperSectionRow {

    private final int targetNumber;

    public int score;

    //constructor
    public UpperSectionRow(int target)
    {
        targetNumber = target;
        score = 0;
    }

    //changes score to that on the dice
    public void ChangeScore(AllDice dice)
    {
        score = CalculatePossibleScore(dice);
    }

    //calculates and updates score
    public int CalculatePossibleScore(AllDice dice)
    {
        int possibleScore = 0;
        for (int i = 0; i < dice.NUM_DICE; i++)
        {
            int value = dice.GetDie(i).value;
            if (value == targetNumber)
            {
                possibleScore += value;
            }
        }
        return possibleScore;
    }


}
