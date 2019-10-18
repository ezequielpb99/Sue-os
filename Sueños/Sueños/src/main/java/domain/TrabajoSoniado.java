package domain;

public class TrabajoSoniado extends Suenio {
    private Trabajo trabajo;

    public TrabajoSoniado(boolean estaCumplido, int felicidonios, Trabajo trabajo){
        super(estaCumplido, felicidonios);
        this.trabajo = trabajo;
    }

    @Override
    protected void verificarCondicionesPara(Persona unaPersona) {
        if (!(unaPersona.getSueldoSoniado() <= this.trabajo.getSueldo())){
            throw new SueldoBajo();
        }
    }

    @Override
    protected void cumplirPara(Persona unaPersona) {
        unaPersona.setTrabajo(this.trabajo);
    }
}
