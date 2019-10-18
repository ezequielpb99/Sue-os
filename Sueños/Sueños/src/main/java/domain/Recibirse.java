package domain;

public class Recibirse extends Suenio {
    private Carrera carrera;

    public Recibirse(boolean estaCumplido, int felicidonios, Carrera carrera){
        super(estaCumplido, felicidonios);
        this.carrera = carrera;
    }

    public Carrera getCarrera() {
        return carrera;
    }
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    protected void verificarCondicionesPara(Persona unaPersona) {
        if (!((unaPersona.yaTeRecibisteDe(this.carrera)) && (unaPersona.queresRecibirteDe(this.carrera)))){
            throw new NoCumpleSuenio();
        }

    }

    @Override
    protected void cumplirPara(Persona unaPersona) {
        unaPersona.agregarCarrera(this.carrera);
    }

}
