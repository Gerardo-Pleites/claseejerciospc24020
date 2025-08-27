
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Lamborghini " , "Urus" , "Naranja");
        Coche coche2 = new Coche("Ferrari " , "250 GTO" , "Amarillo");
        Coche coche3 = new Coche("Ford " , "Mustang" , "Rojo");

        coche1.describir();
        coche2.describir();
        coche3.describir();

        //coloreando
        coche1.pintar("Rojo");
        coche2.pintar("Morado");
        coche3.pintar("Verde");

        coche1.arrancar();
        coche2.arrancar();
        coche3.arrancar();

        // Describir luego de arrancar
        coche1.describir();
        coche2.describir();
        coche3.describir();

        //describir luego de colorear
        coche1.describir();
        coche2.describir();
        coche3.describir();

        // Describir lluego de apagar
        coche1.apagar();
        coche2.apagar();
        coche3.apagar();



    }
}