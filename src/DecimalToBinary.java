import java.util.Scanner;
// added input validation

public class DecimalToBinary {
    public static void main(String[] args){
    // minor changes
    // done
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bin = "";
        int num = n;
        if(num == 0) bin = "0";
        while(num > 0){
            bin = (num % 2) + bin;
            num = num / 2;
        }
        System.out.println("binary: " + bin);
        sc.close();
    }
}
