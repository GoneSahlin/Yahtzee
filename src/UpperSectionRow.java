public class UpperSectionRow {
    public int score;
    private final int targetNumber;

    public UpperSectionRow(int target)
    {
        targetNumber = target;
    }

    public void CalculateScore(AllDice dice)
    {
        score = 0;
        for (int i = 0; i < dice.NUM_DICE; i++)
        {
            int value = dice.GetDie(i).value;
            if (value == targetNumber)
            {
                score += value;
            }
        }
    }


}
