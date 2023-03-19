public class OrdenarNumeros {

    public static int[] ordenarNumeros(int numUno, int numDos, int numTres, String order){
        int[] numeros = {numUno, numDos, numTres};
        int i = 0;
        boolean orden = false;
        
        while (!orden) { //Mientras orden sea falso
            orden = true; //Si en el while siguiente no entre en el if, al terminar "orden" sera verdadero y se corta el ciclo
            i = 0;
            while(i < numeros.length -1){
                if(order.equals("a")){
                    if(numeros[i] > numeros[i+1]){ //Solo entra aquí si hay desdorden
                        int buf = numeros[i];
                        numeros[i] = numeros[i+1];
                        numeros[i+1] = buf;
                        orden = false;
                    }else{
                        i++;
                    }
                }if(order.equals("d")){
                    if(numeros[i] < numeros[i+1]){ //Solo entra aquí si hay desdorden
                        int buf = numeros[i];
                        numeros[i] = numeros[i+1];
                        numeros[i+1] = buf;
                        orden = false;
                    }else{
                        i++;
                    }
                }
            } 
        }
        return numeros;
    }

    public static int[] entrada(){

        // Declaración de variables
        int[] entradasNumericas = {0, 0, 0};
        String[] preguntar = {"primer","segundo","tercer"};

        // Preguntar los tres números y guardarlos
        for(int i=0; i<preguntar.length; i++){
            System.out.println("Ingrese el " + preguntar[i] + " número:");
            String input = System.console().readLine();
            // Si el numero no es un entero, ingresar de nuevo el numero
            try {
                int numero = Integer.parseInt(input);
                entradasNumericas[i] = numero;
            } catch (NumberFormatException e) {
                System.out.println("El dato ingresado no es un número entero");
                i = i-1;
            }
        }
        return entradasNumericas;
    }

    public static String orden(){
        // Declarar la variable antes del do porque sino no se puede acceder luego
        String orden;

        do{
            // Preguntar el orden y guardar la variable
            System.out.println("Ingrese 'd' para ordenar los numeros de manera descendente o ingrese 'a' para ordenarlos de manera ascendente");
            orden = System.console().readLine();
            }while(!orden.equals("d") && !orden.equals("a"));

        return orden;
    }
        public static void main(String[] args){

        int[] numeros = entrada();
        String orden  = orden();    
        
        int numeroUno  =  numeros[0];
        int numeroDos  =  numeros[1];
        int numeroTres =  numeros[2];

        int[] resultado = ordenarNumeros(numeroUno, numeroDos, numeroTres, orden);
        
        System.out.println("Numeros ordenados: ");
        System.out.println(resultado[0] + " " + resultado[1] + " " + resultado[2]);

        // Se verifican que se hayan proporcionado los argumentos necesarios
        /*
        if (args.length != 4) {
            System.out.println("Debe proporcionar 3 números y una letra (a o d) para ordenar.");
            return;
        }
        //StringBuilder resultado = entrada();
        String resultado = "Hola";
        System.out.println(resultado.getClass());
        if(resultado instanceof String){
            System.out.println("La variable es de tipo 'String'");
        }else{
            System.out.println(resultado.getClass());
        }
        //int[] resultado = ordenarNumeros(3, 2, 1);
        
        */
    }
    
}
