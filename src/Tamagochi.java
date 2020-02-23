/**
 * @author yuliiamelnyk on 23/02/2020
 * @project Tamagochi
 */
public abstract class Tamagochi {
    String nombre;
    byte hambre;
    byte sueno;
    byte higiene;
    byte diversion;

    public Tamagochi(String nombre) {
        this.nombre = nombre;
        this.hambre = 100;
        this.sueno = 100;
        this.higiene = 100;
        this.diversion = 100;
    }

    public Tamagochi(String nombre, byte hambre, byte sueno, byte higiene, byte diversion) {
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
                "Hambre - " + hambre + "\n"+
                "Sueno - " + sueno + "\n"+
                "Higiene - " + higiene + "\n"+
                "Diversion - " + diversion;
    }
}
