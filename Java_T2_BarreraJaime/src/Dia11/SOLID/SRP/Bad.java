package Dia11.SOLID.SRP;

/**
 *
 * @author Jaime Barrera
 */
public class Bad {
    //1.S – Single Responsibility Principle (SRP) Principio de responsabilidad única
    //Una clase debe tener una unica razon para cambiar
    //, es decir, debe encargarse de una sola responsabilidad
    
    class Report{
    public void generateReport(){
        //Genera un informe
    }
    
    public void saveToFile(String filiname){
        //Guarda el informe en un archivo (Violacion de SRP)
    }
    
    //¿Que esta mal? la clase report tiene dos responsabilidades:
    //genera el informe y guardarlo en un archivo.
    }
}
