package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TesteShape {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enteder the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Shape #" + i + " data:" );
            sc.nextLine();
            System.out.print("Rectangle pr Circle (r/c)? ");
            char ch = sc.next().toLowerCase().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Heigth: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            }
            else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape : list){
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();
    }
}
