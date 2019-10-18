package domain;

public abstract class Suenio {
    protected boolean estaCumplido;
    protected int felicidonios;

    public Suenio(Boolean estaCumplido, int felicidonios){
        this.estaCumplido = estaCumplido;
        this.felicidonios = felicidonios;
    }

    protected abstract void verificarCondicionesPara(Persona unaPersona);

    protected abstract void cumplirPara(Persona unaPersona);

    public void serCumplidoPor(Persona unaPersona){
        if (!estaCumplido){
            verificarCondicionesPara(unaPersona);

            cumplirPara(unaPersona);

            estaCumplido = true;

        }
    }
}
