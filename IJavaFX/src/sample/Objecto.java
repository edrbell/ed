package sample;

import java.io.Serializable;

public class Objecto implements Serializable {
    public String nombre;
    public String apel;
    public String tlf;
    public String email;

    public Objecto() {
        this.nombre = "";
        this.apel = "";
        this.tlf = "";
        this.email = "";
    }

    public Objecto(String nombre, String apel, String tlf, String email) {
        this.nombre = nombre;
        this.apel = apel;
        this.tlf = tlf;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApel() {
        return apel;
    }

    public void setApel(String apel) {
        this.apel = apel;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
