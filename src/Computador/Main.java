package Computador;

public class Main {

    public static void main(String[] args) {
        HD hd = new HD("Kingston", "HD Kingston 450", 1000, 3);
        Memoria memoria = new Memoria("Corsair", "Corsair Vengeance", 8, 2400);
        Processador processador = new Processador("Intel", "Intel Core i5", 5, 2);
        PlacaMae placaM = new PlacaMae("Asus", "B750", processador, hd, memoria);
        Teclado teclado = new Teclado("Ryzen", "Mecanico");
        Mouse mouse = new Mouse("Corsair", "Shuebu453");
        Monitor monitor = new Monitor("HD", "Monitor Gamer 3.5", "8K");

        Gabinete gabinete = new Gabinete("Asus", "A124", 3, placaM);

        EquipamentoEletronico ee = new EquipamentoEletronico(12, 14);

        Computador c = new Computador("Positivo", "Positivo v15", gabinete, teclado, mouse, monitor);
        c.setEquipamentoEletronico(ee);  

        System.out.println(c);
        System.out.println(ee);
    }
}
