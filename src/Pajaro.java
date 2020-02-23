/**
 * @author yuliiamelnyk on 23/02/2020
 * @project Tamagochi
 */
public class Pajaro extends Tamagochi {

    //entre 0 y 100 cómo de satisfecha está su necesidad de volar
    byte vuelo;

    public Pajaro(String nombre, byte hambre, byte sueno, byte higiene, byte diversion, byte vuelo) {
        super(nombre, hambre, sueno, higiene, diversion);
        this.vuelo = vuelo;
    }

    public Pajaro(String nombre) {
        super(nombre);
        this.vuelo = 100;
    }

    public byte getVuelo() {
        return vuelo;
    }

    public void setVuelo(byte vuelo) {
        this.vuelo = vuelo;
    }
}
