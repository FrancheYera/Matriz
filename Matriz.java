import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            int matriz1 [] [] = {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
            int matriz2 [] [] = {{0,1,1,1},{0,0,1,1},{0,0,0,1},{0,0,0,0}};
            int matriz3 [] [] = {{0,0,0,0},{0,1,1,1},{0,0,1,1},{0,1,1,1}};
            do{
                System.out.println("Ingrese opcion: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.print(matriz1[i][j]);
                                }
                                System.out.println("");
                            }
                        break;
                    case 2:
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.print(matriz2[i][j]);
                                }
                                System.out.println("");
                            }
                        break;
                    case 3:
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.print(matriz3[i][j]);
                                }
                                System.out.println("");
                            }
                        break;
                }
            }while((opcion<=0) || (opcion>=4));
         }
    }

}