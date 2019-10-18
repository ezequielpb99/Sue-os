package domain;

import java.util.List;

public class Persona {
    private String nombre;
    private int dni;
    private List<Suenio> suenio;
    private List<Carrera> carrerasHechas;
    private List<Carrera> carrerasSoniadas;
    private int cantViajes;
    private Trabajo trabajo;
    private double sueldoSoniado;

    public String getNombre() {
        return nombre;
    }
    public Trabajo getTrabajo() {
        return trabajo;
    }
    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public List<Suenio> getSuenio() {
        return suenio;
    }
    public void setSuenio(List<Suenio> suenio) {
        this.suenio = suenio;
    }
    public List<Carrera> getCarrerasHechas() {
        return carrerasHechas;
    }
    public void setCarrerasHechas(List<Carrera> carrerasHechas) {
        this.carrerasHechas = carrerasHechas;
    }
    public List<Carrera> getCarrerasSoniadas() {
        return carrerasSoniadas;
    }
    public void setCarrerasSoniadas(List<Carrera> carrerasSoniadas) {
        this.carrerasSoniadas = carrerasSoniadas;
    }
    public int getCantViajes() {
        return cantViajes;
    }
    public void setCantViajes(int cantViajes) {
        this.cantViajes = cantViajes;
    }
    public double getSueldoSoniado() {
        return sueldoSoniado;
    }
    public void setSueldoSoniado(double sueldoSoniado) {
        this.sueldoSoniado = sueldoSoniado;
    }

    public void cumplirSuenio(Suenio suenio, Persona unaPersona){
       suenio.serCumplidoPor(unaPersona);
    }

    public boolean yaTeRecibisteDe(Carrera unaCarrera){
        return this.getCarrerasHechas().stream().anyMatch(c -> c == unaCarrera);
    }

    public boolean queresRecibirteDe(Carrera unaCarrera){
        return this.getCarrerasSoniadas().stream().anyMatch(c -> c == unaCarrera);
    }

    public void agregarCarrera(Carrera unaCarrera){
        carrerasHechas.add(unaCarrera);
    }



    public void viaja(String destino){
        cantViajes++;
    }
}
