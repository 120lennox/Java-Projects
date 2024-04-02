public class countChar {

    public static char[] lowerCaseLetters(){
        char letters[] = new char[26];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) (97 + i);
        }

        return letters;
    }

    public static char[] randomLowerCaseLetters(){
        char chars[] = lowerCaseLetters();
        char random_letters[] = new char[100];

        for (int i = 0; i < random_letters.length; i++){
            int letter = (int) (Math.random() * 26);
            random_letters[i] = chars[letter];
        }

        return random_letters;
    }

    public static int[] counts(char[] chars){
        int counts[] = new int[26];
        for (int i = 0; i < counts.length; i++) {
            counts[i + 'a']++;
        }

        return counts;
    }
    public static void main(String[] args) {
        char alpha[] = randomLowerCaseLetters();
        for (int i = 0; i < alpha.length; i++) {
            System.out.println(alpha[i]);
        }

        counts(alpha);
    }
}