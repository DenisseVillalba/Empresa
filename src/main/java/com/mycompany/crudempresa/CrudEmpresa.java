package com.mycompany.crudempresa;

import java.util.Scanner;

public class CrudEmpresa {

    public static void main(String[] args) {
        // leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        Empresa empresa1 = new Empresa("DENYUYU", "1756143622", "Calle S3L", "den.yuyu12@empresa.com");

        // Crear empleados a través de la empresa
        empresa1.crearEmpleado("Isabella Luciana Rodriguez Torres", "1718013723", 1550);
        empresa1.crearEmpleado("Lucas Pedro Flores Flores", "1659636620", 1900);

        // Elegir 
        boolean salir = false;
        while (!salir) {
            System.out.println("Opciones");
            System.out.println("1. Mostrar empleados");
            System.out.println("2. Buscar empleado por cedula");
            System.out.println("3. Buscar empleado por nombre");
            System.out.println("4. Eliminar empleado por cedula");
            System.out.println("5. Eliminar empleado por nombre");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Mostrar empleados
                    empresa1.mostrarEmpleados();
                    break;
                case 2:
                    // Buscar empleado por cedula
                    System.out.print("Ingresa la cedula del empleado a buscar: ");
                    String cedulaBuscar = scanner.nextLine();
                    empresa1.buscarEmpleadoPorCedula(cedulaBuscar);
                    break;
                case 3:
                    // Buscar empleado por nombre
                    System.out.print("Ingresa el nombre del empleado a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    empresa1.buscarEmpleadoPorNombre(nombreBuscar);
                    break;
                case 4:
                    // Eliminar empleado por cédula
                    System.out.print("Ingresa la cedula del empleado a eliminar: ");
                    String cedulaEliminar = scanner.nextLine();
                    empresa1.eliminarEmpleadoPorCedula(cedulaEliminar);
                    break;
                case 5:
                    // Eliminar empleado por nombre
                    System.out.print("Ingresa el nombre del empleado a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    empresa1.eliminarEmpleadoPorNombre(nombreEliminar);
                    break;
                case 6:
                    // Salir
                    System.out.println("¡Hasta luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }
    }
}
