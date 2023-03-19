public class ej1_d {
    public static void main(String[] args) throws Exception {
        int numeroInicio = 5;
        int numeroFin = 14;

        for(int numero = numeroFin; numero >= numeroInicio; numero --){
            if(numero%2 == 0){
                System.out.println(numero);
            }
        }
    }
}
