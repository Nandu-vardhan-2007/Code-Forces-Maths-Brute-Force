//546A
import java.util.Scanner;
public class SoliderAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = 0;
        for(int i = 1;i<=c;i++){
            total = total + (a*i);
        }
        int req = total -b;
        if(req <0)
        {
            System.out.println("0");
        }
        else{
            System.out.println(req);
        }
    }
}
