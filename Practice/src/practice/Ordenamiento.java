package practice;
public class Ordenamiento {
    public static void burbuja(int vector[]) {
    int i, j, k, aux;
    for ( i=0; i < vector.length - 1; i++){
        for ( j=0; j < vector.length - i -1; j++){
            if ( vector[j+1] < vector[j] ) {
                aux = vector[j+1];
                vector[j+1] = vector[j];
                vector[j] = aux;
                for (k = 0; k < vector.length; k++){
                    System.out.print(vector[k] + ";");
                    }
                }
            System.out.println("\n-------------");
            }
        }
    }
}
