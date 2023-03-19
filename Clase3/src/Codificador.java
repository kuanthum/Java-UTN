public class Codificador {
    public static void coder(String texto, String choice){

        StringBuilder nuevo_texto = new StringBuilder();
        //Clase para hacer appends de caracteres

        int x;

        if(choice.equals("code")){
            x = 3;
        }else{
            x = -3;
        }

        String alfabeto = "abcdefghijklmnopqrstuvwxyz ";

        for(int i=0;i < texto.length(); i++){
            char letra = texto.charAt(i);
            int indice = alfabeto.indexOf(letra);
            char nueva_letra;

            if(indice+x< 0){
                nueva_letra = alfabeto.charAt(alfabeto.length()+(indice+x));
                //diff con python, no hay indices negativos
            }else{
                nueva_letra = alfabeto.charAt((indice+x)%alfabeto.length());
            }
            //System.out.println(letra + " " + indice + " " + nueva_letra);
            nuevo_texto.append(nueva_letra);
        }
        System.out.println(nuevo_texto);
    }

    public static void main(String[] args){
        //String texto = "hola mundo";
        String texto = "krodcpxqgr";
        //String choice = "code";
        String choice = "decode";
        coder(texto, choice);
    }
}
