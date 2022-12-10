/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORDENACIÓN_RÁPIDA;

/**
 *
 * @author Usuario
 */
public class EJEMPLO_01 {
    public static void quicksort(double a[]){
    quicksort(a, 0, a.length-1);
    }
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
    //Y la codificación del método recursivo:
    private static void quicksort(double a[], int primero, int ultimo)
    {
    int i, j, central;
    double pivote;
    central = (primero + ultimo)/2;
    pivote = a[central];
    i = primero;
    j = ultimo;
    do {
    while (a[i] < pivote) i++;
    while (a[j] > pivote) j--;
    if (i <= j)
    {
    intercambiar(a, i, j);
    i++;
    j--;
    }
    }while (i <= j);
    if (primero < j)
    quicksort(a, primero, j); // mismo proceso con sublista izqda
    if (i < ultimo)
    quicksort(a, i, ultimo); // mismo proceso con sublista drcha
    
    }
}
