/* Program to calculate the area and perimeter of different shapes. */

import java.util.Scanner;
import java.lang.Math;

class ArifTask4{

    public Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        ArifTask4 a = new ArifTask4();
        int i = 0;
        int cases = 0;
        while(cases!=11){
            System.out.println("1. Area of Circle\n2. Circumference of Circle\n3. Area of Rectangle\n4. Volume of Sphere\n5. Surface Area of Sphere\n6. Area of Square\n7. Area of Right Angled Triangle\n8. Area of Equilateral Triangle\n9. Perimeter of Rectangle\n10. Area of Triangle\n11. Exit");
            cases = a.sc.nextInt();
            switch(cases){
                case 1:
                    a.areaOfCircle();
                    break;
                case 2:
                    a.circumferenceOfCircle();
                    break;
                case 3:
                    a.areaOfRectangle();
                    break;
                case 4:
                    a.volumeOfSphere();
                    break;
                case 5:
                    a.surfaceAreaOfSphere();
                    break;
                case 6:
                    a.areaOfSquare();
                    break;
                case 7:
                    a.areaOfRightAngleTriangle();
                    break;
                case 8:
                    a.areaOfEquilateralTriangle();
                    break;
                case 9:
                    a.perimeterOfRectangle();
                    break;
                case 10:
                    a.areaOfTriangle();
                    break;
                case 11:
                    break;
                default:
                    System.out.println("Enter a valid choice!");
            }
        }
    }

    void areaOfCircle(){
        int r;
        System.out.println("Enter the Radius: ");
        r = sc.nextInt();
        System.out.println("The area of circle is: " +(3.14*r*r));
    }

    void circumferenceOfCircle(){
        int r;
        System.out.println("Enter the Radius: ");
        r = sc.nextInt();
        System.out.println("The Circumference of circle is: " +(3.14*2*r));
    }

    void areaOfRectangle(){
        int b, l;
        System.out.println("Enter the Breadth: ");
        b = sc.nextInt();
        System.out.println("Enter the Length: ");
        l = sc.nextInt();
        System.out.println("The area of Rectangle is: " +(b*l));
    }

    void volumeOfSphere(){
        int r;
        System.out.println("Enter the Radius: ");
        r = sc.nextInt();
        System.out.println("The Volume of Sphere is: " +(3.14*1.33*r*r*r));
    }

    void surfaceAreaOfSphere(){
        int r;
        System.out.println("Enter the Radius: ");
        r = sc.nextInt();
        System.out.println("The Surface Area of Sphere is: " +(4*3.14*r*r));
    }

    void areaOfSquare(){
        int s;
        System.out.println("Enter the Side: ");
        s = sc.nextInt();
        System.out.println("The area of Square is: " +(s*s));
    }

    void areaOfRightAngleTriangle(){
        int b, h;
        System.out.println("Enter the Base: ");
        b = sc.nextInt();
        System.out.println("Enter the Height: ");
        h = sc.nextInt();
        System.out.println("The area of Right Angled Triangle is: " +(0.5*b*h));
    }

    void areaOfEquilateralTriangle(){
        int s;
        System.out.println("Enter the Side: ");
        s = sc.nextInt();
        System.out.println("The area of Equilateral Triangle is: " +(0.433*s*s));
    }

    void perimeterOfRectangle(){
        int b, l;
        System.out.println("Enter the Breadth: ");
        b = sc.nextInt();
        System.out.println("Enter the Length: ");
        l = sc.nextInt();
        System.out.println("The perimeter of Rectangle is: " +(2*(b+l)));
    }

    void areaOfTriangle(){
        int a, b, c;
        float s;
        System.out.println("Enter the first side of triangle: ");
        a = sc.nextInt();
        System.out.println("Enter the second side of triangle: ");
        b = sc.nextInt();
        System.out.println("Enter the third side of triangle: ");
        c = sc.nextInt();
        s = (float)(a+b+c)/2;
        System.out.println("The area of triangle is: " +Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}