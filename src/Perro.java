/**
 * @author yuliiamelnyk on 23/02/2020
 * @project Tamagochi
 */
public class Perro extends Tamagotchi {

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
        String imprimeTamagochi = getNombre() + " - Perro\n"
                + "--------------------------\n"
                + super.toString() + "\n" +
                "Paseo - " + paseo;
        return imprimeTamagochi;
    }

    @Override
    public void vivir() {
        super.vivir();
        paseo -= 5;
    }

    @Override
    public boolean seHaMuerto() {
        if (paseo == 0) {
            return true;
        }
        return super.seHaMuerto();
    }

    public void pasear() {
        paseo += 15;
    }
}
