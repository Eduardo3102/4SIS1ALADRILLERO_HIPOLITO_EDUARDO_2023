public class Michi extends Animalitos {

    private int num_vidas;

    public Michi(){

    }

    public Michi(String nombre,String raza, String tipo_alimento, int edad, int num_vidas){
        super(nombre,raza,tipo_alimento, num_vidas);
        this.num_vidas = num_vidas;
    }

    public void setnum_vidas(int num_vidas){
        this.num_vidas = num_vidas;
    }

    public int getnum_vidas(){
        return num_vidas;
    }

    public void mostrarMichi(){
        System.out.println("El Nombre del Michi es: "+getNombre()+"\n"
        + "La Raza del Michi es: "+getRaza()+"\n"
        +"Se Alimenta de: "+gettipo_alimento()+"\n"
        +"El Michi tiene la edad:"+getedad()+"\n");
    }
    
}
