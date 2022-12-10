/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORDENACIÓN_SHELL;

/**
 *
 * @author Usuario
 */
public class EJEMPLO_01 {
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
    public static void ordenacionShell(double a[]){
    int intervalo, i, j, k;
    int n= a.length;
    intervalo = n / 2;
    while (intervalo > 0)
    {
    for (i = intervalo; i < n; i++)
    {
    j = i - intervalo;
    while (j >= 0)
    {
    k = j + intervalo;
    if (a[j] <= a[k])
    j = -1; // par de elementos ordenado
    else
    {
    intercambiar(a, j, j+1);
    j -= intervalo;
    }
    }
    }
    intervalo = intervalo / 2;
    }
    }
}
