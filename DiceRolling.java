import java.util.Random;

public class DiceRolling {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] frequencies = new int[13]; // index 0 and 1 are unused

        for (int roll = 0; roll < 36000; roll++) {
            int die1 = 1 + rand.nextInt(6);
            int die2 = 1 + rand.nextInt(6);
            int sum = die1 + die2;
            frequencies[sum]++;
        }

        System.out.println("Sum\tFrequency");
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + "\t" + frequencies[i]);
        }
    }
}
