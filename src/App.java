import java.util.*;
 class Largestfrom3 {
    public static void main(String[]args) {
        int a,b,c,largest;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        a = sc.nextInt();

        
        System.out.print("Enter First Number: ");
        b = sc.nextInt();

        
        System.out.print("Enter First Number: ");
        c = sc.nextInt();

        if (a>b && a>c) {
            largest = a;
        
        } else if (b>a && b>c) {
            largest=b;
        } else {
            largest = c;
        }
        System.out.print("Largest number is:"+ largest);
    }

}
