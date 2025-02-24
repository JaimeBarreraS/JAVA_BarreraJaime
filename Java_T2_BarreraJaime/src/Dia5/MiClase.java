package Dia5;

/**
 *
 * @author Jaime Barrera
 */

//Declaracion de la clase
//se utiliza la plabra clase 'class', seguida del nombre de la clase (En este caso 'MiClase')
//donde por conveniencia el nombre de la clase empieza co  una mayuscula.

public class MiClase {
    
    //Atributos de la clase
    // Son variables que representan caracteristicas o propiedades
    // de las clases, las cuales pueden tener datos almacenados en casa
    // objeto de la clase,
    String atributo1;
    int atributo2;
    float atributo3;    
    
    // Constructores
    // son metodos especiales para creear e inicializar objetos de la clase.
    
    //1. Constructor Vacio: Una manera de instanciar la clase sin ninguna accion
    
    public MiClase(){}
    
    //2. Contructor Compuesto: Una manera de instanciar la clase como uno o varios de sus
    //atributos puestos.

    public MiClase(String atributo1, int atributo2, float atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }
    
    //Metodos de la clase
    // Son funciones que defienen el comportamiento de la clase.
    
    public void metodo1(){
        //Sin parametros y sin retorno
    }
    
    public int metodo2(){
        return 1; //Sin parametros y con retorno
    }
     
    public void metodo3(String a){
        System.out.println("a");//Con parametros y sin retorno
    }
    
    public int metodo4(int a){
        return a; //Con parametros y con retorno
    }
    
    // Metodo ToString
    // Es un metodo que sobreescribe el metodo por default 'ToString'
    //Con el fin de imprimir en consola una salida perzonalizada.
    @Override
    public String toString() {
        return "MiClase{" + "atributo1=" + atributo1 + ", atributo2=" + atributo2 + ", atributo3=" + atributo3 + '}';
    }
    
    
}
