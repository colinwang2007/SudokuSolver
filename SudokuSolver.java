import java.util.*;
import java.io.*;

public class SudokuSolver {
    static StringTokenizer st;
    static BufferedReader br;
    static PrintWriter out;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int[][] board = new int[9][9];
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                board[i][j]=nextInt();
            }
        }

        process(board,0);
        out.close();
    }
    static void process(int[][] b, int cell){
        if(cell>=81){
            print(b);
            System.out.println();
        }
        else{
            int x = cell/9;
            int y = cell%9;
            if(b[x][y]==0){
                int[] available = new int[10];
                for(int i=0; i<9; i++){
                    available[b[i][y]]=1; //column
                    available[b[x][i]]=1; //row
                }
                int sX = (x/3)*3;
                int sY = (y/3)*3;
                for(int i=sX; i<sX+3; i++){
                    for(int j=sY; j<sY+3; j++){
                        available[b[i][j]]=1;  //square
                    }
                }
                for(int i=1; i<10; i++){
                    if(available[i]==0){
                        b[x][y]=i;
                        process(b,cell+1);
                    }
                }
                b[x][y]=0;
            }
            else{
                process(b,cell+1);
            }
        }
    }
    static void print(int[][] b){
        for(int[] i:b){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
