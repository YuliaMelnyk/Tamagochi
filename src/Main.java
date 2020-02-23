import java.util.Scanner;

/**
 * @author yuliiamelnyk on 23/02/2020
 * @project Tamagochi
 */
public class Main {
    public static boolean isRaza = false;
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("De que raza es tu tamagochi? Perro, Pajaro o Pez");
            String raza = scanner.nextLine();
            nacer(raza, "Rex");
        }while (!isRaza);

    }
    // metodo para nacer el tamagochi, deveulve tipo de las tres posibles y nombre de tamagochi
    public static Tamagochi nacer(String raza, String nombre ){
        switch (raza.toLowerCase()){
            case "perro":
                Tamagochi perro = new Perro(nombre);
                isRaza= true;
                return perro;
            case "pajaro":
                Tamagochi pajaro = new Pajaro(nombre);
                isRaza= true;
                return pajaro;
            case "pez":
                Tamagochi pez = new Pez(nombre);
                isRaza= true;
                return pez;
            default:
                System.out.println("Nececitas introducir Perro, Pajaro o Pez");
                isRaza = false;
        }
        return null;
    }
}
