import java.util.Scanner;

class Square{
    public int calcArea(int a){
        return a*a;
    }
}
class Triangle{
    public double calcArea(int a, int b, int c){
        int s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
class Rectangle{
    public int calcArea(int a,int b){
        return a*b;
    }
}
class Circle{
    public double calcArea(int a){
        return (Math.PI*a*a);
    }
}
class Polygon{
    public double calcArea(int a , int b){
        double angle= Math.toRadians(180/a);
        angle=Math.tan(angle);
        double area=((b*b*a)/(4*angle));
        return area;
    }
}

class Sphere{
    public double calcArea(double a){
        return 4*Math.PI*a*a;
    }
}

class Hut{
    public double calcArea(int a, int b,int c){
        Rectangle rectangle = new Rectangle();
        int areaRec = rectangle.calcArea(a,b);
        Triangle triangle = new Triangle();
        double areaTri = triangle.calcArea(c,c,a);
        double hutArea = areaTri+areaRec;
        return hutArea;
    }
}

class Fish{
    public double calcArea(int a , int b){
        Square square = new Square();
        int areaSq = square.calcArea(a);
        Triangle triangle = new Triangle();
        double areatri = triangle.calcArea(b,b,b);
        return areaSq+areatri;
    }
}

class SolarSys{
    public double calcArea(){
        Sphere sphere = new Sphere();
        double mercuryarea = sphere.calcArea(2439.7);
        double venusarea = sphere.calcArea(6051.8);
        double eartharea = sphere.calcArea(6371);
        double marsarea = sphere.calcArea(3389.5);
        double jupiterarea = sphere.calcArea(69911);
        double saturnarea = sphere.calcArea(58232);
        double uranusarea = sphere.calcArea(25362);
        double neptunearea = sphere.calcArea(24622);
        return mercuryarea+venusarea+eartharea+marsarea+jupiterarea+saturnarea+uranusarea+neptunearea;


    }
}
public class ComplexShapes {

    public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
        System.out.println("Enter the shape whose area you want to find: ");
        String shape = scn.nextLine();
        switch(shape){
            case "hut":
                System.out.println("Enter the width and height of the hut: ");
                int a = scn.nextInt();
                int b = scn.nextInt();
                System.out.println("Enter the length of roof of the hut: ");
                int c = scn.nextInt();
                Hut hut = new Hut();
                System.out.println("The area of the hut is: "+hut.calcArea(a,b,c));
                break;
            case "fish":
                System.out.println("Enter the length for the body of the fish which is a square: ");
                int a1 = scn.nextInt();
                System.out.println("Enter the side of triangle which is the fin: ");
                int b1 = scn.nextInt();
                Fish fish = new Fish();
                System.out.println("The area of the fish is: "+fish.calcArea(a1,b1));
                break;
            case "keyboard":
                System.out.println("Enter the height and length of the keyboard: ");
                int a2 = scn.nextInt();
                int b2 = scn.nextInt();
                Rectangle rectangle = new Rectangle();
                System.out.println("The area of keyboard is: "+rectangle.calcArea(a2,b2));
                break;
            case "solar system":
                SolarSys solar = new SolarSys();
                System.out.println("The area of solar system(in kms) is: "+solar.calcArea());
                break;
            }
        }
    }
