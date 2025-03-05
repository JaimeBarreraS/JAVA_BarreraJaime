/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dia11.SOLID.SRP;

/**
 *
 * @author Jaime Barrera
 */
public class Good {
    class Report{
    public void generateReport(){
        //Generea un informe
    }
}
    
class ReportSaver{
    public void saveToFile(String filaname, Report report){
            //Guarda el informe en un archivo
    }    
}

}
