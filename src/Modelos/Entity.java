package Modelos;
/*
* Clase padre de las entidades
* */
public abstract class Entity {
     private String Raza;
     private String Roller;
     private String Weapon;
     private String Name;
     private String Sexo;
     // stats
     private int Vida;
     private int Fuerza;
     private int Suerte;
     private int Inteligencia;
     private int Agilidad;
     private int Sabiduria;

    public String getRoller() {
        return Roller;
    }

    public void setRoller(String roller) {
        Roller = roller;
    }

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public int getFuerza() {
        return Fuerza;
    }

    public void setFuerza(int fuerza) {
        Fuerza = fuerza;
    }

    public int getSuerte() {
        return Suerte;
    }

    public void setSuerte(int suerte) {
        Suerte = suerte;
    }

    public int getInteligencia() {
        return Inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        Inteligencia = inteligencia;
    }

    public int getAgilidad() {
        return Agilidad;
    }

    public void setAgilidad(int agilidad) {
        Agilidad = agilidad;
    }

    public int getSabiduria() {
        return Sabiduria;
    }

    public void setSabiduria(int sabiduria) {
        Sabiduria = sabiduria;
    }
    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

}
