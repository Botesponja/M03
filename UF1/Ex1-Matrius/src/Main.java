public class Main {


    public static void main(String[] args) {
        int[][] numeros = new int[5][5];

        int contador = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = contador;
                contador++;
                
            }
        }

        System.out.println("Matriz de 5x5 con numeros del 1 al 25: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numeros[i][j]);
            }
            System.out.println();
        }
    }
}