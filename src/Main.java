import java.util.Scanner;

/**
 * @author yuliiamelnyk on 23/02/2020
 * @project Tamagochi
 */
public class Main {
    public static boolean isRaza = false;
    public static boolean isSalirMenu = false;
    public static Tamagotchi tamagotchi;
    public static Scanner scanner;

    public static void main(String[] args) {
        do {
            scanner = new Scanner(System.in);
            System.out.println("De que raza es tu tamagochi? Perro, Pajaro o Pez");
            String raza = scanner.nextLine();
            System.out.println("Introduzca nombre de tu mascota");
            String nombre = scanner.nextLine();
            tamagotchi = nacer(raza, nombre);
            System.out.println(tamagotchi.toString());
        } while (!isRaza);
        do {
            if(tamagotchi.seHaMuerto()){
                System.out.println("Tu tamagotchi se ha muerto.");
                break;
            }
            if (tamagotchi.getClass().getName() == "Perro") {
                System.out.println("Menu: \n0 - Salir \n1 - No hacer nada \n2 - Dar de comer \n3 - Dormir  \n4 - Bañar \n5 - Jugar \n6 - Pasear");
                int menu = scanner.nextInt();
                menu(menu);
            } else if (tamagotchi.getClass().getName() == "Pajaro") {
                System.out.println("Menu: \n0 - Salir \n1 - No hacer nada \n2 - Dar de comer \n3 - Dormir  \n4 - Bañar \n5 - Jugar \n6 - Sacar a volar");
                int menu = scanner.nextInt();
                menu(menu);
            } else {
                System.out.println("Menu: \n0 - Salir \n1 - No hacer nada \n2 - Dar de comer \n3 - Dormir  \n4 - Bañar \n5 - Jugar ");
                int menu = scanner.nextInt();
                menu(menu);
            }

        } while (!isSalirMenu);

    }

    // metodo para nacer el tamagochi, deveulve tipo de las tres posibles y nombre de tamagochi
    public static Tamagotchi nacer(String raza, String nombre) {
        switch (raza.toLowerCase()) {
            case "perro":
                Tamagotchi perro = new Perro(nombre);
                isRaza = true;
                return perro;
            case "pajaro":
                Tamagotchi pajaro = new Pajaro(nombre);
                isRaza = true;
                return pajaro;
            case "pez":
                Tamagotchi pez = new Pez(nombre);
                isRaza = true;
                return pez;
            default:
                System.out.println("Nececitas introducir Perro, Pajaro o Pez");
                isRaza = false;
        }
        return null;
    }

    // metodo para elejir el caso del menu
    public static void menu(int menu) {
        switch (menu) {
            case 0:
                isSalirMenu = true;
                break;
            case 1:
                System.out.println("No haces nada, tu mascota hecha de menos a ti");
                tamagotchi.vivir();
                System.out.println(tamagotchi.toString());
                break;
            case 2:
                System.out.println("Come mi mascota favorita, come!");
                tamagotchi.comer();
                tamagotchi.vivir();
                System.out.println(tamagotchi.toString());
                break;
            case 3:
                System.out.println("Veo, que estes cansado, duermete un poco");
                tamagotchi.dormir();
                tamagotchi.vivir();
                System.out.println(tamagotchi.toString());
                break;
            case 4:
                System.out.println("Hueles mal, mi pequenito, hay que bañarte");
                tamagotchi.baniarse();
                tamagotchi.vivir();
                System.out.println(tamagotchi.toString());
                break;
            case 5:
                System.out.println("Vamos a jugar en DOOM");
                tamagotchi.jugar();
                tamagotchi.vivir();
                System.out.println(tamagotchi.toString());
                break;
            case 6:
                if (tamagotchi.getClass().getName() == "Perro") {
                    System.out.println("Que buen tiempo! Nos damos a paseo!");
                    ((Perro)tamagotchi).pasear();
                    tamagotchi.vivir();
                    System.out.println(tamagotchi.toString());
                } else if (tamagotchi.getClass().getName() == "Pajaro") {
                    System.out.println("Vamos a volar, mi cielo!");
                    ((Pajaro)tamagotchi).volar();
                    tamagotchi.vivir();
                    System.out.println(tamagotchi.toString());
                } else {
                    System.out.println("Accion incorecta, introduzca otra vez");
                    tamagotchi.vivir();
                    System.out.println(tamagotchi.toString());
                }
                break;
            default:
                System.out.println("Accion incorecta, introduzca otra vez");
                break;
        }
    }
}



























