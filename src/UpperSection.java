public class UpperSection {
    public UpperSectionRow[] upSecRows;
    public int totalScore;

    //constructor
    public UpperSection(int DICE_SIDES)
    {
        upSecRows = new UpperSectionRow[DICE_SIDES];
        for (int i = 0; i < DICE_SIDES; i ++)
        {
            upSecRows[i] = new UpperSectionRow(i+1); //i+1 because i starts at 0, and dice starts at 1
        }
    }

    //calculates all possible scores in upSecRows
    public void CalculateAllPossibleScores(AllDice dice)
    {
        for (int i = 0; i < dice.GetDie(0).DICE_SIDES; i++)
        {
            System.out.println(i+1 + "s: " + upSecRows[i].CalculatePossibleScore(dice));
        }
    }

    //calculate and update total score
    public void CalculateTotalScore(AllDice dice)
    {
        totalScore = 0;

        for (int i = 0; i < dice.GetDie(0).DICE_SIDES; i++)
        {
            totalScore += upSecRows[i].score;
        }
    }
}
