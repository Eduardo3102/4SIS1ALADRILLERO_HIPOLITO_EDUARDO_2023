
public class estudiante extends persona{
private int  numBoleta;
private String chillon;

public estudiante(){        //constructor


}   
public estudiante(int numBoleta, String nombre, int edad, char genero, String chillon ){
 super(nombre, edad, genero);
 
 this.numBoleta = numBoleta;
 this.chillon = chillon;

}

public estudiante(int numBoleta, String nombre, int edad, char genero ){
 super(nombre, edad, genero);
 
 this.numBoleta = numBoleta;
 

}

public int getnumBoleta(){
    return numBoleta;

}

public void  setnumBoleta(int numBoleta){
    this.numBoleta = numBoleta;
}

public String getchillon(){
    return chillon;

}

public void  setchillon(String chillon){
    this.chillon = chillon;
}


}
