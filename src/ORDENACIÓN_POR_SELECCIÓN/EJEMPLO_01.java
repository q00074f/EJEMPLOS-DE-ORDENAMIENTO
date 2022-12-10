/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORDENACIÓN_POR_SELECCIÓN;

/**
 *
 * @author Usuario
 */
public class EJEMPLO_01 {
    public static void seleccion(int A[]) {
          int i, j, menor, pos, tmp;
          for (i = 0; i < A.length - 1; i++) {      // tomamos como menor el primero
                menor = A[i];                       // de los elementos que quedan por ordenar                    
                pos = i;                            // y guardamos su posición
                for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                      if (A[j] < menor) {           // del array algún elemento
                          menor = A[j];             // menor que el actual
                          pos = j;
                      }
                }
                if (pos != i){                      // si hay alguno menor se intercambia                         
                    tmp = A[i];
                    A[i] = A[pos];
                    A[pos] = tmp;
                }
          }
    }
}
