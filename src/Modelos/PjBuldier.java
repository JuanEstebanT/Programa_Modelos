package Modelos;

import java.util.ArrayList;

public class PjBuldier extends AbstracBuildierPjs {

    private Personaje Pjnuevo;
    private ArrayList<Personaje> PjGuardados = new ArrayList<Personaje>();

    /*
    Guarda los personajes creados
     */
    public ArrayList<Personaje> getPjGuardados() {
        return PjGuardados;
    }

    public Personaje getPjnuevo() {
        return Pjnuevo;
    }
    /*
       oculta la instacia del demas codigo
     */
    private PjBuldier(){
        this.Pjnuevo = new Personaje();
    }

    public static PjBuldier Pjnuevo(){
        return new PjBuldier();
    }
/**
 *  Metodos para configurar personaje
 */
    @Override
    public Personaje build() {
        PjGuardados.add(Pjnuevo);
        return Pjnuevo;
    }

    @Override
    public AbstracBuildierPjs ConfigRaza(String Raza) {
        this.Pjnuevo.selctraza(Raza);
        return this;
    }

    @Override
    public AbstracBuildierPjs ConfigRoll(String Rol) {
        switch (Rol){
            case "Arquero": this.Pjnuevo.Arquero(); break;
            case "Mago": this.Pjnuevo.Mago(); break;
            case "Caballero": this.Pjnuevo.Caballero(); break;
            case "Curandero": this.Pjnuevo.Curandero(); break;
            default: break;
        }
        return this;
    }

    @Override
    public AbstracBuildierPjs ConfigNombre(String Nombre) {
        this.Pjnuevo.setName(Nombre);
        return this;
    }

    @Override
    public AbstracBuildierPjs ConfigSexo(String Sexo) {
        this.Pjnuevo.setSexo(Sexo);
        return this;
    }
}
