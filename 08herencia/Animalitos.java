import java.util.Scanner;
public class Animalitos {

    Scanner a = new Scanner(System.in);

    int opcion;

    private String nombre, raza, tipo_alimento;
    private int edad;

    public Animalitos() {
       
    }

    public Animalitos(String nombre, String raza, String tipo_alimento, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String gettipo_alimento() {
        return tipo_alimento;
    }

    public void setTipo_alimento(String tipo_aliment) {
        this.tipo_alimento = tipo_aliment;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

}
