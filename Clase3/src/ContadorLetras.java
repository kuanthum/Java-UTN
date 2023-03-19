public class ContadorLetras {

    public static int contarLetras(String cadena, char letra){
        int contador = 0;
        int cantCaracteres = cadena.length();

        for(int i = 0; i < cantCaracteres; i++) {
            if(cadena.charAt(i) == letra){
                contador ++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String texto = "No lo pude hacer usando solo el metodo length";
        char letra = 'u';
        int cantidad = contarLetras(texto, letra);
        System.out.println("Letra: " + letra);
        System.out.println("Cantidad: "  + cantidad);
    }
}
