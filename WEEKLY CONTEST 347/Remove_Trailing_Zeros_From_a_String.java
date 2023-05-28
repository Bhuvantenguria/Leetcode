import java.util.Scanner;

public class Remove_Trailing_Zeros_From_a_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println( removeTrailingZeros(str) ) ;
        sc.close();
    }

    public static String removeTrailingZeros(String num) {
        String ans = "";
        int i = num.length()-1 ;
        for(;i>=0 && num.charAt(i) == '0' ; i--);
        if(i==num.length()-1)
            return num ;
        ans = num.substring(0,i+1);
        return ans ;
    }
}
