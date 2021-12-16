package Modelos;

public class PjBuldier extends AbstracBuildierPjs {
    private Personaje Pjnuevo;

    private PjBuldier(){
        this.Pjnuevo = new Personaje();
    }

    public static PjBuldier Pjnuevo(){
        return new PjBuldier();
    }

    @Override
    public Personaje build() {
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
            case "Arquero": this.Pjnuevo.arquero();
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
