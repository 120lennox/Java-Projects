public class SimulateShuffling {
    static String names[] = {"sibo", "taya", "hobo", "len", "jack", "Joshua", "Yohan", "Jane", "LastOne"};
    public static void shuffle(){
        for (int i = 0; i < names.length - 1; i++){
            int rnd = (int) Math.random() * names.length;

            //swapping
            String temp = names[i];
            names[i] = names[rnd];
            names[rnd] = temp;
        }

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

    }

    public static void shift(){
        String temp = names[0];
        for (int i = 1; i < names.length; i++){
            names[i - 1] = names[i];

            if (i == names.length - 1){
                names[names.length - 1] = temp;
            }
        }

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }

    public static void main(String[] args) {
        shift();
        //shuffle();
    }
}
