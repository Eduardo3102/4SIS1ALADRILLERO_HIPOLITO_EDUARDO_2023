/*datos es un controlador , su nombre lo dice es una clase que se encarga
 * de poder controlar las entradas o salidas de los datos es la que se encarga 
 * de la manipulacion
 */
import javax.swing.JOptionPane;
public class Datos {
    //lo primero que necesitamos es una instancia de estudiante
    Estudiante obj[] = new Estudiante[10];
    int x = 0;
    //creemos el menu

    void menu(){
        String var = "si";//para repetir el programa
        String mensaje = "";
        while(var.equalsIgnoreCase("si")){
        int op = Integer.parseInt(JOptionPane.showInputDialog("ingresa la opcion deseada\n" 
        +  "1.- darde alta un nuevo estudiante.\n"
        + "2.-mostrar los datos de los estudiantes\n" ));

        switch(op){

            case 1:
            //necesito un metodo para solicitar la informacion
            pedirEstudiante();
            break;
            case 2:
            //necesito un metodo para mostrar la informacion
            mostrarEstudiante();
            break;
            default:
            JOptionPane.showMessageDialog(null,"opcion no valida");

        
        
        }

        mensaje = JOptionPane.showInputDialog("DESEAS REPETIR");
        }


    }
    public void pedirEstudiante(){
//solicito los datos
        int numbol = Integer.parseInt(
            JOptionPane.showInputDialog("INGRESA EL NUMERO DE BOLETA DEL ESTUDIANTE"));
        
        String nom = JOptionPane.showInputDialog("INGRESA EL NOMBRE DEL ESTUDIANTE");
        
        int edad = Integer.parseInt(
            JOptionPane.showInputDialog("INGRESA LA EDAD DEL ESTUDIANTE"));
        char gen = JOptionPane.showInputDialog("ingresa el genero del estudiante").charAt(0);
    
            //los agrego a mi arreglo
            //en este arreglo estoy guardado los datos del estudiante
            obj[x] = new Estudiante(numbol, nom, edad, gen);
            x++;
    }
    public void mostrarEstudiante(){
        //necesito usar get para cada uno de los datos guardados en el arreglo
        for(int i = 0; i < x; i++){
            //visualizo
            JOptionPane.showMessageDialog(null, 
            "La boleta del estudiante es: " + obj[i].getnumBoleta() + "\n"
            + "el nombre del estudiante es: " + obj[i].getnombre() + "\n"
            + "La edad del estudiante es: " + obj[i].getEdad() + "\n"
            + "El genero del estudiante es: " + obj[i].getGenero() + "\n");

        }
    }
}
