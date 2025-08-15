
import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] scores = new int[n];
            for(int i = 0; i < n; i++){
                scores[i] = sc.nextInt();
            }

            int cutoff = scores[k - 1]; // k-th place score
            int count = 0;
            for(int score : scores){
                if(score >= cutoff && score > 0){
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
