import java.util.Scanner;

public class cadenainverttida {
    
    //objeto para la entrada de datos
    Scanner entrada = new Scanner(System.in);

    public void cadenainvertidapalabras(){

        String cadena = "";
        
        System.out.println("Ingresa la oracion que deseas invertir: ");

        cadena = entrada.nextLine();

        //el chiste es poder invertir una cadena
        String invertida = "";
        //habia un avez un patito
        //con un ciclo for 

        for(int i = cadena.length()-1; i >= 0; i++){
            //obtengo los caracteres
            char car = cadena.charAt(i);
            //lo concateno
            invertida += car;


        }

        System.out.println("cadena invertida es :" + invertida);

    }
}
