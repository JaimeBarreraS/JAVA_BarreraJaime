package Dia8;

/**
 *
 * @author Jaime Barrera
 */
public class main {
    //Estructuras de datos
    //Una estructura de datos es una forma organizada de almacenar, gestionar
    //y manioular datos para que puedan ser utilizado de manera eficiente.
    public static void main(String[] args) {
        
        //ARREGLOS
        //Un arreglo es una structira de datos que posibilita la agrupacion de 
        //elementos del mismo tipo en una sala variable.
        int[] arreglito;
        //un arreglo se debe inicializar para que tenga un espacio de memoria
        int[] arreglito2 = new int[5];
        arreglito2[0]=8;
        System.out.println(arreglito2[0]);
        System.out.println(arreglito2.length);
        
        for (int i = 0; i < arreglito2.length; i++) {
            System.out.println(arreglito2[i]);
        }
        
        
        //MATRICES
        //Son arreglos multidimensionales, donde en Java se crea
        //comúnmente las de dos dimensiones
        int[][] matriz = new int[3][2];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6;
        
        for (int i = 0; i < matriz.length; i++) {
      
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        /*int cantFilas = 3;
        int cantCol = 2;
        int[][] matriz = new int[cantFilas][cantCol];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6;
        
        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantCol; j++) {
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        */
    }
}
