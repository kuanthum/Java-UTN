public class ej2_a {
    public static void main(String[] args) throws Exception {
        int ingresosMensuales = 350000;
        int vehiculos = 1;
        int vehiculoAntiguedadMinima = 6;
        int inmuebles = 1;
        boolean lujo = false;

        if((ingresosMensuales>=489083)||
            (vehiculos>=3)||
                (vehiculoAntiguedadMinima<=5)||
                    (inmuebles >=5)||
                        (lujo == true)){
                System.out.println("La persona pertenece al segmento de ingresos altos"); 
            }else{
                System.out.println("La persona no pertenece al segmento de ingresos altos");
            }
    }
}
