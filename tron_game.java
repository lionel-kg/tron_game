import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int map[][] = new int[30][20];
        // game loop
        initGame(map);
        int posX , posY;
        while (true) {
            int N = in.nextInt(); // total number of players (2 to 4).
            int P = in.nextInt(); // your player number (0 to 3).
           // System.err.println(P);
           
            for (int i = 0; i < N; i++) {
                int X0 = in.nextInt(); // starting X coordinate of lightcycle (or -1)
                int Y0 = in.nextInt(); // starting Y coordinate of lightcycle (or -1)
                int X1 = in.nextInt(); // starting X coordinate of lightcycle (can be the same as X0 if you play before this player)
                int Y1 = in.nextInt(); // starting Y coordinate of lightcycle (can be the same as Y0 if you play before this player)
               
                System.err.println("Y1 ="+Y1);
                System.err.println("X1 ="+X1); 
                posX = X1;
                posY = Y1;
                map[X1][Y1] = 1;
            }
            if(posX == 0 ){
                System.out.println("RIGHT");
            }
            showMap(map);
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            System.out.println("LEFT"); // A single line with UP, DOWN, LEFT or RIGHT  
        }
    }
    
    public static void initGame(int[][] map){
        for(int i = 0; i < 20 ;i++){
            for(int j = 0 ; j < 30 ; j++){
                map[j][i] = 0; 
            }
        }
    }
    public static void showMap(int[][] map){
         for(int i = 0; i < 20 ;i++){
            for(int j = 0 ; j < 30 ; j++){
                System.err.print(map[j][i]);
            }
            System.err.println(); 
        }
    }
}