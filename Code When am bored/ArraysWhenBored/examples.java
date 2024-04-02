/*
 * ========================FAMILIARIZING WITH ARRAYS=======================================
 * examples - has methods to familiarize yourself with arrays
 * 
 */

public class examples {
    public static void init_index(String[] args) {
        String kachere[] = new String[5];
        kachere[0] = "Lizzie";
        kachere[1] = "Faizozo";
        kachere[2] = "Vernia";
        kachere[8] = "Taona";
        System.out.println("No errors!");
    }

    public static void init_array(){
        String[] umodzi = {"martha", "calmboy", "jombo", "lennox"};
    }

    /*
     * This Method allocates 8 names from names array to selected students array 
     */

    public static void students_accommodation(){
        String names[] = {"Lennox", "Mountain", "vernia", "Taona", "Lizzie", "Calmboy", "Chipen", "Nyasunyasu", "Martha", "Faizozo", "Muntanya", "Harris", "Lucy", "Pukulu", "Omikhe", "Brian"};
        int number_of_available_spaces = 14;
        String[] selected_students = new String[number_of_available_spaces];

        //shuffle names array no repeating
        for (int i = 0; i < names.length - 1; i++){
            int rnd = (int) Math.random() * names.length;
            String temp = names[i];
            names[i] = names[rnd];
            names[rnd] = temp;
        }

        for (int i = 0; i < number_of_available_spaces; i++){
            selected_students[i] = names[i];
        }

        for (int i = 0; i < selected_students.length; i++){
            //List provides numbering from 1 to selected students range
            int list = i + 1;
            System.out.println(list + ". " + selected_students[i]);
        }

        
    }

    public static void main(String[] args) {
        System.out.println("============================SELECTED STUDENTS=================================");
        students_accommodation();
    }


}
