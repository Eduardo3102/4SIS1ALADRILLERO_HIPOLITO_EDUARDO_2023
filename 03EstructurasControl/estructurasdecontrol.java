/*
 menu de seleccion de las 14 opcion3s siguientes:
 1.- bono o descuento por edad
 2.-convertir numeros decuimales a binarios 
 3.-convertir temperaturas
 4.-numero de positivos y negativos
 5.-tiendita
 6.-area y perimetro
 7.-tabla
 8.-factorial
 9.-dibujo
 10.-figura hueca
 11.-patron
 12.-diamante
 13.- calculadora
 14.salir

 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class estructurasdecontrol {
    

    public static void main(String [] args){
Scanner entrada = new Scanner(System.in);

int opcion, numBinario, cantidadProducto, num1;
double total;
float precio, resultado = 0, compra = 0; //inicializacion de la variable
String nombreProducto;
String binario = "";
char letra;
//case 1
int edad;
float descuento;
char socios;
//case 3
int opConvertir; float cantidadConvertir, fah, cen, ran;
double kel;
//case 4
float numero;
//case 5
float area, perimetro, base, altura, lado, volumen;
double radio;
int opFigura;
//case8
int fact = 1; 
int number;
//case 9
int secuencia;
String asterisco = "*";
// case 10
char elegirNum;
float suma, resta, mult, div;
int mensaje;

do{
System.out.println("Bienveniodo al programa: ");
System.out.println("elige un programa  ");
System.out.println("1. descuento por edad:  ");
System.out.println("2.convertir numeros decimales a binarios : ");
System.out.println("3.convertir temperaturas: ");
System.out.println("4.numer de positivos y negativos: ");
System.out.println("5.tiendita: ");
System.out.println("6.area y perimetro : ");
System.out.println("7.tabla: ");
System.out.println("8.factorial: ");
System.out.println("9.dibujo: ");
System.out.println("10.figura hueca: ");
System.out.println("11.patron: ");
System.out.println("12.diamante: ");
System.out.println("13.calculadora: ");
System.out.println("14.salir: ");

opcion = entrada.nextInt();
 


switch(opcion){
    
    
    case 1:
    System.out.println("ingrese la edad del usuario:");
     edad = entrada.nextInt();

        if(edad >= 65){
            System.out.println("Es mayor de edad el descuento sera del: %40");
        }
        else if(edad <= 21){
            System.out.println("sus padres son socios? [s] para si [n] para no ");
            socios = entrada.next().charAt(0);
            if(socios == 's'){
                System.err.println("son socios tiene un descuento del 45%");
            }
        else{
            System.err.println("no son socios solo un descuento del: 25%");

            }
        }
        break;
    case 2:
    System.out.println("ingrese un numero positivo que desee convertir a binario");
    numBinario = entrada.nextInt();
    
    if(numBinario > 0){
        while(numBinario > 0){
            if(numBinario % 2==0){
                binario = "0" + binario;
            }
            else{
                binario = "1" + binario;
            }
            numBinario = (int)numBinario/2;
        }
    }
    else if (numBinario == 0){
        binario = "0" + binario;
    }
    else{
        binario = "No se puede convertir un numero negativo solamente positivos";
    }
    System.out.println("El numero binario es:" + binario);
    break;

    case 3:
    System.out.println("Bienvenido al convertidor de temperaturas");
    System.out.println("seleccion lo que desea convertir");
    System.out.println("1. convertir a fahereint/n" );
    System.out.println("2. convertir a celsius/n");
    System.out.println("3.convertir a kalvin/n");
    System.out.println("4.convertir a rankine/n");

    opConvertir = entrada.nextInt();
switch(opConvertir){

    case 1:
    System.out.println("ingrese la cantidad a convertir");
    cantidadConvertir = entrada.nextFloat();
    fah = (float)(cantidadConvertir * 1.8) + 32;
    System.out.println("la convercion de fahereint a centigrados es:" + fah);
    break;
    case 2:
    System.out.println("ingrese la cantidad a convertir:");
    cantidadConvertir = entrada.nextFloat();
    cen = (float) ((cantidadConvertir - 32)/ 1.8);
    System.out.println("la conversion de centigrados a fahereint es:" + cen);
    break;
    case 3:
    System.out.println("ingrese la cantidad a convertir:");
    cantidadConvertir = entrada.nextFloat();
    kel = ((cantidadConvertir + 49.67)/ 5/9);
    System.out.println("la conversion de fahereint a kelvin es:" + kel);
    break;
    case 4:
    System.out.println("ingrese la cantidad a convertir:");
    cantidadConvertir = entrada.nextFloat();
    ran = (float)((cantidadConvertir - 32) + 491.67);
    System.out.println("la conver5sion de fahereint a rankine es:" + ran);
    break;
    default:
    System.out.println("solo dos operadores permitidos del 1 al 2");
    break;
 }
 case 4:
        System.out.println("saber si un numero es negativo o positivo/n");
        System.out.println("ingrese un numero: ");
        numero = entrada.nextFloat();
        if(numero == 0){
            System.out.println("El numero es neutro");
        }
        else if(numero < 0){
            System.out.println("El numero es negativo");
        }
        else{
            System.out.println("El numero es positivo:");
        }
break;

case 5:
        System.out.println("bienvenido a la tiendita miniso");
        System.out.println("ingrese el numero de productos que desea comprar");
        total = entrada.nextInt();

        for(int i = 1; i <= total; i++){
        System.out.println("ingrese el nombre del producto:");
        nombreProducto = entrada.next();
        System.out.println("ingrese el precio unitario del producto:");
        precio = entrada.nextFloat();
        System.out.println("ingrese la cantidad de productos:");
        cantidadProducto = entrada.nextInt();
        resultado = precio * cantidadProducto;
        compra += resultado;
        }
        System.out.println("el total de la compra es" + compra );
break;




case 6:
        System.out.println("Bienvenido para saber el area y perimetro de las figuras por favor :");
        System.out.println("1.trangulo");
        System.out.println("2.rectangulo");
        System.out.println("volumen de una esfera");
        System.out.println("volumen de un cilindro ");

        opFigura = entrada.nextInt();

        switch(opFigura){
        case 1:
        System.out.println("ingrese su base:");
        base = entrada.nextFloat();
        System.out.println("ingrese su altura");
        altura = entrada.nextFloat();
        area = base * altura;
        System.out.println("ingrese su lado del triangulo:");
        lado = entrada.nextFloat();
        perimetro = lado + lado + lado;
        System.out.println("el area de un triangulo es " + area);
        System.out.println("el perimetro de un triangulo es:" + perimetro);
        break;
        case 2:
        System.out.println("ingrese su base:");
        base = entrada.nextFloat();
        System.out.println("ingrese su altura");
        altura = entrada.nextFloat();
        area = base * altura;
        System.out.println("ingrese su base del rectangulo:");
        base = entrada.nextFloat();
        System.out.println("ingrese su altura del rectangulo:");
        altura = entrada.nextFloat();
        perimetro = ((2 * base) + (2 * altura));
        System.out.println("el area de un triangulo es " + area);
        System.out.println("el perimetro de un triangulo es:" + perimetro);
        break;
        case 3:
        System.out.println("ingrese el radio de la esfera:");
        radio = entrada.nextFloat();
        volumen = (float) (3/4*Math.PI*Math.pow(radio,3 ));
        System.out.println("el volumen de una esfera es:" + volumen);
        break;
        case 4:
        System.out.println("ingrese su radio ");
        radio = entrada.nextDouble();
        System.out.println("ingrese su altura:");
        altura = entrada.nextFloat();

        volumen = (float) (Math.PI * Math.pow(radio, 2) * altura);
        System.out.println("el volumen de un cilindro es" + volumen);
        break;
        }
break;
case 7:
        for(int n = 1; n <= 10; n++){
        System.out.println(n + " " + (n * 10) + " " + (n *100) + "" + (n * 1000) + "" );
        }
break;
case 8:
        System.out.println("ingrese la cantidad");
        number = entrada.nextInt();
        if(number >= 0){
            for(int i = 1; i <=number; i ++){
                fact = fact * i;
            }
            System.out.println("factorial de " + number + "es: " + fact);
        }
        else if(number <= 0){
            System.out.println("solo numeros positivos");
        }
break;
case 9:
        System.out.println("cuadro magico");
        System.out.println("ingrese el tamaño del cuadrado a pintar");
        num1 = entrada.nextInt();
        if(num1 >= 1 && num1 <= 20){
            for(int i = 1; i <= num1; i++){
                for(int j = 1; j <= num1; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }else{
                System.out.println("ingrese un numero del 1 al 20");
            }
break;
case 10:
break;
case 11:
System.out.println("********/n");
System.out.println(" ********");
System.out.println("********");
System.out.println(" ********");
System.out.println("********");
System.out.println(" ********");
System.out.println("********");
System.out.println(" ********");
break;
case 12:
System.out.println("      *");
System.out.println("     ***/n");
System.out.println("    *****");
System.out.println("   *******");
System.out.println("  *********");
System.out.println("   *******");
System.out.println("    *****");
System.out.println("     ***");
System.out.println("      *");

break;
case 13:
break;
case 14:
break;
default:
System.out.println("solo opciones permitidas del 1 al 14");
break;
}
System.out.println("te gustaria repetir algun programa), escribi [s] para si");
letra = entrada.next().charAt(0);





    }while(letra == 'S' || letra == 'S' );
    }
}
