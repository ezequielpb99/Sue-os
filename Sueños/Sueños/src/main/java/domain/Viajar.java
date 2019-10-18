package domain;

public class Viajar extends Suenio {

    private String destino;

    public Viajar(boolean estaCumplido, int felicidonios, String destino){
        super(estaCumplido,felicidonios);
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }



    @Override
    protected void verificarCondicionesPara(Persona unaPersona) {

    }

    @Override
    protected void cumplirPara(Persona unaPersona) {
        unaPersona.viaja(this.destino);
    }
}
