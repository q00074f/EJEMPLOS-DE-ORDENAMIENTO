/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORDENACIÓN_POR_INSERCIÓN;

/**
 *
 * @author Usuario
 */
public class EJEMPLO_02 {
    #include <stdio.h> 
    int arreglo[10] = {3,10,1,8,15,5,12,6,5,4}; /*Declaracion e inicialización 
del arreglo. */
       
/*imprimearreglo - Funcion que muestra por pantalla 
el contenido de un arreglo.*/ 
void imprimearreglo() { 
    int i; for (i=0;i<10;i++) 
        printf("Elemento %d: %d \n",i,arreglo[i]); 
} 
        
void main() /*Funcion Principal del Programa*/ 
{ 
    int i,j,k;
    imprimearreglo(); 
    for (i=1; i<10; i++) { 
        j=i; 
            while (j>=0 && arreglo[j]<arreglo[j-1]) { 
                k=arreglo[j]; 
                arreglo[j]=arreglo[j-1]; 
                arreglo[j-1]=k; 
                j--; 
            } 
    } 
    printf("\n\nArreglo ordenado \n\n"); 
    imprimearreglo(); 
}
	
}
