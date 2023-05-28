import java.util.Scanner;

public class Minimum_Cost_to_Make_All_Characters_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println( minimumCost(str) ) ;
        sc.close();
    }
    public static long minimumCost(String s) {
        long a = 0 ;
        int i = 0 ;
        while(i < s.length()-1 )
        {
            if(s.charAt(i)!=s.charAt(i+1))
                a+=Math.min(i+1,s.length()-i-1);
            i++;
            
        }
        return a;
    }
}
