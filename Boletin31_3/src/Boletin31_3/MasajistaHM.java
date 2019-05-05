/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin31_3;

/**
 *
 * @author Mirroriced
 */
public class MasajistaHM extends SeleccionFutbolHM implements IntegranteInterface {

    private String titulacion;
    private int anhosExperiencia;

    public MasajistaHM(String titulacion, int anhosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anhosExperiencia = anhosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAnhosExperiencia(int anhosExperiencia) {
        this.anhosExperiencia = anhosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnhosExperiencia() {
        return anhosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista: "+super.toString() + ", Titulacion = " + titulacion + ", Años Experiencia=" + anhosExperiencia;
    }

}
