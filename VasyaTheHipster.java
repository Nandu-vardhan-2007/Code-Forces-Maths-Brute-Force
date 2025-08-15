//581A
import java.util.Scanner;
public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int blue = sc.nextInt();
        int fashion = Math.min(red, blue);
        int  nrml = ((red + blue) - 2*fashion)/2;
        System.out.println(fashion);
        if(((red + blue) - 2*fashion)<=1){
            System.out.println("0");
        }
        else{
            System.out.println(nrml);
        }
    }
}
