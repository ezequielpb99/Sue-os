package domain;

public class Adoptar extends Suenio {
    private int cantidad;

    public Adoptar(boolean estaCumplido, int felicidonios, int cantidad){
        super(estaCumplido, felicidonios);
        this.cantidad = cantidad;
    }

    @Override
    protected void verificarCondicionesPara(Persona unaPersona) {

    }

    @Override
    protected void cumplirPara(Persona unaPersona) {

    }
}
