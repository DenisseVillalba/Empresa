
package trabajoenclases;


class Mamifero extends Animal {
    //atributos
    public String tipoPelaje;

    public Mamifero(String nombre, int edad, String tipoPelaje) {
        super(nombre, edad);
        this.tipoPelaje = tipoPelaje;
    }
    //metodos
    public void amamantarCrias() {
        System.out.println(nombre + " esta amamantando a sus crias.");
    }
}
