public class Animal {
        //definir variables
 private String nombre, raza, tipo_alimento;
 private int edad;  
 //se debe de crear el constructor, el constructor nos sireve para poder declarar
 //la exixtencia de una clase, para poder inicializar las variables, para crear
 //instancias de una clase

 
public Animal(){
    //este es un constructor por defecto
}
/* cuando existe una construccion del objeto de acuerdo a las necesidades
es necesario utilizar la sobrecarga de los metodos 
en este caso la sobrecarga del cosntructor
 
 */
//metodo para registrar la mascota
//parametros del registro
public Animal (String nom, String raza, String tipo_alimento, int edad){
   //pero son privados los atributos, debemos de tener una forma de acceso
   //la palabra reservada this, nos sirve para poder acceder a los atributos
   //privados
   
    this.nombre = nom;
    this.raza  = raza;
    this.tipo_alimento = tipo_alimento;
    this.edad = edad;
}
//para poder modificar los valores de la asignacion
//es necesario utilizar los metodos getter and setter
//gett es para obtener o recibir
//seet es para asignar o enviar

/*
 metodos get y set para cada variable
 */
public String getnombre(){
    return nombre;
}

public void setnombre(String nom){
    this.nombre = nom;
}    
public String getraza(){
        return raza;
    }
public void setraza(String raza){
    this.raza = raza;
}

public String gettipo_alimento(){
    return tipo_alimento;
}

public void setedad(String tipo_alimento){
this.tipo_alimento = tipo_alimento;
}
 public int getEdad(){
    return edad;
}

public void setEdad(int edad){
this.edad = edad;
    
}

}