package Modelos;

public abstract class AbstracBuildierPjs implements Buldier<Personaje> {
    /**
     * Métodos abstractos para configurar el personaje
     *
     */
    public abstract AbstracBuildierPjs ConfigRaza(String Raza);
    public abstract AbstracBuildierPjs ConfigRoll(String Rol);
    public abstract AbstracBuildierPjs ConfigNombre(String Nombre);
    public abstract AbstracBuildierPjs ConfigSexo(String Sexo);
}
