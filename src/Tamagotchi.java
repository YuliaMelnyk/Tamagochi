/**
 * @author yuliiamelnyk on 23/02/2020
 * @project Tamagochi
 */
public abstract class Tamagotchi {
    String nombre;
    byte hambre;
    byte sueno;
    byte higiene;
    byte diversion;

    public Tamagotchi(String nombre) {
        this.nombre = nombre;
        this.hambre = 100;
        this.sueno = 100;
        this.higiene = 100;
        this.diversion = 100;
    }

    public Tamagotchi(String nombre, byte hambre, byte sueno, byte higiene, byte diversion) {
        this.nombre = nombre;
        this.hambre = hambre;
        this.sueno = sueno;
        this.higiene = higiene;
        this.diversion = diversion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getHambre() {
        return hambre;
    }

    public void setHambre(byte hambre) {
        this.hambre = hambre;
    }

    public byte getSueno() {
        return sueno;
    }

    public void setSueno(byte sueno) {
        this.sueno = sueno;
    }

    public byte getHigiene() {
        return higiene;
    }

    public void setHigiene(byte higiene) {
        this.higiene = higiene;
    }

    public byte getDiversion() {
        return diversion;
    }

    public void setDiversion(byte diversion) {
        this.diversion = diversion;
    }

    @Override
    public String toString() {
        return
                "Hambre - " + hambre + "\n" +
                        "Sueno - " + sueno + "\n" +
                        "Higiene - " + higiene + "\n" +
                        "Diversion - " + diversion;
    }

    public void vivir() {
        hambre -= 5;
        sueno -= 5;
        higiene -= 5;
        diversion -= 5;
    }

    public boolean seHaMuerto() {
        if (hambre == 0 || sueno == 0 || higiene == 0 || diversion == 0) {
            return true;
        }
        return false;
    }

    public void comer() {
        hambre += 15;
    }

    public void dormir() {
        sueno += 15;
    }

    public void baniarse() {
        higiene += 15;
    }

    public void jugar() {
        diversion += 15;
    }

    // metodo para nacer el tamagochi, deveulve tipo de las tres posibles y nombre de tamagochi
    public final static Tamagotchi nacer(String raza, String nombre) {
        switch (raza.toLowerCase()) {
            case "perro":
                Tamagotchi perro = new Perro(nombre);
                Main.isRaza = true;
                return perro;
            case "pajaro":
                Tamagotchi pajaro = new Pajaro(nombre);
                Main.isRaza = true;
                return pajaro;
            case "pez":
                Tamagotchi pez = new Pez(nombre);
                Main.isRaza = true;
                return pez;
            default:
                System.out.println("Nececitas introducir Perro, Pajaro o Pez");
                Main.isRaza = false;
        }
        return null;
    }

}
