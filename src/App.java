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
}
