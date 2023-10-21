public class Capibara extends Animalitos {
    private int num_vidas;

    public Capibara(){

    }

    public Capibara(String nombre,String raza, String tipo_alimento, int edad, int num_vidas){
        super(nombre,raza,tipo_alimento, num_vidas);
        this.num_vidas = num_vidas;
    }

    public void setnum_vidas(int num_vidas){
        this.num_vidas = num_vidas;
    }

    public int getnum_vidas(){
        return num_vidas;
    }

    public void mostrarCapibara(){
        System.out.println("El Nombre del Capibara es: "+getNombre()+"\n"
        + "La Raza del Capibara es: "+getRaza()+"\n"
        +"Se Alimenta de: "+gettipo_alimento()+"\n"
        +"El Capibara tiene la edad:"+getedad()+"\n");
    }
}