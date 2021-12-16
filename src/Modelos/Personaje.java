package Modelos;

public class Personaje extends Razas{
    @Override
    public String toString() {
        return "Modelos.Personaje{" +
                "Raza='" + getRaza() + '\'' +
                ", Roller='" + getRoller() + '\'' +
                ", Weapon='" + getWeapon() + '\'' +
                ", Name='" + getName() + '\'' +
                ", Sexo='" + getSexo() + '\'' +
                ", Vida=" + getVida() +
                ", Fuerza=" + getFuerza() +
                ", Suerte=" + getSuerte() +
                ", Inteligencia=" + getInteligencia() +
                ", Agilidad=" + getAgilidad() +
                ", Sabiduria=" + getSabiduria() +
                '}';
    }

}
