public class App {
    public static void main(String[] args) throws Exception {
        double omkretsen = omkretsCirkel(9);
        System.out.println("Omkretsen är: "+omkretsen);
    }
    static double omkretsCirkel(double radie){
            double omkrets = 2*radie*3.14;
            return omkrets;
        }
}
