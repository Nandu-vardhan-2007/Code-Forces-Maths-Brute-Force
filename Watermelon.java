

import java.util.Scanner;

public class Watermelon{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            if(x>2 && x%2==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

