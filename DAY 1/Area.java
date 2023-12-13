import java.util.*;

public class Area {
    Scanner sc=new Scanner(System.in);
    

    public void areaOfCircle(){
        float pi=3.14f;
        System.out.println("Enter Radius");
        int r=sc.nextInt();
        System.out.println("Area of Circle is "+(pi*r*r));
    }

    public void areaOfRectangle(){
        System.out.println("enter breadth");
        int b=sc.nextInt();
        System.out.println("enter height");
        int h=sc.nextInt();
        System.out.println("Area of Rectangle "+(b*h));
    }

    public void areaOfSquare(){
        System.out.println("enter side");
        int s=sc.nextInt();
        System.out.println("Area of Square "+(s*s)); 
    }

    public void areaOfRAtriangle(){
        System.out.println("enter height");
        int h=sc.nextInt();
        
        System.out.println("enter base");
        int b=sc.nextInt();
        System.out.println("Area of Right Angle Triangle "+(0.5*b*h));
    }

    public void areaOfEquiTriangle(){
        System.out.println("enter side");
        int s=sc.nextInt();
        System.out.println("Area of Equilateral triangle is "+(0.4330122*s*s));
    }

    public void perimeterOfRectangle(){
        System.out.println("enter breadth");
        int b=sc.nextInt();
        System.out.println("enter height");
        int h=sc.nextInt();
        System.out.println("Perimeter of Rectangle "+(2*(b+h)));
    }


    public static void main(String[] arrgs){
        Area a=new Area();
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Circle\n2.Eui\n3.Ratri\n4.Rectangle\n5.square\n6.Perimeterre rectangle");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                a.areaOfCircle();
                break;
            case 2:
                a.areaOfEquiTriangle();
                break;
            case 3:
                a.areaOfRAtriangle();
                break;
            case 4:
                a.areaOfRectangle();
                break;
            case 5:
                a.areaOfSquare();
                break;
            case 6:
                a.perimeterOfRectangle();
                break;
            
        
            default:
                System.out.println("enter valid choice");
                break;
        }
        
        /*a.areaOfEquiTriangle();
        a.areaOfRAtriangle();
        a.areaOfRectangle();
        a.areaOfSquare();
        a.perimeterOfRectangle();*/

    }
}

