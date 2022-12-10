/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ORDENACIÓN_POR_INTERCAMBIO;

/**
 *
 * @author Usuario
 */
public class EJEMPLO_01 {

    public static void intercambiar(int []a, int i, int j){
        int aux = a[i];
        a[i] = a[j];
        a[j]= aux ;
        }
//El array (arreglo) dispone de tantos elementos como posiciones creadas. Por ello el método ordIntercambio() tiene un único argumento (int [] a); el atributo a.length es el valordel número de elementos (n).
public static void ordIntercambio (int a[]) {
    int i, j;
    for (i = 0 ; i < a.length-1; i++)
    // sitúa mínimo de a[i+1]...a[n-1] en a[i]
    for (j = i+1 ; j < a.length; j++)
    if (a[i] > a[j]){
        intercambiar(a, i, j);
        }
    }
}
