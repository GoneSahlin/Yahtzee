public class Scorecard {
    public UpperSection upSec;
    public LowerSection lowSec;

    //constructor
    public Scorecard()
    {
        upSec = new UpperSection(6);
        lowSec = new LowerSection();
    }



}
