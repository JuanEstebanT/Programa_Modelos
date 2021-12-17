package Modelos;

public class Roles extends Entity{
    public void Arquero(){
        setVida(100);
        setAgilidad(41);
        setFuerza(39);
        setSuerte(69);
        setInteligencia(70);
        setRoller("Arquero");
        setSabiduria(20);
        setWeapon("Arco cazador");
    }
    public void Mago(){
        setVida(100);
        setAgilidad(30);
        setFuerza(20);
        setSuerte(54);
        setInteligencia(90);
        setRoller("Mago");
        setSabiduria(70);
        setWeapon("Libro melodias oscura");
    }
    public void Caballero(){
        setVida(100);
        setAgilidad(50);
        setFuerza(70);
        setSuerte(40);
        setInteligencia(60);
        setRoller("Caballero");
        setSabiduria(29);
        setWeapon("Espada ligera");
    }
    public void Curandero(){
        setVida(100);
        setAgilidad(29);
        setFuerza(17);
        setSuerte(91);
        setInteligencia(65);
        setRoller("Curandero");
        setSabiduria(70);
        setWeapon("Libro curaciones");
    }
}
