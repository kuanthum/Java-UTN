public class ej1_b {
    public static void main(String[] args) throws Exception {
        int numeroInicio = 5;
        int numeroFin = 14;

        while(numeroInicio <= numeroFin){
            if((numeroInicio%2) == 0){
                System.out.println(numeroInicio);
            }
            numeroInicio++;
        }
    }
}
