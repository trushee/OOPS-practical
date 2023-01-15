import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 for Addition");
        System.out.println("2 for divide");
        System.out.println("3 for mod");
        System.out.println("4 for sin");
        System.out.println("5 for cosine");
        System.out.println("6 for tan");
        System.out.println("7 for exp");
        System.out.println("8 for nth root");
        System.out.println("9 for multiplication");
        System.out.println("Enter the operation you want to perform:");
        int op = sc.nextInt();

        System.out.println("How many numbers do you want to input?");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        switch (op) {
            case 1:
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += arr[i];
                }
                System.out.println("Sum is " + sum);
                break;
            case 2:
                System.out.println("Which two indices you want to divide?");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Division is " + (arr[a] / arr[b]));
                break;
            case 3:
                System.out.println("Which two indices you want to do mod on?");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("Mod is " + (arr[a] % arr[b]));
                break;
            case 4:
                for (int i = 0; i < n; i++) {
                    System.out.println("The sin of " + arr[i] + " is " + Math.sin(arr[i]));
                }
                break;
            case 5:
                for (int i = 0; i < n; i++) {
                    System.out.println("The cosine of " + arr[i] + " is " + Math.cos(arr[i]));
                }
                break;
            case 6:
                for (int i = 0; i < n; i++) {
                    System.out.println("The tan of " + arr[i] + " is " + Math.tan(arr[i]));
                }
                break;
            case 7:
                for (int i = 0; i < n; i++) {
                    System.out.println("The exponent of " + arr[i] + " is " + Math.exp(arr[i]));
                }
                break;
            case 8:
                System.out.println("Enter the value of n in nth root:");
                int num = sc.nextInt();
                double c = (1.0 / num);
                for(int i = 0 ; i<n ; i++){
                    System.out.println("The nth root of "+arr[i]+" is "+ Math.pow(arr[i],c));
                    }
                break;
            case 9:
                int mul = 0;
                for (int i = 0; i < n; i++) {
                    mul *= arr[i];
                }
                System.out.println("The product is " + mul);
                break;
        }
    }
}
