public class App {
    public static void main(String[] args) throws Exception {
        //A
        double omkretsen = omkretsCirkel(9);
        System.out.println("Omkretsen är: "+omkretsen);

        //B
        ritaLinje(10);
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
}
