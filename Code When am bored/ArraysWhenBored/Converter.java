public class Converter {
    public static void print_names(){
        String names[][] = {{"Florence", "09947382", "Manila"},
                            {"Pempho", "0984839284", "Zomba"},
                        {"Mountain", "95483058", "Ntcheu"},
                    {"Jane", "097294211", "Phalombe"}};

        for (int i = 0; i < names.length; i++){
            for (int j = 0; j < names[i].length; j++){
                if (j == 0){
                    System.out.println("Name: " + names[i][j]);
                }
                if (j == 1){
                    System.out.println("Tel #: " + names[i][j]);
                }
                if (j == 2){
                    System.out.println("Address: " + names[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        print_names();
        double kilo = 0;
        
        //System.out.println("Miles \t kilometers");
        for (int i = 0; i < 9; i++){
            kilo = i * 1.609;
            //System.out.print(i + " \t" + kilo + "\n");
        }
        
    }
}
