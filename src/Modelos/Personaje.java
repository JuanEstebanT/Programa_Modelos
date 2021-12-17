package Modelos;

public class Personaje extends Razas{
    @Override
    public String toString() {
        return "Arma=" + getWeapon() + "<br>" +
                "Vida=" + getVida() + "<br>" +
                "Fuerza=" + getFuerza() + "<br>" +
                "Suerte=" + getSuerte() + "<br>" +
                "Inteligencia=" + getInteligencia() + "<br>" +
                "Agilidad=" + getAgilidad() + "<br>" +
                "Sabiduria=" + getSabiduria();
    }

}
