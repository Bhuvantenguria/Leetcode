import java.util.HashSet;
import java.util.Scanner;

public class Difference_of_Number_of_Distinct_Values_on_Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int[][] ans = differenceOfDistinctValues(grid);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println( ans[i][j] ) ;
            }
        }
        sc.close();
    }
    public static int[][] differenceOfDistinctValues(int[][] grid) {
        int rc = grid.length;
        int cc = grid[0].length;
        int[][] pairs = new int[rc][cc];
        for(int i =0;i<rc;i++){
            for(int j =0;j<cc;j++){
                HashSet<Integer> pair1 = new HashSet<>();
                  HashSet<Integer> pair2= new HashSet<>();
                int r = i-1;
                int c =j-1;
                while(r>=0 && c>=0 ){
                    pair1.add(grid[r][c]);
                        c--;
                    r--;
                }
                r =i+1;
                c =j+1;
                  while(r<rc && c<cc ){
                    pair2.add(grid[r][c]);
                        c++;
                        r++;
                }
            
                pairs[i][j] = Math.abs(pair1.size()-pair2.size());
            }
        }
        return pairs;
    }
}
