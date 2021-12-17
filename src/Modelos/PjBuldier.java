package Modelos;

public class PjBuldier extends AbstracBuildierPjs {

    private Personaje Pjnuevo;

    public Personaje getPjnuevo() {
        return Pjnuevo;
    }

    public void setPjnuevo(Personaje pjnuevo) {
        Pjnuevo = pjnuevo;
    }

    public PjBuldier(){
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
