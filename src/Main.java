public class Main {
    public static void main(String[] args) {
        AllDice dice = new AllDice();
        dice.RollAllDice();
        dice.PrintDiceValues();
        UpperSectionRow aces = new UpperSectionRow(1);
        UpperSectionRow twos = new UpperSectionRow(2);

        aces.CalculateScore(dice);
        System.out.println(aces.score);

        twos.CalculateScore(dice);
        System.out.println(twos.score);
    }
}
