/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORDENACIÓN_POR_SELECCIÓN;

/**
 *
 * @author Usuario
 */
public class Ejemplo_02 {
    public static void intercambiar(int a[], int i, int j){
        int aux = a[i];
        a[i] = a[j];
        a[j]= aux ;
        }
        //El array (arreglo) dispone de tantos elementos como posiciones creadas. Por ello el método ordIntercambio() tiene un único argumento (int [] a); el atributo a.length es el valor del número de elementos (n).
        public static void ordIntercambio (int a[])

        {
        int i, j;
        for (i = 0 ; i < a.length-1; i++)
        // sitúa mínimo de a[i+1]...a[n-1] en a[i]
        for (j = i+1 ; j < a.length; j++)
        if (a[i] > a[j])
        {
        intercambiar(a, i, j);
        }
    }
    public static void ordSeleccion (double a[]){
    int indiceMenor, i, j, n;
    n = a.length;
    for (i = 0; i < n-1; i++)
    {
    // comienzo de la exploración en índice i
    indiceMenor = i;
    // j explora la sublista a[i+1]..a[n-1]
    for (j = i+1; j < n; j++)
    if (a[j] < a[indiceMenor])
    indiceMenor = j;
    // sitúa el elemento mas pequeño en a[i]
    if (i != indiceMenor)
    intercambiar(a, i, indiceMenor);
    }
    }
}
