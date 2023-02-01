import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Whose area do you want to find? ");
        String shape = scn.nextLine();
        Area area = new Area();
        switch(shape){
            case "circle":
                System.out.println("Enter the radius of the circle: ");
                double r = scn.nextDouble();
                area.calcArea(r);
                break;
            case "rectangle":
                System.out.println("Enter the width and length of the rectangle: ");
                double w = scn.nextDouble();
                double l =  scn.nextDouble();
                area.calcArea(w,l);
                break;
            case "square":
                System.out.println("Enter the side of square: ");
                int z = scn.nextInt();
                area.calcArea(z);
                break;
            case "triangle":
                System.out.println("Enter the values of a, b, c: ");
                int a = scn.nextInt();
                int b = scn.nextInt();
                int c = scn.nextInt();
                area.calcArea(a,b,c);
                break;
            case "polygon":
                System.out.println("how many sides of the polygon: ");
                int n = scn.nextInt();
                System.out.println("Enter the length: ");
                int s = scn.nextInt();
                area.calcArea(n,s);
                break;
        }
    }
}
