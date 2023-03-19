public class OrdenarNumeros {

    public static int[] ordenarNumeros(int numUno, int numDos, int numTres){
        int[] numeros = {numUno, numDos, numTres};
        int i = 0;
        boolean orden = false;
        
        while (!orden) { //Mientras orden sea falso
            orden = true; //Si en el while siguiente no entre en el if, al terminar "orden" sera verdadero y se corta el ciclo
            i = 0;
            while(i < numeros.length -1){
                if(numeros[i] > numeros[i+1]){ //Solo entra aquí si hay desdorden
                    int buf = numeros[i];
                    numeros[i] = numeros[i+1];
                    numeros[i+1] = buf;
                    orden = false;
                }else{
                    i++;
                }
            } 
        }
        return numeros;
    }

    public static void main(String[] args){
        int[] resultado = ordenarNumeros(3, 2, 1);
        System.out.println(resultado[0] + "" + resultado[1] + "" + resultado[2]);
    }
    
}
