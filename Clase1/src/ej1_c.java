public class ej1_c {
    public static void main(String[] args) throws Exception {
        int numeroInicio = 5;
        int numeroFin = 14;
        String variableC = "pares";

        while(numeroInicio <= numeroFin){
            if((variableC == "pares")&&((numeroInicio%2)==0)){
                    System.out.println(numeroInicio);
                }
            else{
                if((variableC == "impares")&&((numeroInicio%2)!=0)){
                    System.out.println(numeroInicio);
                }
            }
            numeroInicio++;
        }
    }
}
