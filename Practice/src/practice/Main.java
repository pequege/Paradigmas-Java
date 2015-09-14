package practice;

import static practice.Ordenamiento.burbuja;

public class Main {
    public static void main(String[] args) {
        int numeros[] = { 3 , 15 , 20 , 7 , 55 , 14 , 1 , 24 };
        burbuja(numeros);
        for ( int i = 0; i < numeros.length ; i++) {
        System.out.println(numeros[i]);
        }
    }
    
}
