package string.problems;
import java.util.*;
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        System.out.println("The permutation of the given string are :");
        find_permutations(str, "");
    }
    static void find_permutations(String str,String res){
        if (str.length() == 0){
            System.out.print(res + " ");
            return;
        }
        boolean flag[] = new boolean[26];
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String rem_str = str.substring(0, i) + str.substring(i + 1);
            if (flag[ch - 'A'] == false)
                find_permutations(rem_str, res + ch);
            flag[ch - 'A'] = true;
        }
    }
}
