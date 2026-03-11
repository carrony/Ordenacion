public class Ordenaciones {
    public static void burbuja(int[] numeros){
        for (int i = 0; i < numeros.length; i++){
            for (int j = i+1; j < numeros.length; j++){
                if (numeros[i] > numeros[j]){
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
    }
}
