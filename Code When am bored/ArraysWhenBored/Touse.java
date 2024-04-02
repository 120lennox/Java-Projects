public class Touse {
    public static void main(String[] args) {
        int count = 0;
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        for (int i = 0; i < 50; i++){
            int rnd = (int) (Math.random() * 6);
            System.out.print(rnd + " ");
            count++;

            if (rnd == 0){
                zeros++;
            }

            if (rnd == 1){
                ones++;
            }

            if (rnd == 2){
                twos++;
            }

            if (rnd == 3){
                threes++;
            }

            if (rnd == 4){
                fours++;
            }

            if (rnd == 5){
                fives++;
            }
            if (count == 10){
                System.out.println();
                count = 0;
            }
        }

        System.out.println("zeros:\t" + zeros + "\tones:\t" + ones + "\ttwos:\t" + twos + "\tthrees:\t" + threes + "\tfours:\t" + fours + "\tfives\t" + fives);
    }
}
