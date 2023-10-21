public class Principal {
    
    public static void main(String[] args){
        Michi gato = new Michi("bolita","de la calle","croquetas bebes", 1, 7);
        gato.mostrarMichi();

        Perrito perro = new Perrito("Come Kroketas","Espacial","croquetas raza mediana", 2, 1);
        perro.mostrarPerrito();

        Conejito conejo = new Conejito("El Verduras","de Bugs Bunny","De todo un poco", 3, 7);
        conejo.mostrarConejito();

        Hamnster cuyo = new Hamnster("Hamntaro","Ruedor","Cemillas y Croquetas", 1, 1);
        cuyo.mostrarHamnster();

        Capibara ruedor = new Capibara("Capitan Chido","Ruedor Gigante","Especializado", 4, 2);
        ruedor.mostrarCapibara();
    }
}