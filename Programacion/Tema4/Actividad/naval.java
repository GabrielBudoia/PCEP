import java.util.Scanner;

public class naval{

    public static void main(String[] args) {
        
        int[][] tabuleiro = {
            {0,0,1,0,0},
            {0,0,0,1,0},
            {0,0,0,1,1},
            {1,0,0,1,0},
            {0,0,0,0,0}
        };

        try (Scanner ataque = new Scanner(System.in)) {
            int linea, columna;

            while (true){

                System.out.println("tabuleiro");
                for (int i = 0; i < tabuleiro.length; i++) {
                    for(int j = 0; j < tabuleiro[i].length; j++) {
                        System.out.print(tabuleiro[i][j]+ " ");
                    }
                    System.out.println();
                }


                    System.out.println("digite una linea [0-4]:");
                     linea = ataque.nextInt();
                    System.out.println("Una columna [0-4]:");
                     columna = ataque.nextInt();


                    if (tabuleiro[linea][columna] == 1){
                    System.out.println("Acertou!!");
                    tabuleiro[linea][columna] = 0;
                    } else { System.out.println("Agua!!");}

                    boolean todosDestruidos = true;
                    for (int i = 0; i < tabuleiro.length; i++){
                        for (int j = 0; j < tabuleiro[i].length; j++){
                            if (tabuleiro[i][j] == 1){
                                todosDestruidos = false;
                                break;
                            }
                            if (todosDestruidos){
                                System.out.println("Tu ganaste!!");
                                break;
                            }
                            

                        }
                        

                     }
                     
                }
        }
            



        }
        
    }

