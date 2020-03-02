/**
 * @author yuliiamelnyk on 23/02/2020
 * @project Tamagochi
 */
public class Pez extends Tamagotchi {

    public Pez(String nombre, byte hambre, byte sueno, byte higiene, byte diversion) {
        super(nombre, hambre, sueno, higiene, diversion);
    }

    public Pez(String nombre) {
        super(nombre);
    }
    @Override
    public String toString() {
        String imprimeTamagochi = getNombre()+" - Pez\n"
                +"--------------------------\n"
                + super.toString();
        return imprimeTamagochi;
    }

    @Override
    public void vivir() {
        super.vivir();
    }

    @Override
    public boolean seHaMuerto() {
        return super.seHaMuerto();
    }
}
