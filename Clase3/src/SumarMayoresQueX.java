public class SumarMayoresQueX {

    public static int sumarMayoresQue(int[] vector, int num){
        int i = 0;
        int sumatoria = 0;

        while(i <= vector.length-1){
            System.out.println(vector[i]);
            if(vector[i]>num){
                sumatoria += vector[i];
                i++;
            }else{
                i++;
            }
        }
        return sumatoria;
    }

    public static void main(String[] args){ 
        int[] vector = {1,2,4,5,12,4};
        int x = 4;
        int resultado = sumarMayoresQue(vector, x);
        System.out.println(resultado);
    }
}


public class SumarMayoresQueX {
    public static int sumarMayoresQue(int[] vector, int num){
        int i = 0;
        int sumatoria = 0;

        while(i <= vector.length-1){
            System.out.println(vector[i]);
            if(vector[i]>num){
                sumatoria += vector[i];
                i++; // eliminando esta linea funciona
            }
            i++;
        }
        return sumatoria;
    }

    public static void main(String[] args){
        int[] vector = {1,2,4,5,12,4};
        int x = 4;
        int resultado = sumarMayoresQue(vector, x);
        System.out.println(resultado);
    }
}
