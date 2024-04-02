public class swappArrays {

    /*
     * swap_them - swaps the array that is of the same size
     * line 10: since the arrays are of same size, the size of the new array is equal to one of the two arrays
     * the functio doesnt return anything since it's void
     */
    public static void spwap_them(){
        String names[] = {"Lennox", "Mwayiwawo", "Yonasani"};
        String surnames[] = {"Kwayito", "Dombolo", "Jambusoni"};
        String swapped_names[] = new String[names.length];

        for (int i = 0, j = 0; i < names.length; j++,i++){
            String temp = names[i];
            names[i] = surnames[j];
            surnames[j] = temp;
            //initializing swapped_names array
            swapped_names[i] = names[i] + " " + surnames[j];
        }

        for (int x = 0; x < swapped_names.length; x++){
                System.out.println(swapped_names[x]);
            }
        }

    public static void main(String[] args) {
        spwap_them();
    }
}
