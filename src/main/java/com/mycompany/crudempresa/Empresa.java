
package com.mycompany.crudempresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    //atributos
    private String nombre;
    private String ruc;
    private String direccion;
    private String email;
    private List<Empleado> empleados;

    // constructor
    public Empresa(String nombre, String ruc, String direccion, String email) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.email = email;
        this.empleados = new ArrayList<>();
    }

    // Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    // agregar un empleado
    public void crearEmpleado(String nombre, String cedula, double salario) {
        Empleado empleado = new Empleado(nombre, cedula, salario);
        empleados.add(empleado);
    }

    // mostrar todos los empleados
    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }

    // buscar un empleado por cédula
    public void buscarEmpleadoPorCedula(String cedula) {
        boolean encontrado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getCedula().equals(cedula)) {
                System.out.println("Empleado encontrado: " + empleado);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Empleado con cedula " + cedula + " no encontrado.");
        }
    }

    // buscar un empleado por nombre
    public void buscarEmpleadoPorNombre(String nombre) {
        boolean encontrado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Empleado encontrado: " + empleado);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Empleado con nombre " + nombre + " no encontrado.");
        }
    }

    // eliminar un empleado por cédula
    public void eliminarEmpleadoPorCedula(String cedula) {
        boolean eliminado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getCedula().equals(cedula)) {
                empleados.remove(empleado);
                System.out.println("Empleado con cedula " + cedula + " eliminado.");
                eliminado = true;
                break;
            }
        }
        if (!eliminado) {
            System.out.println("Empleado con cedula " + cedula + " no encontrado.");
        }
    }

    // eliminar un empleado por nombre
    public void eliminarEmpleadoPorNombre(String nombre) {
        boolean eliminado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                empleados.remove(empleado);
                System.out.println("Empleado con nombre " + nombre + " eliminado.");
                eliminado = true;
                break;
            }
        }
        if (!eliminado) {
            System.out.println("Empleado con nombre " + nombre + " no encontrado.");
        }
    }
}
