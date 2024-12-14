
package trabajoenclases;

class Ave extends Animal {
    //atributos
    public double envergaduraAlas;

    public Ave(String nombre, int edad, double envergaduraAlas) {
        super(nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
    }
    //metodos
    public void volar() {
        System.out.println(nombre + " esta volando con una envergadura de " + envergaduraAlas + " metros.");
    }
}
