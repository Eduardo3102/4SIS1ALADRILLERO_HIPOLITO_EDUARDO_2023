
public class persona {
    private String nombre;
    private int edad;
    private char genero;
   
    public persona(){

    }

    public persona(String nombre, int edad, char genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

public String getnombre(){
return nombre;
}

public void setnombre(String nombre){
    this.nombre = nombre;
}

public int getEdad(){
return edad;
}

public void setEdad(int edad){
    this.edad = edad;

}
public char getGenero(){
return genero;
}

public void setGenero(char genero){
    this.genero = genero;

}






}
