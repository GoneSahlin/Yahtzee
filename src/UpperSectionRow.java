public class UpperSectionRow {
    public int score;
    private final int targetNumber;

    public UpperSectionRow(int target)
    {
        targetNumber = target;
    }

    public void CalculateScore(AllDice allDice)
    {
        score = 0;
        for (int i = 0; i < allDice.NUM_DICE; i++)
        {
            int value = allDice.GetDie(i).value;
            if (value == targetNumber)
            {
                score += value;
            }
        }
    }


}
