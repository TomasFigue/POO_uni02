/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seleccion;

/**
 *
 * @author tom59
 */
public class DirectorTecnico extends Persona {

    private String nacionalidad;
    private int yearsTrayectoria;

    public String mostrarInfo() {
        return "El técnico se llama: " + this.getNombre() + " es de nacionalidad"
                + this.nacionalidad + " Nació en el año:"
                + this.getFechaNacimiento() + " tiene " + this.yearsTrayectoria
                + " años de trayectoria";
    }

    public void setNacionalidad(String n) {
        this.nacionalidad = n;
    }

    public void setYearsTrayectoria(int yearsTrayectoria) {
        this.yearsTrayectoria = yearsTrayectoria;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getYearsTrayectoria() {
        return yearsTrayectoria;
    }

}
