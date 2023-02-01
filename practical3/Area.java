public class Area {
    public static void calcArea(int a){
        System.out.println("The area of square of is : "+a*a);
        System.out.println("The perimeter of square is : "+ 4*a);

    }
    public static void calcArea(double a){
        System.out.println("The area of circle is: "+(double)Math.PI*a*a);
        System.out.println("The perimeter of circle is: "+(double)2*Math.PI*a);
    }
    public static void calcArea(double a, double b){
        System.out.println("The area of rectangle is: "+a*b);
        System.out.println("The perimeter of rectangle is: "+2*(a+b));

    }
    public static void calcArea(int a,int b , int c ){
        int s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of triangle is: "+area);
        System.out.println("The perimeter of triangle is: "+a+b+c);
    }
    public static void calcArea(int a,int b){
        double angle= Math.toRadians(180/a);
        angle=Math.tan(angle);
        double area=((b*b*a)/(4*angle));
        System.out.println("The area of polygon is: "+area);
        System.out.println("The perimeter of polygon is: "+a*b);
    }
}
