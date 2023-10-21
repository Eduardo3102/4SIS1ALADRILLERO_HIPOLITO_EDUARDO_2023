import java.util.*;

public class cadena {
    //como su nombre lo dice las funciones de cadena nos sirven para
    //poder manipular diseñar cadenas de texto

    Scanner entrada = new Scanner(System.in);

        //metodo de cadena
        public void cadenas(){
            String s1 ="habia un avez un patito que decia miau miau, y queria un chocolatito";

            //imprimir

            System.out.println("el tamaño de la cadena es:" + s1.length() );

            //quiero saber si comienza con??

            System.out.println("la cadena inicia v o f con la palabra hola?:"
            + s1.startsWith("hola"));
            //quiero saber si finaliza con??

            System.out.println("la cadena finaliza v o f con la palabra chocolatito?"
            + s1.endsWith("chocolatito"));

            //ahora vamos a asignar una cadena mas apartir de una variable 

            System.out.println("ingresa una palabra: ");
            String s2 =entrada.nextLine();
            //vamos a obtener las subcadenas de la palabra

            System.out.println("parte de una subcadena de s1 es: " + s1.indexOf("tito"));
        }
    }
    

