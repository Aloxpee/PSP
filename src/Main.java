import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la marca,");
        Lavadora lava=new Lavadora("lava", 2.3,4,true);
        System.out.println("Hello world!");
        System.out.println("soy carla y me da justo para no cagarme encima");
        System.out.println("Cual es la potencia que tiene su aparato");
        lava.setPotencia(sc.nextDouble());
        System.out.println("Cuantas horas a estado con sus aparatos encendidos");
        lava.getconsumo(sc.nextInt());
        System.out.println("digame horas y cuanto le cuesta la hora");
        lava.getCosteConsumo(sc.nextInt(),sc.nextDouble());

    }
}