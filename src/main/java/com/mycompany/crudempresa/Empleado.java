
package com.mycompany.crudempresa;

public class Empleado {
    //atributos
    private String nombre;
    private String cedula;
    private double salario;

    // constructor
    public Empleado(String nombre, String cedula, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
    }

    // Getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para representar al empleado como un String
 
    public String toString() {
        return "Empleado [Nombre=" + nombre + ", Cedula=" + cedula + ", Salario=" + salario + "]";
    }
}
