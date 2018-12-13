/*
 El siguiente programa ejecuta el metodo de Ordenamiento Directo o (Ordenamiento Burbuja)
 */
package ordenamientoburbuja;

import java.util.Scanner;

public class OrdenamientoBurbuja {
    
    public static void main(String[] args) {
        
        int arreglo [];
        int espacio = 0; // espacio total del arreglo
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el numero de espacios para el arreglo: ");
        espacio = sc.nextInt();
        
        System.out.println("\n¡Espacios cargados correctamente!");
        
        arreglo = new int [espacio];
        
        System.out.println("Perfecto, vamos a ingresar numeros a este arreglo!\n");
        
        int numero = 0;
        for(int cont = 0; cont < arreglo.length; cont ++){
            System.out.printf("Espacio [%d] -> ", cont);
            numero = sc.nextInt();
            arreglo[cont] = numero;
        }
        
        System.out.printf("\nAquí esta el arreglo que acabas de llenar\n");
        
        for(int cont = 0; cont < arreglo.length; cont ++){
            System.out.printf("[%d] ", arreglo[cont]);
        }
        System.out.printf("\n\n¡Vamos a Ordenarlo con Burbuja o Método de intercambio directo!\n\n");
        
        int f = espacio - 1; // ultima posicion del arreglo
        int p = f - 1; // posicion penultima del arreglo
        int aux = 0; // auxiliar
        int n_intercambios = 0; // numero de intercambios realizados por el programa
        //int intercambio = espacio - 1;
        int n_pasadas = 0;
        int pasada;
       
        
        for(pasada = 0; pasada < espacio - 1; pasada++){
            
            for(int comparacion = espacio - 1 ; comparacion > 0; comparacion--){
                if(arreglo[p] > arreglo[f]){
                    aux = arreglo[f];
                    arreglo[f] = arreglo[p];
                    arreglo[p] = aux;
                    n_intercambios += 1;
                }
                p -= 1;
                f -= 1;
            }
            
            f = espacio - 1;
            p = f - 1;
           
        }
        
         n_pasadas = pasada;
         
        System.out.printf("¡Tu arreglo ha sido ordenado!\n");
        for(int i = 0; i < arreglo.length; i++){
            System.out.printf("[%d] ", arreglo[i]);
        }
        
        System.out.printf("\n\nLas veces que un número fue intercambiado fueron %d\n%s%d\n\n", n_intercambios,
                "y el numero de pasadas fue ", n_pasadas);
    }
    
}
