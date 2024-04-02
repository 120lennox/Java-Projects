public class DeckOfCards {
    //global variables
    static String suits[] = {"♥️", "♠️", "♦️", "♣️"};
    static String ranks[] = {"Jack", "Queen", "King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    static String deck[] = new String[suits.length * ranks.length];

    public static void initialize_deck(){
        /*
         * the outer loop iterates through ranks array (gets the indices of ranks)
         * the inner loop iterates through the suits array. 
         * deck[suits.length * i + j] gets the index of deck array so that ranks[i] + "" suits[i] is stored. 
         * suits.length * i + j provides the exact index to store the values
         * suppose suits.length = 4; and i is 0; and then j is also 0; it means now the index of deck[] is 0. and the values will be stored in the index 0 (will be first element) 
         */

        for (int i = 0; i < ranks.length; i++){
            for (int j = 0; j < suits.length; j++){
                deck[suits.length * i + j] = ranks[i] + "" + suits[j];
            }
        }

        String[] copied_array = new String[deck.length];

        for (int i = 0; i < copied_array.length; i++){
            copied_array[i] = deck[i];
        }

        //printing the array
        for (int k = 0; k < copied_array.length; k++){
            System.out.print(copied_array[k] + "  ");
        }


    }
    public static void random_initilization() {

        //assigning cards
        String suits[] = {"♥️", "♠️", "♦️", "♣️"};
        String ranks[] = {"Jack", "Queen", "King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        /**
         * This piece of code is just creating an index of ranks to be printed.
         * Instead of you explicitly specify the index to be printed, The math.random creates a random value int value in range of the array length.
         */
        int for_suits = (int) Math.random() * suits.length;
        int for_rank = (int) Math.random() * ranks.length;

        System.out.println(ranks[for_rank] + "" + suits[for_suits]);
    }

    public static void drawing_random_cards(int num){
        initialize_deck();
        for (int i = 0; i < num; i++){
            int random = (int) Math.random() * 52;
            System.out.print(deck[random] + " ");
        }
    }

    public static void main(String[] args) {
        //initialize_deck();
        drawing_random_cards(20);
    }
}
