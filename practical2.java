import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

//Rectangle class
class Rectangle extends Canvas{

    //frame
    public static void drawShape(){
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Rectangle();
        canvas.setSize(1000, 1000);
        frame.add(canvas);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    //painting the rectangle
    public void paint(Graphics g){
        Scanner scn =  new Scanner(System.in);

        //input dimensions
        System.out.println("enter dimensions: ");
        int x = scn.nextInt();
        int y = scn.nextInt();

        //input the color of the shape
        System.out.println("Enter the color in rgb format separated by space");
        int r = scn.nextInt();
        int gc = scn.nextInt();
        int b = scn.nextInt();
        Color newcolor = new Color(r,gc,b);

        //width of the border
        System.out.println("enter the width of the border you want");
        int w = scn.nextInt();
        Stroke customStroke = new BasicStroke(w, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        ((Graphics2D) g).setStroke(customStroke);

        //color of the border
        System.out.println("Enter the color of border in rgb format separated by space");
        int r1 = scn.nextInt();
        int g1 = scn.nextInt();
        int b1 = scn.nextInt();

        //text inside the rectangle
        Color newcolor2 = new Color(r1,g1,b1);
        System.out.println("What text do you want to write inside the shape: ");
        String text = scn.next();

        g.setColor(newcolor);
        g.fillRect(200, 200, x, y);
        g.setColor(newcolor2);
        g.drawRect(200,200,x,y);
        g.drawString(text, 250, 250);

        System.out.println("The rectangle has been successfully drawn");

    }
}

//Oval class
class Oval extends Canvas{

    //frame class
    public static void drawShape(){
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Oval();
        canvas.setSize(1000, 1000);
        frame.add(canvas);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    //painting the oval
    public void paint(Graphics g){

        Scanner scn =  new Scanner(System.in);
        //input the dimensions
        System.out.println("enter dimensions: ");
        int x = scn.nextInt();
        int y = scn.nextInt();

        //input the color of the shape
        System.out.println("Enter the color in rgb format separated by space");
        int r = scn.nextInt();
        int gc = scn.nextInt();
        int b = scn.nextInt();
        Color newcolor = new Color(r,gc,b);

        //width of the border
        System.out.println("enter the width of the border you want");
        int w = scn.nextInt();
        Stroke customStroke = new BasicStroke(w, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        ((Graphics2D) g).setStroke(customStroke);

        //color of the border
        System.out.println("Enter the color of border in rgb format separated by space");
        int r1 = scn.nextInt();
        int g1 = scn.nextInt();
        int b1 = scn.nextInt();

        Color newcolor2 = new Color(r1,g1,b1);

        //text inside the oval
        System.out.println("What text do you want to write inside the shape: ");
        String text = scn.next();

        g.setColor(newcolor);
        g.fillOval(200, 200, x, y);
        g.setColor(newcolor2);
        g.drawOval(200,200,x,y);
        g.drawString(text, 250, 250);

        System.out.println("The oval has been successfully drawn");


    }
}

class Square extends Canvas{

    //frame class
    public static void drawShape(){
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Square();
        canvas.setSize(1000, 1000);
        frame.add(canvas);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    //painting the oval
    public void paint(Graphics g){

        Scanner scn =  new Scanner(System.in);
        //input the dimensions
        System.out.println("enter dimension of the square: ");
        int x = scn.nextInt();
//        int y = scn.nextInt();

        //input the color of the shape
        System.out.println("Enter the color in rgb format separated by space");
        int r = scn.nextInt();
        int gc = scn.nextInt();
        int b = scn.nextInt();
        Color newcolor = new Color(r,gc,b);

        //width of the border
        System.out.println("enter the width of the border you want");
        int w = scn.nextInt();
        Stroke customStroke = new BasicStroke(w, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        ((Graphics2D) g).setStroke(customStroke);

        //color of the border
        System.out.println("Enter the color of border in rgb format separated by space");
        int r1 = scn.nextInt();
        int g1 = scn.nextInt();
        int b1 = scn.nextInt();

        Color newcolor2 = new Color(r1,g1,b1);

        //text inside the oval
        System.out.println("What text do you want to write inside the shape: ");
        String text = scn.next();

        g.setColor(newcolor);
        g.fillRect(200, 200, x, x);
        g.setColor(newcolor2);
        g.drawRect(200,200,x,x);
        g.drawString(text, 250, 250);

        System.out.println("The square has been successfully drawn");


    }
}

class Triangle extends Canvas{

    //frame class
    public static void drawShape(){
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Triangle();
        canvas.setSize(1000, 1000);
        frame.add(canvas);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    //painting the triangle
    public void paint(Graphics g){

        Scanner scn =  new Scanner(System.in);
        //input the dimensions
        System.out.println("enter the coordinates of vertices of triangle: \n point 1:  ");
        int x1 = scn.nextInt();
        int y1 = scn.nextInt();
        System.out.println("point 2:");
        int x2 = scn.nextInt();
        int y2 = scn.nextInt();
        System.out.println("point 3:");
        int x3 = scn.nextInt();
        int y3 = scn.nextInt();

        //input the color of the shape
        System.out.println("Enter the color in rgb format separated by space");
        int r = scn.nextInt();
        int gc = scn.nextInt();
        int b = scn.nextInt();
        Color newcolor = new Color(r,gc,b);

        //width of the border
        System.out.println("enter the width of the border you want");
        int w = scn.nextInt();
        Stroke customStroke = new BasicStroke(w, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        ((Graphics2D) g).setStroke(customStroke);

        //color of the border
        System.out.println("Enter the color of border in rgb format separated by space");
        int r1 = scn.nextInt();
        int g1 = scn.nextInt();
        int b1 = scn.nextInt();

        Color newcolor2 = new Color(r1,g1,b1);

        //text inside the oval
        System.out.println("What text do you want to write inside the shape: ");
        String text = scn.next();

        int[] xPoints = {x1, x2, x3};
        int[] yPoints = {y1, y2, y3};
        g.setColor(newcolor);
        g.fillPolygon(xPoints, yPoints, 3);
        g.setColor(newcolor2);
        g.drawPolygon(xPoints, yPoints, 3);

        g.setColor(Color.BLACK);
        g.drawString(text, x1+5, y1+5);

        System.out.println("The triangle has been successfully drawn");


    }
}

class Polygon extends Canvas{

    //frame class
    public static void drawShape(){
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Polygon();
        canvas.setSize(1000, 1000);
        frame.add(canvas);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    //painting the polygon
    public void paint(Graphics g){

        Scanner scn =  new Scanner(System.in);
        //input the dimensions
        System.out.println("enter the number of sides:   ");
        int sides = scn.nextInt();

        //input the color of the shape
        System.out.println("Enter the color in rgb format separated by space");
        int r = scn.nextInt();
        int gc = scn.nextInt();
        int b = scn.nextInt();
        Color newcolor = new Color(r,gc,b);

        //width of the border
        System.out.println("enter the width of the border you want");
        int w = scn.nextInt();
        Stroke customStroke = new BasicStroke(w, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        ((Graphics2D) g).setStroke(customStroke);

        //color of the border
        System.out.println("Enter the color of border in rgb format separated by space");
        int r1 = scn.nextInt();
        int g1 = scn.nextInt();
        int b1 = scn.nextInt();

        Color newcolor2 = new Color(r1,g1,b1);

        //text inside the oval
        System.out.println("What text do you want to write inside the shape: ");
        String text = scn.next();

        int[] xPoints = new int[sides];
        int[] yPoints = new int[sides];
        int radius = 50;
        int xCenter = 100;
        int yCenter = 200;
        double angle = 2 * Math.PI / sides;
        for (int i = 0; i < sides; i++) {
            xPoints[i] = (int) (xCenter + radius * Math.cos(i * angle));
            yPoints[i] = (int) (yCenter + radius * Math.sin(i * angle));
        }
        g.setColor(newcolor);
        g.fillPolygon(xPoints, yPoints, sides);
        g.setColor(newcolor2);
        g.drawPolygon(xPoints, yPoints, sides);

        g.setColor(Color.BLACK);
        g.drawString(text, xCenter - 25, yCenter + 60);



        System.out.println("The polygon has been successfully drawn");


    }
}



public class Main2 {

    public static void main(String[] args) {
        System.out.println("Enter the shape:");
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();
        switch(shape){
            case "rectangle":
                Rectangle app = new Rectangle();
                app.drawShape();
                break;

            case "oval":
                Oval app2 = new Oval();
                app2.drawShape();
                break;

            case "sqaure":
                Square app3 = new Square();
                app3.drawShape();
                break;

            case "triangle":
                Triangle triangle = new Triangle();
                triangle.drawShape();
                break;

            case "polygon":
                Polygon polygon = new Polygon();
                polygon.drawShape();
                break;
        }



    }
