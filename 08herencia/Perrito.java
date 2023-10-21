public class Perrito extends Animalitos{
    private int num_vidas;

    public Perrito(){

    }

    public Perrito(String nombre,String raza, String tipo_alimento, int edad, int num_vidas){
        super(nombre,raza,tipo_alimento, num_vidas);
        this.num_vidas = num_vidas;
    }

    public void setnum_vidas(int num_vidas){
        this.num_vidas = num_vidas;
    }

    public int getnum_vidas(){
        return num_vidas;
    }

    public void mostrarPerrito(){
        System.out.println("El Nombre del Perrito es: "+getNombre()+"\n"
        + "La Raza del Perrito es: "+getRaza()+"\n"
        +"Se Alimenta de: "+gettipo_alimento()+"\n"
        +"El Perrito tiene la edad:"+getedad()+"\n");
    }   

}
