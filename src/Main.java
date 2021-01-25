public class Main {
    public static void main(String[] args) {
        Die die1 = new Die();

        for (int i = 0; i < 10; i++)
        {
            die1.rollDie();
            System.out.println(die1.getValue());
        }

//        System.out.println(die1.getValue());
    }
}
