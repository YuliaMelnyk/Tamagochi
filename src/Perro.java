/**
 * @author yuliiamelnyk on 23/02/2020
 * @project Tamagochi
 */
public class Perro extends Tamagochi {

    //entre 0 y 100 cómo de satisfecha está su necesidad de pasearse
    byte paseo;

    public Perro(String nombre, byte hambre, byte sueno, byte higiene, byte diversion, byte paseo) {
        super(nombre, hambre, sueno, higiene, diversion);
        this.paseo = paseo;
    }

    public Perro(String nombre) {
        super(nombre);
        this.paseo = 100;
    }

    public byte getPaseo() {
        return paseo;
    }

    public void setPaseo(byte paseo) {
        this.paseo = paseo;
    }

    @Override
    public String toString() {
        String imprimeTamagochi = getNombre()+" - Perro\n"
                +"--------------------------\n"
                + super.toString()+
                "Paseo - " + paseo;
        return imprimeTamagochi;
    }

}
