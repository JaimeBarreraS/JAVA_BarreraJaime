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
        
        //Ciclo anidado
        for (int i = 0; i < matriz.length; i++) {
      
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        int cantFilas = 3;
        int cantCol = 3;
        //int[][] matriz = new int[cantFilas][cantCol];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;
        
        //Ciclo anidado
        //for (int i = 0; i < cantFilas[0]; i++) {
            //System.out.print(" "+matriz[i]+" ");
        }
        
    }
        
// Declaracion de un ArrayListy de "String". Puede ser de cualquier de cualquier otro Elemento u Objeto (float, Boolean Object, ...)       
//ArrayList<String> nombreArrayList = new ArrayList<String>(); 

// Añade el elemento al ArrayList
//nombreArrayList.add("Elemento");

// Añade el elemento al ArrayList en la posición 'n'
//nombreArrayList.add(5, "Elemento 2");

// Devuelve el número de elementos del ArrayList
//nombreArrayList.size();

// Devuelve el elemento que está en la posición '2' del ArrayList
//nombreArrayList.get(2);

// Comprueba si existe el elemento ('Elemento') que se le pasa como parámetro
//nombreArrayList.contains("Elemento");

// Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList
//nombreArrayList.indexOf("Elemento");

// Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList
//nombreArrayList.lastIndexOf("Elemento");

// Borra el elemento de la posición '5' del ArrayList
//nombreArrayList.remove(5);

// Borra la primera ocurrencia del 'Elemento' que se le pasa como parámetro.
//nombreArrayList.remove("Elemento");

// Borra todos los elementos de ArrayList
//nombreArrayList.clear();

// Devuelve True si el ArrayList está vacío. Sino devuelve False
//nombreArrayList.isEmpty();

//Copiar un ArrayList
//ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();
    //}
//}



//CicloAnidados (Ciclo dentro de otro ciclo)
//Interfaz para las clases
//clases para objetos
