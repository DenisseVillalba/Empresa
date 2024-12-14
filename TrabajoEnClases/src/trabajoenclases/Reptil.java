
package trabajoenclases;


class Reptil extends Animal {
    //atributos
    public String tipoEscamas;

    public Reptil(String nombre, int edad, String tipoEscamas) {
        super(nombre, edad);
        this.tipoEscamas = tipoEscamas;
    }
    //metodos
    public void arrastrarse() {
        System.out.println(nombre + " se esta arrastrando con sus escamas de tipo Escamas" + tipoEscamas + ".");
    }
}



