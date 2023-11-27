public class App {
    public static void main(String[] args) throws Exception {
        //A
        double omkretsen = omkretsCirkel(9);
        System.out.println("Omkretsen är: "+omkretsen);
        System.out.println("      ");

        //B
        ritaLinje(10);
        System.out.println();

        //C
        ritaRektangel(4, 5);
        System.out.println("      ");

        //D - 1
        char jamforelse = tecken(5.232);
        System.out.println("D1 - Svar: "+jamforelse);
        System.out.println("      ");

        //D - 2
        char jamforelse2 = tecken(-3.232);
        System.out.println("D2 - Svar: "+jamforelse2);
        System.out.println("      ");

        //E - 1
        boolean raknetecken = siffra('4');
        System.out.println("Är inmatningen en siffra?: "+raknetecken);
        System.out.println("      ");

        //E - 2
        boolean raknetecken2 = siffra('a');
        System.out.println("Är den andra inmatningen en siffra?: "+raknetecken2);
        System.out.println("      ");
    }
    static double omkretsCirkel(double radie){
            double omkrets = 2*radie*3.14;
            return omkrets;
        }
    
    static void ritaLinje(int längd){
        for (int i=0; i<längd; i++){
            System.out.print("-");
        }
    }
    static void ritaRektangel(int höjd, int bredd){
        for (int i=0; i<höjd; i++){
            for (int i2=0; i2<bredd; i2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static char tecken(double tal){
        if (tal<0) {
            char negativ = '-';
            return negativ;
        }else{
            char positiv = '+';
            return positiv;
        }
    }
    static boolean siffra(char tecken){
        int sifferkoll = (int) tecken;
        if (sifferkoll>47 && sifferkoll<58) {
            return true;
        }else{
            return false;
        }
    }
}
