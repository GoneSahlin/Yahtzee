public class Main {
    public static void main(String[] args) {

        AllDice dice = new AllDice();
        dice.RollAllDice();
        dice.PrintDiceValues();

        UpperSection upSec = new UpperSection(dice.GetDie(0).DICE_SIDES);
        upSec.CalculateAllPossibleScores(dice);

    }
}
