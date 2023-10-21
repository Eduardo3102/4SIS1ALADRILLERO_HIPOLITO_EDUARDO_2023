
//para poder crear la herencia a una clase, se utiliza la palabra reservada
//extend
public class michi extends Animal{
    //como puede heredar todass las caracteristicas de la clase padre

    private int num_vidas;

public michi(){


}
//aplico la sobrecarga
public michi (String nombre, String raza, String tipo_alimento, int edad, int num_vidas){
//y para poder acceder a la clase padre se utiliza la palabra reservada
super(nombre, raza, tipo_alimento,edad);

this.num_vidas = num_vidas;
}
//get y set

public void setNum_vidas(int num_vidas){

    this.num_vidas =num_vidas;


}
public int getNum_vidas(){
    return num_vidas;
}

public void mostrarmichi(){
    System.out.println("el nombre del michi es:" + getNombre() + "\n" 
                        +"la raza del michi es:" + getRaza() + "\n" 
                       + "el nombre del michi es:" + getTipo_Alimento() + "\n" 
                       + "el  michi tiene la edad  de:" + getEdad() + "\n" 
                        +"las vidas del michi son:" + num_vidas + "\n");
}

}