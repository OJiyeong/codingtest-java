import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(b != 0) {
            for(int i = 0; i < a; i++) System.out.print("*");
            b--;
            System.out.println("");
        }
    }
}